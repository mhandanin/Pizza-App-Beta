package com.bahraoui.pizza.activities

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.bahraoui.pizza.R
import com.bahraoui.pizza.adabters.pizzaCardAdabter
import com.bahraoui.pizza.listPizza


class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.layout_info)


        supportActionBar?.title = "Pizza Mhandanin"
        supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.color.UltraLightGrey))
        supportActionBar?.setIcon(R.drawable.pizza_slice)
        var pizzaImage = findViewById<ImageView>(R.id.pizzaImage)
        var pizzaName = findViewById<TextView>(R.id.pizzaName)
        var descriptionContent = findViewById<TextView>(R.id.descriptionContent)
        var ingredientContent = findViewById<TextView>(R.id.ingredientContent)

        var recuperIntent = intent?.extras?.getInt("pizza")

        pizzaImage.setImageResource(listPizza[recuperIntent!!].image)
        pizzaName.text = listPizza[recuperIntent].name
        descriptionContent.text = listPizza[recuperIntent].description
        ingredientContent.text = listPizza[recuperIntent].ingredients.joinToString("\n")


    }
}