package com.example.appcontador.views

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainGuiViewModel: ViewModel () {
    private val _contador = MutableLiveData<Int>(0)
    val contador = _contador
    fun incrementaContador(){
        _contador.value = _contador.value?.plus(1)
    }
}