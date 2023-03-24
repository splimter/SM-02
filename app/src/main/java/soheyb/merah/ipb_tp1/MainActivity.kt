package soheyb.merah.ipb_tp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnToListUsers: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToListUsers = findViewById(R.id.btnToListUsers)
        btnToListUsers.setOnClickListener {
            intent = Intent(this, ListUsersActivity::class.java)
            startActivity(intent)
        }
    }

}