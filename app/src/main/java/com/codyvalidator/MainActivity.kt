package com.codyvalidator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.codyvalidator.CodyValidator.isEmailValid
import com.codyvalidator.CodyValidator.isOtpValid
import com.codyvalidator.CodyValidator.isPhoneNumberValid

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val phone = "9876543210"
        println(phone.isPhoneNumberValid())  // ✅ Output: true

        val email = "test@example.com"
        println(email.isEmailValid())  // ✅ Output: true

        val otp = "123456"
        println(otp.isOtpValid())  // ✅ Output: true




    }
}