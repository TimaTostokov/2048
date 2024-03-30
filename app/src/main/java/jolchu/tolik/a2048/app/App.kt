package jolchu.tolik.a2048.app

import android.app.Application
import jolchu.tolik.a2048.pref.MyPref

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        MyPref.init(this)
    }

}