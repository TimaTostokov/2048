package jolchu.tolik.a2048.pref

import android.content.Context
import android.content.SharedPreferences

class MyPref private constructor(context: Context) {

    companion object {
        var sharedpreference: SharedPreferences? = null
        var mypref: MyPref? = null

        fun init(context: Context) {
            mypref = MyPref(context)
        }

        fun getSharedPref(): SharedPreferences? = sharedpreference
    }

    init {
        sharedpreference = context.getSharedPreferences("MyPref", Context.MODE_PRIVATE)
    }

}