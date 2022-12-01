package Herbivores

import Animal

class Herbivores(id: Int, name: String, size: String, habitat: String, var foodType: String, var lifeStyle: String) : Animal(id, name, size, habitat) {

override fun toString(): String {
    return "Herbivores(id=$id, name='$name', size=$size, habitat=$habitat, foodType=$foodType, lifeStyle=$lifeStyle)"
}
}