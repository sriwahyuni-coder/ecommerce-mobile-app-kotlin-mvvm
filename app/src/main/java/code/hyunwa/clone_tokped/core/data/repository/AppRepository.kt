package code.hyunwa.clone_tokped.core.data.repository

import android.util.Log
import code.hyunwa.clone_tokped.core.data.source.local.LocalDataSource
import code.hyunwa.clone_tokped.core.data.source.remote.RemoteDataSource
import code.hyunwa.clone_tokped.core.data.source.remote.network.Resource
import kotlinx.coroutines.flow.flow

class AppRepository(val local: LocalDataSource, val remote: RemoteDataSource) {

    fun login(email: String, password: String) = flow {
        try {
            remote.login(email, password).let {
                if (it.isSuccessful) {
                    val body = it.body()
                    emit(Resource.success(body))
                    Log.e("SUCCESS", "DATA: " + body.toString() )
                } else {
                    emit(Resource.error(it.message(), null))
                    Log.e("ERROR", "it_message: " + it.message())
                }
            }
        } catch (e: Exception) {
            emit(e.message?.let { Resource.error(it, null) })
            Log.e("ERROR", "e_message: " + e.message)
        }
    }
}