package com.bahraoui.pizza.activities


import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.bahraoui.pizza.R


class PanierActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.layout_panier)

        supportActionBar?.title = "Panier"
        supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.color.UltraLightGrey))



    }
}