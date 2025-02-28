class User {
    private val id: Int = 0 // 只在User类内可见
    protected val secret: String = "shh" // 在User及其子类中可见
    internal val token: String = "token" // 在同一模块内可见
    val name: String = "John" // 公开可见（默认）
}

//Kotlin提供四种可见性修饰符：

//public（默认）：可见性无限制
//internal：在同一模块内可见
//protected：在子类中可见
//private：在类内部可见