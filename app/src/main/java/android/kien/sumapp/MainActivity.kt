package android.kien.sumapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var number1EditText: EditText
    private lateinit var number2EditText: EditText
    private lateinit var sumButton: Button
    private lateinit var answerTextView: TextView
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        number1EditText = findViewById(R.id.number1EditTextID)
        number2EditText = findViewById(R.id.number2EditTextID)
        sumButton = findViewById(R.id.button)
        answerTextView = findViewById(R.id.answerTextView)

        sumButton.setOnClickListener {
            val number1 = number1EditText.text.toString().toInt()
            val number2 = number2EditText.text.toString().toInt()
            val sum = number1 + number2
            answerTextView.text = "Answer: $sum"
        }
    }
}