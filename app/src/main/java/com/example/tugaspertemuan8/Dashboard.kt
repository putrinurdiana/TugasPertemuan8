package com.example.tugaspertemuan8

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_home -> {
                // Navigate to Profile activity
                val intent = Intent(this, Profile::class.java)
                startActivity(intent)
                true
            }
            R.id.action_materi -> {
                // Exit the application
                Toast.makeText(this, "Logging out...", Toast.LENGTH_SHORT).show()
                finish()  // End the activity and exit
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
