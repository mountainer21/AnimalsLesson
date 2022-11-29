fun main(args: Array<String>) {

    val appDataBaseMock = AppDataBaseMock()

    val repository = PeopleRepository(appDataBaseMock)

    println(repository.getAll())

    val people = repository.findById(4)
    println(people)
    if (people != null) {
        repository.delete(people)
    }
    println(repository.getAll())


    val student = Student(0, "Alex", 25, "L124")


    val list = mutableListOf<People>()
    list.add(student)


}