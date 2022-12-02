package com.valneyfaria.estudosdetestesunitarios

import android.app.Application
import com.valneyfaria.estudosdetestesunitarios.di.component.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class EstudosTestesApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@EstudosTestesApplication)
            modules(appModule)
        }
    }
}
