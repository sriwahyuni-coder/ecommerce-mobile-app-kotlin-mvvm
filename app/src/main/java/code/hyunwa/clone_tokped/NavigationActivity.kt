package code.hyunwa.clone_tokped

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import code.hyunwa.clone_tokped.databinding.ActivityNavigationBinding
import code.hyunwa.clone_tokped.ui.auth.signin.SignInActivity
import code.hyunwa.clone_tokped.util.Prefs

class NavigationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_cart, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        navView.setOnItemSelectedListener {
            var prefs=Prefs(this)

            when(it.itemId){
                R.id.navigation_home -> Toast.makeText(this, "home", Toast.LENGTH_SHORT).show()
                R.id.navigation_dashboard -> Toast.makeText(this, "dashboard", Toast.LENGTH_SHORT).show()
                R.id.navigation_cart ->
                    if(prefs.getLogin()){
                        Toast.makeText(this, "sudah login", Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(this, "belum login", Toast.LENGTH_SHORT).show()
                    }
                R.id.navigation_notifications ->
                    if(prefs.getLogin()){
                        navController.navigate(it.itemId)
                    }else{
                        startActivity(Intent(this, SignInActivity::class.java))
                    }
                else->{
                    Toast.makeText(this, "no menu", Toast.LENGTH_SHORT).show()
                }
            }
            return@setOnItemSelectedListener true
        }
    }
}