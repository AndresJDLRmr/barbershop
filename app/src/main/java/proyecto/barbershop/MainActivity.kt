package proyecto.barbershop

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {

        //SplashScreen
        setTheme(R.style.Theme_Barbershop)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Boton Servicios
        val BotonServicios = findViewById<Button>(R.id.btn_servicios)
        BotonServicios.setOnClickListener {
            val lanzar = Intent(this, Servicios::class.java)
            startActivity(lanzar)
        }
        //Boton Citas
        val BotonCita = findViewById<Button>(R.id.btn_citas)
        BotonCita.setOnClickListener {
            val lanzar = Intent(this, Citas::class.java)
            startActivity(lanzar)
        }
        val BotonContacto = findViewById<Button>(R.id.btn_contacto)
        BotonContacto.setOnClickListener {
            val lanzar = Intent(this, Contacto::class.java)
            startActivity(lanzar)
        }
        val Boton_sesion = findViewById<Button>(R.id.btn_sesion)
        Boton_sesion.setOnClickListener {
            val lanzar = Intent(this, Sesion::class.java)
            startActivity(lanzar)
        }
    }
}