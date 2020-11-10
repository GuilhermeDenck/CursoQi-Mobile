package gui.denck.valorant_chras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    lateinit var buttonJett: Button
    lateinit var buttonRaze: Button
    lateinit var buttonReyna: Button
    lateinit var buttonOmen: Button
    lateinit var buttonCypher: Button
    lateinit var buttonBreach: Button
    lateinit var buttonSova: Button
    lateinit var buttonSage: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonJett = findViewById(R.id.jett)
        buttonRaze = findViewById(R.id.raze)
        buttonReyna = findViewById(R.id.reyna)
        buttonOmen = findViewById(R.id.omen)
        buttonCypher = findViewById(R.id.cypher)
        buttonBreach = findViewById(R.id.breach)
        buttonSova = findViewById(R.id.sova)
        buttonSage = findViewById(R.id.sage)



        buttonJett.setOnClickListener {
            Snackbar.make(it, "Jett", Snackbar.LENGTH_LONG).show()
        }

        buttonJett.setOnLongClickListener {
            val alert = AlertDialog.Builder(this@MainActivity)
            alert.setTitle("Jett")
            alert.setMessage(getText(R.string.Jett_Alert))
            alert.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.jett))
            alert.setNeutralButton("Ok", null)
            alert.show()
            true
        }



        buttonRaze.setOnClickListener {
            Snackbar.make(it, "Raze", Snackbar.LENGTH_LONG).show()
        }

        buttonRaze.setOnLongClickListener {
            val alert = AlertDialog.Builder(this@MainActivity)
            alert.setTitle("Raze")
            alert.setMessage(getText(R.string.Raze_Alert))
            alert.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.raze))
            alert.setNeutralButton("Ok", null)
            alert.show()
            true
        }

        buttonReyna.setOnClickListener {
            Snackbar.make(it, "Reyna", Snackbar.LENGTH_LONG).show()
        }

        buttonReyna.setOnLongClickListener {
            val alert = AlertDialog.Builder(this@MainActivity)
            alert.setTitle("Reyna")
            alert.setMessage(getText(R.string.Reyna_Alert))
            alert.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.reyna))
            alert.setNeutralButton("Ok", null)
            alert.show()
            true
        }

        buttonOmen.setOnClickListener {
            Snackbar.make(it, "Omen", Snackbar.LENGTH_LONG).show()
        }

        buttonOmen.setOnLongClickListener {
            val alert = AlertDialog.Builder(this@MainActivity)
            alert.setTitle("Omen")
            alert.setMessage(getText(R.string.Omen_Alert))
            alert.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.omen))
            alert.setNeutralButton("Ok", null)
            alert.show()
            true
        }

        buttonCypher.setOnClickListener {
            Snackbar.make(it, "Cypher", Snackbar.LENGTH_LONG).show()
        }

        buttonCypher.setOnLongClickListener {
            val alert = AlertDialog.Builder(this@MainActivity)
            alert.setTitle("Cypher")
            alert.setMessage(getText(R.string.Cypher_Alert))
            alert.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.cypher))
            alert.setNeutralButton("Ok", null)
            alert.show()
            true
        }

        buttonBreach.setOnClickListener {
            Snackbar.make(it, "Breach", Snackbar.LENGTH_LONG).show()
        }

        buttonBreach.setOnLongClickListener {
            val alert = AlertDialog.Builder(this@MainActivity)
            alert.setTitle("Breach")
            alert.setMessage(getText(R.string.Breach_Alert))
            alert.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.breach))
            alert.setNeutralButton("Ok", null)
            alert.show()
            true
        }

        buttonSova.setOnClickListener {
            Snackbar.make(it, "Sova", Snackbar.LENGTH_LONG).show()
        }

        buttonSova.setOnLongClickListener {
            val alert = AlertDialog.Builder(this@MainActivity)
            alert.setTitle("Sova")
            alert.setMessage(getText(R.string.Sova_Alert))
            alert.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.sova))
            alert.setNeutralButton("Ok", null)
            alert.show()
            true
        }

        buttonSage.setOnClickListener {
            Snackbar.make(it, "Sage", Snackbar.LENGTH_LONG).show()
        }

        buttonSage.setOnLongClickListener {
            val alert = AlertDialog.Builder(this@MainActivity)
            alert.setTitle("Sage")
            alert.setMessage(getText(R.string.Sage_Alert))
            alert.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.sage))
            alert.setNeutralButton("Ok", null)
            alert.show()
            true
        }
    }
}