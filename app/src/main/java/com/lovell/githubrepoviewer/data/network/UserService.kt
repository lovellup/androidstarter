package com.lovell.githubrepoviewer.data.network

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Path

interface UserService {
    @GET("users/{user}/repos")
    suspend fun getReposForUser(@Path("user") user: String): ResponseBody
}