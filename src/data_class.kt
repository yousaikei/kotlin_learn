data class User(val name: String, val age: Int)

val alice = User("Alice", 25)
val bob = alice.copy(name = "Bob") // 复制并修改部分属性

// 解构
val (name, age) = alice
println("$name is $age years old")