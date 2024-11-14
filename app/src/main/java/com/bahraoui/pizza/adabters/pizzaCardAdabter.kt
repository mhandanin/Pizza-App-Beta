package com.bahraoui.pizza.adabters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.bahraoui.pizza.pizzalistsANDclass.Pizza
import com.bahraoui.pizza.R
import com.bahraoui.pizza.pizzalistsANDclass.pizzaCard

class pizzaCardAdabter(var context: Context, var listPizza: List<Pizza>) : BaseAdapter() {
    override fun getCount(): Int {
        return listPizza.size
    }

    override fun getItem(position: Int): Any {
        return listPizza[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view =
            convertView ?: LayoutInflater.from(context).inflate(R.layout.pizza_card, parent, false)


        var pizzaImage = view.findViewById<ImageView>(R.id.pizzaImage)
        var pizzaName = view.findViewById<TextView>(R.id.pizzaName)
        var temp = view.findViewById<TextView>(R.id.temp)
        var ingredient = view.findViewById<TextView>(R.id.ingredient)
        var prix = view.findViewById<TextView>(R.id.prix)
        var ajouterPanierBTN = view.findViewById<Button>(R.id.ajouterPanierBTN)
        var info=view.findViewById<ImageButton>(R.id.info)

        var pizza = getItem(position) as Pizza

        pizzaImage.setImageResource(pizza.image)
        pizzaName.text = pizza.name
        temp.text = pizza.temp.toString()
        ingredient.text = pizza.ingredients.size.toString()
        prix.text = "${pizza.prix.toString()} MAD"


        info.setOnClickListener{
            val builder: AlertDialog.Builder = AlertDialog.Builder(context)
            builder
                .setMessage(pizza.ingredients.joinToString("\n"))
                .setTitle(pizza.name)
                .setPositiveButton("OK") { dialog, which ->
                    // Do something.
                }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        ajouterPanierBTN.setOnClickListener {
            if (!pizzaCard.contains(listPizza[position])) {
                pizzaCard.add(listPizza[position])
            }else{
0
            }
        }

        return view

    }
}