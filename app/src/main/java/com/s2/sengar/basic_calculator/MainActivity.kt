package com.s2.sengar.basic_calculator

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.properties.Delegates
import android.widget.Toast.makeText as toastMakeText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a:String=""
        var temp=0
        dig0.setOnClickListener{
            if(a.isEmpty()){
                a="0"
            }else{
                a += "0"
            }
            result.apply{
                text=a
            }
        }
        dig1.setOnClickListener{
            if(a.isEmpty()){
                a="1"
            }else{
                a += "1";
            }
            result.apply{
                text=a
            }
        }
        dig2.setOnClickListener{
            if(a.isEmpty()){
                a="2"
            }else{
                a +="2";
            }
            result.apply{
                text=a
            }
        }
        dig3.setOnClickListener{
            if(a.isEmpty()){
                a="3"
            }else{
                a += "3";
            }
            result.apply{
                text=a
            }
        }
        dig4.setOnClickListener{
            if(a.isEmpty()){
                a="4"
            }else{
                a += "4";
            }
            result.apply{
                text=a
            }
        }
        dig5.setOnClickListener{
            if(a.isEmpty()){
                a="5"
            }else{
                a += "5"
            }
            result.apply{
                text=a
            }
        }
        dig6.setOnClickListener{
            if(a.isEmpty()){
                a="6"
            }else{
                a += "6";
            }
            result.apply{
                text=a
            }
        }
        dig7.setOnClickListener{
            if(a.isEmpty()){
                a="7"
            }else{
                a += "7";
            }
            result.apply{
                text=a
            }
        }
        dig8.setOnClickListener{
            if(a.isEmpty()){
                a="8"
            }else{
                a += "8";
            }
            result.apply{
                text=a
            }

            Log.i("Button", a)
        }
        dig9.setOnClickListener{
            if(a.isEmpty()){
                a="9"
            }else{
                a += "9";
            }
            result.apply{
                text=a
            }
        }
        clear.setOnClickListener {
            a="";
            result.apply{
                text=a
            }
        }
        cancle.setOnClickListener{
            a.dropLast(1).also { a = it }
            result.apply{
                text=a
            }
        }
//      Airthmetic Operation Buttons
        mod.setOnClickListener {
            if(!a.isEmpty()){
                a += "%"
                result.apply{
                    text=a
                }
            }
        }
        div.setOnClickListener {
            if(!a.isEmpty()){
                a+="/"
                result.apply{
                    text=a
                }
            }
        }
        multiply.setOnClickListener {
            if(!a.isEmpty()) {
                a+="*"
                result.apply {
                    text = a
                }
            }
        }
        sub.setOnClickListener {
            if(!a.isEmpty()){
                a+="-"
                result.apply{
                    text=a
                }
            }
        }
        add.setOnClickListener {
            a+="+"
            if(!a.isEmpty()){
                result.apply{
                    text=a
                }
            }
        }

        equals.setOnClickListener {
        //calculate result
        }










    }


}


