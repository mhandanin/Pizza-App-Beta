package com.bahraoui.pizza.activities

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.bahraoui.pizza.R
import com.bahraoui.pizza.Service.PizzaServices
import com.bahraoui.pizza.adabters.pizzaCardAdabter
import com.bahraoui.pizza.adabters.pizzaGridAdabter
import com.bahraoui.pizza.pizzalistsANDclass.listPizza

class MainActivity : AppCompatActivity() {
    lateinit var gridView: GridView
    lateinit var pizzaServiceObjet: PizzaServices
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Pizza Mhandanin"
        supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.color.UltraLightGrey))

        gridView = findViewById<GridView>(R.id.gridView)

        pizzaServiceObjet = PizzaServices()
        listPizza.forEach {
            pizzaServiceObjet.create(it)
        }

        var pizzaAdabter = pizzaCardAdabter(this, pizzaServiceObjet.findAll())
        gridView.adapter = pizzaAdabter



        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, InfoActivity::class.java)
            intent.putExtra("pizza", position)
            startActivity(intent)
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_activity_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.grid -> {
                if (gridView.numColumns == 1) {
                    gridView.numColumns = 2
                    var pizzaAdabterGrid = pizzaGridAdabter(this, pizzaServiceObjet.findAll())
                    gridView.adapter = pizzaAdabterGrid
                    item.icon = ContextCompat.getDrawable(this, R.drawable.baseline_menu_24)
                } else {
                    gridView.numColumns = 1
                    var pizzaAdabter = pizzaCardAdabter(this, pizzaServiceObjet.findAll())
                    gridView.adapter = pizzaAdabter
                    item.icon = ContextCompat.getDrawable(this, R.drawable.baseline_grid_view_24)
                }
            }

            R.id.shoppingCart -> {
                val intent = Intent(this, PanierActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}