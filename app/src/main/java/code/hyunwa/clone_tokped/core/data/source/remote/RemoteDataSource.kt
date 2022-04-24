package code.hyunwa.clone_tokped.core.data.source.remote

import android.provider.ContactsContract
import code.hyunwa.clone_tokped.core.data.source.remote.network.ApiService

class RemoteDataSource(private val api: ApiService) {
    suspend fun login(email: String, password: String) = api.login(email, password)
}