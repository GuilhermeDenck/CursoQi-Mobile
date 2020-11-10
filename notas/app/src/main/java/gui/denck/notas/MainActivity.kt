package gui.denck.notas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button


class MainActivity : AppCompatActivity() {


    private lateinit var button: Button

    private val TAG: String = "logScreen1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializer()
        Log.d(TAG,"passou pelo onCreate")

        button.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
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
            button = findViewById(R.id.button)
    }
}
