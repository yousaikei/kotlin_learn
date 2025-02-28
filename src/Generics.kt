class Box<T>(t: T) {
    var value = t
}
//泛型类：
//通过泛型类，我们可以在类中定义一个变量，
//并在实例化类时指定该变量的类型。这样可以让这个类处理不同的数据类型，而不需要写多个类来处理每种类型。
//这里，Box<T> 是一个泛型类，其中 T 是一个类型参数。
// 在 main 函数中，我们创建了 boxInt 和 boxString 的实例，分别使用了 Int 和 String 作为类型参数：
var boxInt = Box<Int>(10)       // Box<Int> 里面的元素是 Int 类型
var boxString = Box<String>("Runoob")  // Box<String> 里面的元素是 String 类型

// 定义一个支持协变的类
class Runoob<out A>(val a: A) {
    fun foo(): A {
        return a
    }
}

fun main(args: Array<String>) {
    var strCo: Runoob<String> = Runoob("a")
    var anyCo: Runoob<Any> = Runoob<Any>("b")
    anyCo = strCo
    println(anyCo.foo())   // 输出 a
}
//使用 out 使得一个类型参数协变，协变类型参数只能用作输出，可以作为返回值类型但是无法作为入参的类型：

// 定义一个支持逆变的类
class Runoob<in A>(a: A) {
    fun foo(a: A) {
    }
}

fun main(args: Array<String>) {
    var strDCo = Runoob("a")
    var anyDCo = Runoob<Any>("b")
    strDCo = anyDCo
}
//in 使得一个类型参数逆变，逆变类型参数只能用作输入，可以作为入参的类型但是无法作为返回值的类型：