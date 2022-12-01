import Carnivores.Carnivores
import Herbivores.Herbivores

fun main() {

    val appDataBaseMock = AppDataBaseMock()
    val repository = AnimalRepository(appDataBaseMock)
    println(repository.getAll())

    val tiger = Carnivores(0, "Тигр", "Крупный", "Джунгли", "Хищник", "Кошачьи")
    val cow = Herbivores(1, "Корова", "Крупный", "Луга", "Растительноядный", "Домашний")
    val jackal = Carnivores(2, "Шакал", "Средний", "Пастбища", "Падальщик", "Псовая")
    val orangutan = Herbivores(3, "Орангутан", "Средний", "Тропический лес", "Плодоядный", "Дикий")
    val ferret = Carnivores(4, "Хорек", "Мелкий", "Степь", "Хищник", "Куньи")
    val sparrow = Herbivores(5, "Воробей", "Мелкий", "Повсеместно", "Зерноядный", "Дикий")

    val list = mutableListOf<Animal>()
    list.add(tiger)
    list.add(cow)
    list.add(jackal)
    list.add(orangutan)
    list.add(ferret)
    list.add(sparrow)

    println(list)
}