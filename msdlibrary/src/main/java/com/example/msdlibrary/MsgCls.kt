package com.example.msdlibrary

import android.content.Context
import android.widget.Toast

class MsgCls {
    companion object{
        fun showMSDMessage(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}