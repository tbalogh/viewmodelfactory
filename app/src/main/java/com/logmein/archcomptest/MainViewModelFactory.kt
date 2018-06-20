package com.logmein.archcomptest

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class MainViewModelFactory(private val customText: String) : ViewModelProvider.Factory {


    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val messageSource = MessageSource(customText)
        return MainViewModel(messageSource) as T
    }

}