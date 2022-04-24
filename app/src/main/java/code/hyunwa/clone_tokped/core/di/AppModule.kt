package code.hyunwa.clone_tokped.core.di

import code.hyunwa.clone_tokped.core.data.source.local.LocalDataSource
import code.hyunwa.clone_tokped.core.data.source.remote.RemoteDataSource
import code.hyunwa.clone_tokped.core.data.source.remote.network.ApiConfig
import org.koin.dsl.module

val appModule = module {
    single { ApiConfig.provideApiService }

    single { RemoteDataSource(get()) }

    single { LocalDataSource() }
}