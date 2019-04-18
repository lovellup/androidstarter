package com.lovell.githubrepoviewer.di

import com.lovell.githubrepoviewer.MyApplication
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

@Module
class AppModule @Inject constructor(private val application: MyApplication) {
    @Provides
    @Singleton
    fun providesApplication(): MyApplication = application
}