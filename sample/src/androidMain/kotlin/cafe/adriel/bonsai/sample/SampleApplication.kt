package cafe.adriel.bonsai.sample

import android.app.Application
import android.content.Context

class SampleApplication : Application() {
    companion object {
        private lateinit var instance: SampleApplication

        fun getContext(): Context {
            return instance.applicationContext
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}
