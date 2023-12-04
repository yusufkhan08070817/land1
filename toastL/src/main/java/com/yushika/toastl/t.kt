package com.yushika.toastl

import android.content.Context
import android.widget.Toast

class t {

    constructor(context: Context, msg: Any) {
         Toast.makeText(context,"$msg",Toast.LENGTH_SHORT).show()
    }
}