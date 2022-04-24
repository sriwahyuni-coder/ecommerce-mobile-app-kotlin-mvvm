package code.hyunwa.clone_tokped.core.data.source.remote.response


import code.hyunwa.clone_tokped.core.data.source.remote.response.login.LoginResponse
import com.google.gson.annotations.SerializedName

data class Wrapper<T>(
    @SerializedName("data")
    val data: T? = null,
    @SerializedName("meta")
    val meta: Meta
)