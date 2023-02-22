package mx.itson.edu.practica4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos:Button=findViewById(R.id.buttonAntojitos) as Button
        var btnEspecialidades:Button=findViewById(R.id.buttonEspecialidades) as Button
        var btnCombinaciones:Button=findViewById(R.id.buttonCombo) as Button
        var btnTortas:Button=findViewById(R.id.buttonTortas) as Button
        var btnSopas:Button=findViewById(R.id.buttonSopas) as Button
        var btnDrinks:Button=findViewById(R.id.buttonDrinks) as Button


        btnAntojitos.setOnClickListener{
            var intent:Intent= Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Antojitos")
            startActivity(intent)

        }

        btnEspecialidades.setOnClickListener{
            var intent:Intent= Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Especialidades")
            startActivity(intent)

        }

        btnCombinaciones.setOnClickListener{
            var intent:Intent= Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Combinaciones")
            startActivity(intent)

        }

        btnTortas.setOnClickListener{
            var intent:Intent= Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Tortas")
            startActivity(intent)

        }

        btnSopas.setOnClickListener{
            var intent:Intent= Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Sopas")
            startActivity(intent)

        }

        btnDrinks.setOnClickListener{
            var intent:Intent= Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Drinks")
            startActivity(intent)

        }

    }
}