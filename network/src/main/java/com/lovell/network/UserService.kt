package com.lovell.network

import io.reactivex.Single
import okhttp3.ResponseBody
import retrofit2.http.GET

interface UserService {
    @GET("users/{user}/repos")
    fun getReposForUser(user: String): Single<ResponseBody>
}