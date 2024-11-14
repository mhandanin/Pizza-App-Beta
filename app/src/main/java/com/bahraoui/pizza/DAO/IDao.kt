package com.bahraoui.pizza.DAO

import com.bahraoui.pizza.pizzalistsANDclass.Pizza

interface IDao<T> {
    fun create(pizza:T):Boolean
    fun delete(pizza: T):Boolean
    fun update(pizza: T)
    fun findById(id:Int):Pizza?
    fun findAll():List<Pizza>
}