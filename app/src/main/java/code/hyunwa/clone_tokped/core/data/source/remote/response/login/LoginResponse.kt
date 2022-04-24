package code.hyunwa.clone_tokped.core.data.source.remote.response.login


import code.hyunwa.clone_tokped.core.data.source.model.User
import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("access_token")
    val accessToken: String,
    @SerializedName("token_type")
    val tokenType: String,
    @SerializedName("user")
    val user: User
)