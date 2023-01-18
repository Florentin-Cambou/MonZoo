package com.example.monzoo.data

import com.example.monzoo.R
import com.example.monzoo.modele.Animal

class DataModel() {

    val  maki = Animal(AnimalName = R.string.maki, AnimalImage = R.drawable.maki)
    val capu = Animal(AnimalName = R.string.capucin, AnimalImage = R.drawable.capu)
    val fennec = Animal(AnimalName = R.string.fennec, AnimalImage = R.drawable.fennec)
    val ocelot = Animal(AnimalName = R.string.ocelot, AnimalImage = R.drawable.ocelot)
    val serval = Animal(AnimalName = R.string.serval, AnimalImage = R.drawable.serval)
    val elephant = Animal(AnimalName = R.string.elephant, AnimalImage = R.drawable.elephant)
    val tigre = Animal(AnimalName = R.string.tigre, AnimalImage = R.drawable.tigre)
    val loutre = Animal(AnimalName = R.string.loutre, AnimalImage = R.drawable.loutre)
    val ali = Animal(AnimalName = R.string.alligator, AnimalImage = R.drawable.alligator)
    val naja = Animal(AnimalName = R.string.naja, AnimalImage = R.drawable.naja)
    val iguane = Animal(AnimalName = R.string.iguane, AnimalImage = R.drawable.iguane)
    val tortue = Animal(AnimalName = R.string.tortue, AnimalImage = R.drawable.tortue)
    val aigle = Animal(AnimalName = R.string.pygarque, AnimalImage = R.drawable.eagle)
    val ara = Animal(AnimalName = R.string.ara ,AnimalImage = R.drawable.ara)
    val cagou = Animal(AnimalName = R.string.cagou, AnimalImage = R.drawable.cagou)
    val kiwi = Animal(AnimalName = R.string.kiwi, AnimalImage = R.drawable.kiwi)

    fun allAnimals(): List<Animal> {
        return listOf(maki, capu, fennec, ocelot, serval, elephant, tigre, loutre, ali, naja, iguane, tortue, aigle, ara, cagou, kiwi)
    }
}