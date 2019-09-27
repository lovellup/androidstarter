package com.lovell.githubrepoviewer

import androidx.multidex.MultiDexApplication
import com.lovell.githubrepoviewer.di.AppComponent
import com.lovell.githubrepoviewer.di.DaggerAppComponent

class MyApplication : MultiDexApplication() {
    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
        appComponent.injectApplication(this)
    }
}