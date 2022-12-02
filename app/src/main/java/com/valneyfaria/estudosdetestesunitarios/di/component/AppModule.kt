package com.valneyfaria.estudosdetestesunitarios.di.component

import com.valneyfaria.estudosdetestesunitarios.ui.home.HomeFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel {
        HomeFragmentViewModel()
    }
}
