package code.hyunwa.clone_tokped.core.data.source.remote.network

import code.hyunwa.clone_tokped.core.data.source.remote.response.Wrapper
import code.hyunwa.clone_tokped.core.data.source.remote.response.login.LoginResponse
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    @FormUrlEncoded
    @POST("login")
    suspend fun login(
        @Field("email") email:String,
        @Field("password") password: String
    ): Response<Wrapper<LoginResponse>>


}