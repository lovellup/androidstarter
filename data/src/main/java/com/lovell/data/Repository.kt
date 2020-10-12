package com.lovell.data

import com.lovell.network.UserService
import javax.inject.Inject

class Repository @Inject constructor(
    private val userService: UserService
){
    suspend fun getReposForUser(user: String) : String {
        return userService.getReposForUser(user).toString()
    }
}