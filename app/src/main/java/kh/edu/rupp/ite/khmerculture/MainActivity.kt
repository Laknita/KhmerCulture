package kh.edu.rupp.ite.khmerculture

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        val menuAct = findViewById<Button>(R.id.menu)
        menuAct.setOnClickListener {
            val Intent = Intent(this, MenuActivity::class.java)
            startActivity(Intent)
        }

    }
}