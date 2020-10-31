package com.example.lib_test

import android.content.Context
import android.widget.Toast

class Hello {
    fun toast(context: Context) {
        Toast.makeText(context,"我是測試模塊",Toast.LENGTH_SHORT).show()
    }
}