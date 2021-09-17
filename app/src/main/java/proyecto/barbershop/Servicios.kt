package proyecto.barbershop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Servicios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servicios)

        val BotonHome = findViewById<Button>(R.id.btn_home)
        BotonHome.setOnClickListener {
            val lanzar = Intent(this, MainActivity::class.java)
            startActivity(lanzar)
        }
    }
}