package com.lovell.githubrepoviewer.repolist

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lovell.githubrepoviewer.data.Repository
import com.lovell.githubrepoviewer.MyApplication
import kotlinx.coroutines.launch
import javax.inject.Inject

class UserRepoListViewModel : ViewModel() {

    @Inject
    lateinit var repository: Repository

    init {
        MyApplication.appComponent.injectUserRepoListViewModel(this)
    }

    fun fetchData() {
        viewModelScope.launch {
            val responseBody = repository.getReposForUser("lovellup")
            Log.d("Lovell", responseBody)
        }
    }

}