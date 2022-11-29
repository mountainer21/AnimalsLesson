class PeopleRepository constructor(private val appDataBaseMock: AppDataBaseMock) {

    fun getAll(): MutableList<People> {
        return appDataBaseMock.list
    }

    fun findById(id: Int): People? {
        return appDataBaseMock.list.find { it.id == id}
    }

    fun insert(people: People): Unit{
        appDataBaseMock.list.add(people)
    }

    fun delete(people: People){
        appDataBaseMock.list.remove(people)
    }

    fun update(people: People){
        val peopleF = findById(people.id)
        if (peopleF != null){
            val index = appDataBaseMock.list.indexOf(peopleF)
            appDataBaseMock.list[index] = people
        }

    }
}