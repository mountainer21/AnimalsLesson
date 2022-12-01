package Carnivores

import Animal

class Carnivores(id: Int, name: String, size: String, habitat: String, var foodStrategy: String, var tacsonomicGroup: String) : Animal(id, name, size, habitat) {
    override fun toString(): String {
        return "Carnivores(id=$id, name='$name', size=$size, habitat=$habitat, foodStrategy=$foodStrategy, tacsonomicGroup=$tacsonomicGroup)"
    }
}
