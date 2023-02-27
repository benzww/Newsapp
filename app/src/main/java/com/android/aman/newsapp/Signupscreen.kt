package com.android.aman.newsapp


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
//import com.android.aman.newsapp.LoginActivity
//import com.android.aman.newsapp.R
import com.android.aman.newsapp.R.id
//import kotlinx.android.synthetic.main.login_activity.*


class Signupscreen : AppCompatActivity() {

    private lateinit var username:String
    private lateinit var password:String
    private lateinit var confirm:String

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        val et_username = findViewById(id.u1) as EditText
        val et_password = findViewById(id.u2) as EditText
        val et_confirm_password = findViewById(id.u3) as EditText
        val btn_submit = findViewById(id.button) as Button



        btn_submit.setOnClickListener {
            username = et_username.text.toString()
            password = et_password.text.toString()
            confirm = et_confirm_password.text.toString()


            if (username.isEmpty()) {
                et_username.error = "username required"
                return@setOnClickListener
            }
            if (password.isEmpty()){
                et_password.error = "password required"
                return@setOnClickListener
            }
            if (confirm.isEmpty() ) {
                et_confirm_password.error = "confirm your password"
                return@setOnClickListener

            }
            if (confirm != password ) {
                et_confirm_password.error = "Enter your password correctly"
                return@setOnClickListener

            }else {
                Toast.makeText(this, "Registered successfully", Toast.LENGTH_SHORT).show()
            }
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}