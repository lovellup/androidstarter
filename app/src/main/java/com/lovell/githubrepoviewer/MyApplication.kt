package com.lovell.githubrepoviewer

import android.app.Application
import com.lovell.githubrepoviewer.di.AppComponent
import com.lovell.githubrepoviewer.di.DaggerAppComponent

class MyApplication : Application() {
    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
        appComponent.injectApplication(this)
    }
}