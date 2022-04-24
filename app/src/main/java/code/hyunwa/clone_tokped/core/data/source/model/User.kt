package code.hyunwa.clone_tokped.core.data.source.model


import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("address")
    val address: String,
    @SerializedName("city")
    val city: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("current_team_id")
    val currentTeamId: Any,
    @SerializedName("email")
    val email: String,
    @SerializedName("email_verified_at")
    val emailVerifiedAt: Any,
    @SerializedName("houseNumber")
    val houseNumber: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("phoneNumber")
    val phoneNumber: String,
    @SerializedName("picturePath")
    val picturePath: Any,
    @SerializedName("profile_photo_url")
    val profilePhotoUrl: String,
    @SerializedName("roles")
    val roles: String,
    @SerializedName("updated_at")
    val updatedAt: String
)