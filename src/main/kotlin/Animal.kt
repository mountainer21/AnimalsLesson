open class Animal (val id: Int, var name: String, var size: String, var habitat: String) {

    fun nameUpper(): String {
        return name.uppercase()
    }

    override fun toString(): String {
        return "Animal(id=$id, name='$name', size=$size, habitat=$habitat)"
    }
}

