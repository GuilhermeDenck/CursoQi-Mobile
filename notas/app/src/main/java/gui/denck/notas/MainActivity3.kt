package gui.denck.notas

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {

    private lateinit var textViewAnswer: TextView
    private lateinit var note: EditText
    private lateinit var button3: Button
    private val TAG: String = "logScreen3"

    var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        initializer()
        Log.d(TAG,"passou pelo onCreate")
        val name = intent.getStringExtra("name")
        textViewAnswer.text = name

        button3.setOnClickListener {
            val intent = Intent(this@MainActivity3, MainActivity::class.java)
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
        stop()
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
        note = findViewById(R.id.note)
        button3 = findViewById(R.id.button3)
        textViewAnswer = findViewById(R.id.textViewAnswer)
        play(R.raw.musica)
    }

    private fun play (sound: Int){
        mediaPlayer = MediaPlayer.create(this@MainActivity3, R.raw.musica)
        mediaPlayer?.start()
        Log.d(TAG, "Entrou no play")
    }

    private fun stop (){
        mediaPlayer?.let {
            if (it.isPlaying){
                it.stop()
                Log.d(TAG, "Entrou no stop")
            }
        }
    }
}