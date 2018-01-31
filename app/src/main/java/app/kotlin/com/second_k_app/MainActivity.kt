package app.kotlin.com.second_k_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun login(view: View)
    {
        val email = findViewById<EditText>(R.id.editText) as EditText
        val pass  = findViewById<EditText>(R.id.editText2) as EditText

        val mail = email.text.toString()
        val pwd  = pass.text.toString()

        if(mail.isEmpty() && pwd.isEmpty())
        {
            Toast.makeText(this,"Fields Cannot be empty", Toast.LENGTH_LONG).show()
        }
        else
        {
            Toast.makeText(this,"Login SuccessFull" + mail, Toast.LENGTH_LONG).show()
        }
    }
}
