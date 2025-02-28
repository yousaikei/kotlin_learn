class Outer {
    private val bar: Int = 1

    // 嵌套类（不持有外部类引用）
    class Nested {
        // 不能访问bar
    }

    // 内部类（持有外部类引用）
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
        fun accessBar() = bar // 可以访问外部类的私有成员
    }
}