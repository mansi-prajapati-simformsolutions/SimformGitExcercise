package simform.gitexcercise.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import simform.gitexcercise.android.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setData()
    }

    private fun setData() {
        binding.tvGoToSignIn.setOnClickListener {
            val intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}