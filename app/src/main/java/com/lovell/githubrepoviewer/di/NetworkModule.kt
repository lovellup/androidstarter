package com.lovell.githubrepoviewer.di

import com.lovell.network.UserService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {
    private val baseUrl = "https://api.github.com"

    @Provides
    @Singleton
    fun provideRetrofit(client: OkHttpClient): Retrofit =
            Retrofit.Builder()
                .client(client)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()

    @Provides
    @Singleton
    fun provideUserService(retrofit: Retrofit) = retrofit.create(UserService::class.java)

    @Provides
    @Singleton
    fun provideHttpClient(): OkHttpClient = OkHttpClient.Builder().build()
}