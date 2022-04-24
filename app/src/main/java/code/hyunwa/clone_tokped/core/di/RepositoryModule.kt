package code.hyunwa.clone_tokped.core.di

import code.hyunwa.clone_tokped.core.data.repository.AppRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { AppRepository(get(), get()) }
}