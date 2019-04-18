package com.lovell.githubrepoviewer.di

import com.lovell.githubrepoviewer.HomeFragment
import com.lovell.githubrepoviewer.MainActivity
import com.lovell.githubrepoviewer.MyApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [])
interface AppComponent {
    fun injectApplication(application: MyApplication)
    fun injectMainActivity(activity: MainActivity)
    fun injectHomeFragment(homeFragment: HomeFragment)
}