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


class LoginActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        // var ball:EditText?=null
        //   ball find



        val et_username= findViewById(id.u1) as EditText
        val  et_password = findViewById(id.u2) as EditText

        val btn_submit = findViewById(id.u3) as Button
        val btn_continuewithgoogle = findViewById(id.button2) as Button
        val tv_or = findViewById(id.u5) as TextView
        val Signup= findViewById(id.Signup) as TextView

        btn_submit.setOnClickListener {
            val username = et_username.text
            val password = et_password.text


            if (username.isEmpty())
            {
                et_username.error = "password required"
                return@setOnClickListener
            }

            else if(password.isEmpty())
            {
                et_password.error = "username required"
                return@setOnClickListener
            }
            else{
                Toast.makeText(this,"login successful",Toast.LENGTH_SHORT).show()
            }
            startActivity(Intent(this,MainActivity::class.java))
        }



        Signup.setOnClickListener {

            startActivity(Intent(this, Signupscreen::class.java))



        }
    }
}