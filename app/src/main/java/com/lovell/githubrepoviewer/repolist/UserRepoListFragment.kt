package com.lovell.githubrepoviewer.repolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.lovell.githubrepoviewer.MyApplication
import javax.inject.Inject

class UserRepoListFragment : Fragment() {
    @Inject
    private lateinit var viewModel: UserRepoListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MyApplication.appComponent.injectUserRepoListFragment(this)
    }
}