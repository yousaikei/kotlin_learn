// 创建接口
interface Base {
    fun print()
}

// 实现此接口的被委托的类
class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

// 通过关键字 by 建立委托类
class Derived(b: Base) : Base by b

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    Derived(b).print() // 输出 10
}

//val b = BaseImpl(10)：创建一个 BaseImpl 实例，并传入 10 作为 x 的值。
//Derived(b).print()：创建一个 Derived 实例，并将 b 作为构造函数参数传入。
//Derived(b) 表示 Derived 类将把对 print() 方法的调用委托给 b，而 b 是一个 BaseImpl 实例，它已经实现了 print() 方法。
//因此，调用 print() 方法时，实际上调用的是 BaseImpl 中的 print() 方法，输出 10。