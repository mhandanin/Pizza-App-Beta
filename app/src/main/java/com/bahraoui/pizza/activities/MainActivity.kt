package com.bahraoui.pizza.activities

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.bahraoui.pizza.R
import com.bahraoui.pizza.adabters.pizzaCardAdabter
import com.bahraoui.pizza.listPizza

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        supportActionBar?.title="Pizza Mhandanin"
        supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.color.UltraLightGrey))
        supportActionBar?.setIcon(R.drawable.pizza_slice)

        var gridView = findViewById<GridView>(R.id.gridView)

        var pizzaAdabter = pizzaCardAdabter(this, listPizza)
        gridView.adapter = pizzaAdabter



        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, InfoActivity::class.java)
            intent.putExtra("pizza", position)
            startActivity(intent)
        }

    }
}