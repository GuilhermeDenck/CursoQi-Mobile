package gui.denck.aula09

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var button1: Button? = null

    lateinit var button2: Button

    val button3 by lazy { findViewById<Button>(R.id.button3) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializer()

    }

    fun getName(): String {
        return "Guilherme"
    }

    fun getLastName(): String {
        return "Denck"
    }

    fun age(): Int {
        return 16
    }

    fun city(): String{
        return "Gravataí"
    }


    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.button1 -> {
                Toast.makeText(baseContext, "Seu nome é: ${getName()}", Toast.LENGTH_LONG).show()
            }
            R.id.button2 -> {
                Toast.makeText(baseContext, "Seu sobrenome é: ${getLastName()}", Toast.LENGTH_LONG).show()
            }
            R.id.button3 -> {
                Toast.makeText(baseContext, "Sua idade é: ${age()}", Toast.LENGTH_LONG).show()
            }
            R.id.button4 -> {
                Toast.makeText(baseContext, "Sua cidade é: ${city()}", Toast.LENGTH_LONG).show()
            }
                else ->{
                Toast.makeText(baseContext, "Erro!!!", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun initializer() {
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button1?.setOnClickListener(this@MainActivity)
        button2.setOnClickListener(this@MainActivity)
        button3.setOnClickListener(this@MainActivity)
        button4.setOnClickListener(this@MainActivity)

    }
}