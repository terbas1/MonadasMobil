package edwinbaltazar.example.monadasglamor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tablero.*
import android.content.Intent

class TableroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tablero)
        ventas.setOnClickListener {
            val intent:Intent=Intent(this,VentasActivity::class.java)
            startActivity(intent)
        }


    }
}