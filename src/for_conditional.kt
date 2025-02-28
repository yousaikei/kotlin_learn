fun main() {
    for (i in 1..10) {
        println(i) // 1到10
    }

    for (i in 10 downTo 1) {
        println(i) // 10到1
    }

    for (i in 1 until 10) {
        println(i) // 1到9
    }

    for (i in 1..10 step 2) {
        println(i) // 1, 3, 5, 7, 9
    }
}
