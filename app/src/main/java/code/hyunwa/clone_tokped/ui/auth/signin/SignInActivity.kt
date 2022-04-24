package code.hyunwa.clone_tokped.ui.auth.signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import code.hyunwa.clone_tokped.databinding.ActivitySignInBinding
import code.hyunwa.clone_tokped.ui.auth.signup.SignUpActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class SignInActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySignInBinding
    private val viewModel : SignInViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initDataDummy()

        binding.tvSignUp.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

        binding.btSignin.setOnClickListener {
            var email = binding.edEmail.text.toString()
            var password = binding.edPassword.text.toString()

            if(email.isNullOrEmpty()){
                binding.apply {
                    edEmail.error = "Silahkan masukkan email Anda"
                    edEmail.requestFocus()
                }
            }else if (password.isNullOrEmpty()){
                binding.apply {
                    edPassword.error = "Silahkan masukkan password Anda"
                    edPassword.requestFocus()
                }
            }else{
               login(email, password)
            }
        }

    }

    private fun login(email: String, password:String){
        viewModel.login(email, password).observe(this, {
//            if(it.){
//                var token = it?.data?.accessToken
//            }
        })
    }

    private fun initDataDummy() {
        binding.edEmail.setText("hynwa@gmai.com")
    }
}