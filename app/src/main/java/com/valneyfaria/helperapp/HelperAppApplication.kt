package com.valneyfaria.helperapp

import android.app.Application
import com.valneyfaria.helperapp.di.component.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class HelperAppApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@HelperAppApplication)
            modules(appModule)
        }
    }
}
