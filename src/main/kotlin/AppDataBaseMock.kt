import kotlin.random.Random

class AppDataBaseMock {
    val list = mutableListOf<People>()

    init {
        for (i in 0..10){
            val people = People(id = i, name = "name$i", age = i + Random.nextInt(50))
            list.add(people)
        }
    }
}