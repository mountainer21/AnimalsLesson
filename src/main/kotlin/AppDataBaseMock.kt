import kotlin.random.Random

class AppDataBaseMock {
    val list = mutableListOf<Animal>()

    init {
        for (i in 0..10){
            val animal = Animal(id = i, name = "name$i", size = "size$i", habitat = "habitat$i")
            list.add(animal)
        }
    }
}