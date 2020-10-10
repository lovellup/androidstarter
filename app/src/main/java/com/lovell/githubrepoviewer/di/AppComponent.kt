package com.lovell.githubrepoviewer.di

import com.lovell.githubrepoviewer.HomeFragment
import com.lovell.githubrepoviewer.MainActivity
import com.lovell.githubrepoviewer.MyApplication
import com.lovell.githubrepoviewer.repolist.UserRepoListFragment
import com.lovell.githubrepoviewer.repolist.UserRepoListViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface AppComponent {
    fun injectApplication(application: MyApplication)
    fun injectMainActivity(activity: MainActivity)
    fun injectHomeFragment(homeFragment: HomeFragment)
    fun injectUserRepoListFragment(userRepoListFragment: UserRepoListFragment)
    fun injectUserRepoListViewModel(userRepoListViewModel: UserRepoListViewModel)
}