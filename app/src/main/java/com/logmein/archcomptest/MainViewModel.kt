package com.logmein.archcomptest

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import java.util.concurrent.TimeUnit

class MainViewModel : ViewModel() {

    val message: MutableLiveData<String> = MutableLiveData()

    init {
        Flowable.timer(2, TimeUnit.SECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ message.setValue("Changed value") })
    }
}