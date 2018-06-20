package com.logmein.archcomptest

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import io.reactivex.android.schedulers.AndroidSchedulers

class MainViewModel(messageSource: MessageSource) : ViewModel() {

    val message: MutableLiveData<String> = MutableLiveData()

    init {
        messageSource.message
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ newMessage -> message.setValue(newMessage) })
    }
}