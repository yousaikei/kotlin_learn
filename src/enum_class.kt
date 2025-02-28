enum class Color{
    RED,BLACK,BLUE,GREEN,WHITE
}

fun main(args: Array<String>) {
    var color:Color=Color.BLUE

    println(Color.values()) //[RED, BLACK, BLUE, GREEN, WHITE]
    println(Color.valueOf("RED")) //RED
    println(color.name) //BLUE
    println(color.ordinal) //2

}
//Color.values()：返回 Color 枚举类所有常量的数组。
//Color.valueOf("RED")：通过常量的名字（字符串）获取对应的枚举常量。
//color.name：获取枚举常量的名称（字符串形式）。
//color.ordinal：获取枚举常量的索引（按声明顺序，从 0 开始）。