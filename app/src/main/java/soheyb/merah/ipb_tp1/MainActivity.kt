package soheyb.merah.ipb_tp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var btnToListUsers: Button
    lateinit var txtFullname: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToListUsers = findViewById(R.id.btnToListUsers)
        txtFullname = findViewById(R.id.txtFullname)
        btnToListUsers.setOnClickListener {
            intent = Intent(this, ListUsersActivity::class.java)
            intent.putExtra("name", txtFullname.text.toString())
            println(txtFullname.text)
            startActivity(intent)
        }
    }

}