open class Animal(val name: String) {
    open fun makeSound() {
        println("Some generic sound")
    }
}

//Kotlin中的类默认是final的，需要使用open关键字才能被继承：

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("Woof!")
    }
}