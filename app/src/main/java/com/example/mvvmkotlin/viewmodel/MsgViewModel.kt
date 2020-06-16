package com.example.mvvmkotlin.viewmodel

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.ViewModel
import com.example.mvvmkotlin.model.MessageData

class MsgViewModel: ViewModel() {
    fun getMsg(msg: MessageData): String {
        return msg.msg
    }

    fun sendMsg(context:Context, theClass:Class<*>, theMap:Map<String,MessageData>):Intent {
        val intent = Intent(context, theClass)
        for (i in theMap) {
            intent.putExtra(i.key,i.value.msg)
        }
        return intent
    }

    fun receiveMsg(intent: Intent, key: String): Any?{
        val bundle: Bundle? = intent.extras
        return bundle?.get(key)
    }
}