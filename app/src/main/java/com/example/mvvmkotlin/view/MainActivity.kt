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
    var mMessage:MessageData?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        msgViewModel = ViewModelProviders.of(this).get(MsgViewModel::class.java)

        button_MVVM.setOnClickListener {
            mMessage = MessageData(editText_MVVM.text.toString())
            msgViewModel.getMsg(mMessage!!)
            Toast.makeText(this, mMessage!!.msg,Toast.LENGTH_SHORT).show()
        }
    }
}