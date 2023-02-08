package com.valneyfaria.helperapp.di.component

import com.valneyfaria.helperapp.ui.home.HomeFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel {
        HomeFragmentViewModel()
    }
}
