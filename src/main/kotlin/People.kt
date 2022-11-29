open class People (val id: Int, var name: String, var age: Int) {

    fun nameUpper(): String {
        return name.uppercase()
    }

    override fun toString(): String {
        return "People(id=$id, name='$name', age=$age)"
    }
}

