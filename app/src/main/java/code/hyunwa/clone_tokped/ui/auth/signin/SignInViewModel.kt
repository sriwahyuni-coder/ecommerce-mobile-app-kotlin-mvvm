package code.hyunwa.clone_tokped.ui.auth.signin

import android.provider.ContactsContract
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import code.hyunwa.clone_tokped.core.data.repository.AppRepository

class SignInViewModel(private val repo : AppRepository) : ViewModel() {
    fun login(email: String, password: String) = repo.login(email, password).asLiveData()
}