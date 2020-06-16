package com.example.mvvmkotlin.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmkotlin.R
import com.example.mvvmkotlin.model.MessageData
import com.example.mvvmkotlin.viewmodel.MsgViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var msgViewModel: MsgViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        msgViewModel = ViewModelProviders.of(this).get(MsgViewModel::class.java)

        button_MVVM.setOnClickListener {
            val mMessage = MessageData(editText_1.text.toString())
            val mMessage2 = MessageData(editText_2.text.toString())
            msgViewModel.getMsg(mMessage)
            msgViewModel.getMsg(mMessage2)
            Toast.makeText(this, mMessage.msg + mMessage2.msg,Toast.LENGTH_SHORT).show()
        }
    }
}