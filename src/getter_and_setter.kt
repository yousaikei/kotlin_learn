class Rectangle(val width: Int, val height: Int) {
    val area: Int
        get() = width * height // 自定义getter

    var displayName: String = "Rectangle"
        set(value) {
            field = if (value.isBlank()) "Unknown" else value
            // field是幕后字段的引用
        }
}