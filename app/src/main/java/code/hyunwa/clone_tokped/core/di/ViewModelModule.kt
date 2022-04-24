package code.hyunwa.clone_tokped.core.di

import code.hyunwa.clone_tokped.ui.auth.signin.SignInViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { SignInViewModel(get()) }
}