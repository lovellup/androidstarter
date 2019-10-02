package com.lovell.githubrepoviewer.repolist

import androidx.lifecycle.ViewModel
import com.lovell.data.Repository
import com.lovell.githubrepoviewer.MyApplication
import javax.inject.Inject

class UserRepoListViewModel : ViewModel() {

    @Inject
    lateinit var repository: Repository

    init {
        MyApplication.appComponent.injectUserRepoListViewModel(this)
    }

}