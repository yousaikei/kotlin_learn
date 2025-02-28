open class C

class D: C()

fun C.foo() = "c"   // 扩展函数 foo

fun D.foo() = "d"   // 扩展函数 foo

fun printFoo(c: C) {
    println(c.foo())  // 类型是 C 类
}

fun main(arg:Array<String>){
    printFoo(D())
}
//在 printFoo(D()) 这行代码中：

//D() 这个对象被 传递 给 printFoo 方法。
//printFoo(c: C) 的 参数类型是 C，所以 c 的 静态类型 是 C，即使它的 运行时类型 是 D。
//由于 扩展函数是静态解析的，Kotlin 在 编译时 只会检查 C 上是否有 foo() 扩展方法，而不会考虑 D 的 foo()。
//C 类有 foo() 扩展函数，返回 "c"，所以最终输出 "c"。
//如果想让 D.foo() 被调用，扩展函数是无法实现的

open class C {
    open fun foo() = "c"
}

class D : C() {
    override fun foo() = "d"
}

fun printFoo(c: C) {
    println(c.foo())  // 这次 foo() 是成员函数，支持多态
}

fun main() {
    printFoo(D())  // 输出 "d"
}

//若扩展函数和成员函数一致，则使用该函数时，会优先使用成员函数。


class D {
    fun bar() { println("D bar") }
}

class C {
    fun baz() { println("C baz") }

    fun D.foo() {
        bar()   // 调用 D.bar
        baz()   // 调用 C.baz
    }

    fun caller(d: D) {
        d.foo()   // 调用扩展函数
    }
}

fun main(args: Array<String>) {
    val c: C = C()
    val d: D = D()
    c.caller(d)

}


//实例执行输出结果为：
//D bar
//C baz

//关键点： 在 foo() 这个扩展函数内部：
//bar() 是 D 类的成员函数，所以 bar() 解析到 D.bar()，输出 "D bar"。
//baz() 是 C 类的成员函数，而 foo() 的扩展是在 C 内部定义的，所以 baz() 解析到 C.baz()，输出 "C baz"。