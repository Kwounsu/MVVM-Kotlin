package com.example.mvvmkotlin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvmkotlin.R
import kotlinx.android.synthetic.main.activity_another.*

class AnotherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)

        val bundle: Bundle? = intent.extras
        val myValue = bundle?.get("key").toString()
        val myValue2 = bundle?.get("key2").toString()
        textView_receive.text = myValue
        textView_receive2.text = myValue2
    }
}