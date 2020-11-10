package gui.denck.notas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity2 : AppCompatActivity() {

    private lateinit var title : EditText
    private lateinit var spinner: Spinner
    private lateinit var button2: Button
    private val TAG: String = "logScreen2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        initializer()
        Log.d(TAG,"passou pelo onCreate")

        button2.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            intent.putExtra("name", title.text.toString())
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Passou no onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Passou no onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Passou no onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Passou no onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Passou no onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "Passou no onRestart")
    }

    private fun initializer(){
        title = findViewById(R.id.title)
        spinner = findViewById(R.id.spinner)
        button2 = findViewById(R.id.button2)
    }
}