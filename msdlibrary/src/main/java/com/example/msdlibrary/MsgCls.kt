package com.example.msdlibrary

import android.content.Context
import android.widget.Toast

public class MsgCls {
    companion object{
        fun ShowMSDMessage(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }

}