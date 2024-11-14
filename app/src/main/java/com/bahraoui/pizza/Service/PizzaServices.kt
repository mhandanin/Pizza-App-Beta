package com.bahraoui.pizza.Service

import com.bahraoui.pizza.DAO.IDao
import com.bahraoui.pizza.pizzalistsANDclass.Pizza

class PizzaServices:IDao<Pizza> {
    private val pizzaDataList= mutableListOf<Pizza>()
    override fun create(pizza: Pizza): Boolean {
     return pizzaDataList.add(pizza)
    }

    override fun delete(pizza: Pizza): Boolean {
        return pizzaDataList.remove(pizza)
    }

    override fun update(pizza: Pizza) {
        TODO("Not yet implemented")
    }

    override fun findById(id: Int): Pizza? {
        return pizzaDataList.find { it.id==id }
    }

    override fun findAll(): List<Pizza> {
        return pizzaDataList
    }

}
