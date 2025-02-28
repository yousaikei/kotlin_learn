// 主构造函数
class Person(val name: String, var age: Int) {
    // 属性初始化
    val isAdult = age >= 18

    // 初始化代码块
    init {
        println("Created a person named $name")
    }

    // 次构造函数
    constructor(name: String) : this(name, 0) {
        println("Created a baby named $name")
    }
}

val alice = Person("Alice", 25) // 使用主构造函数
val baby = Person("Bob") // 使用次构造函数