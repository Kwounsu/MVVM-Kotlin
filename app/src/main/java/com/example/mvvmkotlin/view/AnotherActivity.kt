package com.example.mvvmkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmkotlin.R
import com.example.mvvmkotlin.viewmodel.MsgViewModel
import kotlinx.android.synthetic.main.activity_another.*

class AnotherActivity : AppCompatActivity() {
    lateinit var msgViewModel: MsgViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)

        msgViewModel = ViewModelProviders.of(this).get(MsgViewModel::class.java)

        textView_receive.text = msgViewModel.receiveMsg(intent, "key").toString()
        textView_receive2.text = msgViewModel.receiveMsg(intent, "key2").toString()
    }
}