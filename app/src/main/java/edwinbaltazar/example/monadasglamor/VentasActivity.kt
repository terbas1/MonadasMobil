package edwinbaltazar.example.monadasglamor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ventas.*

class VentasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventas)
        lis_venta.setOnClickListener {
            val intent: Intent = Intent(this,InfoVentas2Activity::class.java)
            startActivity(intent)
        }
        tercero.setOnClickListener {
            val intent: Intent = Intent(this,InfoVentaActivity::class.java)
            startActivity(intent)
        }
    }
}