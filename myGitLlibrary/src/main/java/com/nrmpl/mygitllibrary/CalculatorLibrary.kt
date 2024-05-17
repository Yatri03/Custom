package com.nrmpl.mygitlibrary

import android.content.Context
import android.widget.Toast

class CalculatorLibrary {

    companion object{
        fun getLocalToast(context:Context,msg: String){
            Toast.makeText(context,msg, Toast.LENGTH_LONG).show()
        }
    }
}