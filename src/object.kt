object Site {
    var url:String = ""
    val name: String = "菜鸟教程"
}
fun main(args: Array<String>) {
    var s1 =  Site
    var s2 = Site
    s1.url = "www.runoob.com"
    println(s1.url)
    println(s2.url)
}

//s1 和 s2 都引用同一个 Site 实例。即使你声明了两个变量 s1 和 s2，
// 它们都指向同一个对象实例，Site 的唯一实例。
//当你打印 s1.url 和 s2.url 时，它们都输出相同的值 "www.runoob.com"，
// 因为 s1 和 s2 都指向 Site 的同一个实例，它们共享同一个 url 值。
