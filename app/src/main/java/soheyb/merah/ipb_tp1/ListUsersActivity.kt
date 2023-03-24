package soheyb.merah.ipb_tp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ListUsersActivity : AppCompatActivity() {
    lateinit var lblFullname: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_users)

        lblFullname = findViewById(R.id.lblFullname)
        val name: String? = intent.getStringExtra("name")
        lblFullname.text = "Welcome "+name+" !"
    }
}