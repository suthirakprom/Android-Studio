package com.example.creatingmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId)
        {
            R.id.menu1 -> {
                Toast.makeText(this, "Pizza", Toast.LENGTH_SHORT).show()
                var pizza = Intent(this, Main2Activity::class.java)
                startActivity(pizza)
            }
            R.id.menu2 -> {
                Toast.makeText(this, "Buger", Toast.LENGTH_SHORT).show()
                var burger = Intent(this, Main3Activity::class.java)
                startActivity(burger)
            }
            R.id.menu3 -> {
                Toast.makeText(this, "Salad", Toast.LENGTH_SHORT).show()
                var salad = Intent(this, Main4Activity::class.java)
                startActivity(salad)
            }
            R.id.menu4 -> {
                Toast.makeText(this, "Chicken", Toast.LENGTH_SHORT).show()
                var chicken = Intent(this, Main5Activity::class.java)
                startActivity(chicken)
            }
        }

        return super.onOptionsItemSelected(item)
    }

}
