package code.hyunwa.clone_tokped.util

import android.app.Application
import code.hyunwa.clone_tokped.core.di.appModule
import code.hyunwa.clone_tokped.core.di.repositoryModule
import code.hyunwa.clone_tokped.core.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(listOf(appModule, viewModelModule, repositoryModule))
        }
    }
}