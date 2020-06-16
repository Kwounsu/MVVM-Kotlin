package com.example.mvvmkotlin.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mvvmkotlin.model.MessageData

class MsgViewModel: ViewModel() {
    fun getMsg(msg: MessageData): String {
        return msg.msg
    }
}