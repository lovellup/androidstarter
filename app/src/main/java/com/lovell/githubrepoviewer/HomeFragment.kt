package com.lovell.githubrepoviewer


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.lovell.githubrepoviewer.repolist.UserRepoListViewModel

class HomeFragment : Fragment() {

    private val viewModel: UserRepoListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        MyApplication.appComponent.injectHomeFragment(this)
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onResume() {
        super.onResume()
        viewModel.fetchData()
    }

}
