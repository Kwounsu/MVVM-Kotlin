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

    fun sendMsg(context:Context, theClass:Class<*>, key:String, msg:MessageData):Intent {
        val intent = Intent(context, theClass)
        intent.putExtra(key,msg.msg)
        return intent
    }

    fun sendMsg(context:Context, theClass:Class<*>, key:String, msg:MessageData, key2:String, msg2:MessageData):Intent {
        val intent = Intent(context, theClass)
        intent.putExtra(key,msg.msg)
        intent.putExtra(key2,msg2.msg)
        return intent
    }

    fun receiveMsg(intent: Intent, key: String): Any?{
        val bundle: Bundle? = intent.extras
        return bundle?.get(key)
    }
}