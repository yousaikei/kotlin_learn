sealed class Expr
data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()

fun eval(expr: Expr): Double = when (expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
}
//✅ 使用 sealed class：
//限制 Expr 只能有固定的子类，保证 when 语句的完整性，不需要 else 分支。

//✅ 递归结构：
//Sum 类型的计算依赖 eval(expr.e1) 和 eval(expr.e2)，逐层计算，类似 二叉表达式树的求值。

//✅ 数据类 data class 适用于不可变数据：
//Const 和 Sum 作为 不可变数据结构，默认生成 equals()、hashCode() 和 toString() 方法，使其在模式匹配 (when) 时更高效。