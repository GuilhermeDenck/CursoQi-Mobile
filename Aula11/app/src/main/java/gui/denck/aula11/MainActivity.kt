package gui.denck.aula11

import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var editname: EditText
    private lateinit var editage: EditText
    private lateinit var editbutton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializer()
        editbutton.setOnClickListener {
            generateRandomNumber()
        }
    }

    private fun generateRandomNumber() {
        var name: String = editname.text.toString()
        var age: Int = editage.text.toString().toInt()

        val info = listOf(name, age)
        textView.text = "$info"

        vibrate()
        var randomNumber = (0..100).shuffled().first()
        toast("A sua probabilidade de ser o próximo herói da terra é : $randomNumber")

        if(randomNumber >= 50){
            toast("VOCÊ SERÁ O PRÓXIMO HERÓI DA TERRA!!!")
        } else {
            toast("VOCÊ É UM FRACASSADO!!!")
        }
    }

    private fun vibrate(){
        val pattern = longArrayOf(0, 200, 100, 300)

        val hardware = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

        hardware?.let {
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                hardware.vibrate(VibrationEffect.createWaveform(pattern, -1))
            }else{
                hardware.vibrate(pattern, -1)
            }
        }
    }

    private fun toast(message: String){
        Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
    }

    private fun initializer() {
        editname = findViewById(R.id.name)
        editage = findViewById(R.id.age)
        editbutton = findViewById(R.id.verificar)
    }
}
