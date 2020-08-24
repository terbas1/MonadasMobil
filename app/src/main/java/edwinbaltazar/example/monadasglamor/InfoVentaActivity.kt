package edwinbaltazar.example.monadasglamor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_info_venta.*

class InfoVentaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_venta)

        passar.setOnClickListener {
            val intent: Intent = Intent(this,InfoVentas2Activity::class.java)
            startActivity(intent)
        }
    }
}