package edwinbaltazar.example.monadasglamor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import edwinbaltazar.example.monadasglamor.Common.Common
import edwinbaltazar.example.monadasglamor.Model.APIResponse
import edwinbaltazar.example.monadasglamor.Remote.IMyApi
import edwinbaltazar.example.monadasglamor.Remote.RetrofitClient
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    internal lateinit var mService:IMyApi

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Iniciando el sercio del api rest
        mService = Common.api
        // Acciones
        btn_login.setOnClickListener {

            val email1= email.text.toString().trim()
            val password1= password.text.toString().trim()
            if(email1.isEmpty()){
                email.error="Correo necesario"
                email.requestFocus()
                return@setOnClickListener
            }
            if(password1.isEmpty()){
                password.error="Password necesario"
                password.requestFocus()
                return@setOnClickListener
            }
            val intent:Intent=Intent(this,TableroActivity::class.java)
            startActivity(intent)

        }

    }


}