fun main(args: Array<String>) {

    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    lateinit var canCreateTriangle: String
    canCreateTriangle = if (
        (a + b > c) &&
        (c + b > a) &&
        (a + c > b)
    ) {
        "YES"
    } else {
        "NO"
    }
    println(canCreateTriangle)
}