var name: String = "Kotlin"
name = null // 编译错误

var name: String? = "Kotlin"
name = null // 正确

println(name?.length) // 如果name为null，返回null
println(name!!.length) // 如果name为null，抛出空指针异常