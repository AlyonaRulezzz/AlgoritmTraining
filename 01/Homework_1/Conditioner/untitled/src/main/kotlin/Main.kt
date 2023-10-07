import java.util.Locale

fun main(args: Array<String>) {

    val inputTemperatures = readln().trim()
    val tRoom = inputTemperatures.split(" ")[0].toInt()
    val tCond = inputTemperatures.split(" ")[1].toInt()

    val mode = readln().lowercase(Locale.getDefault())

    var newTemperature = tRoom

    if (mode == "freeze" && tRoom > tCond) {
        newTemperature = tCond
    } else if (mode == "heat" && tRoom < tCond) {
        newTemperature = tCond
    } else if (mode == "auto") {
        newTemperature = tCond
    } else if ((mode == "freeze") && (tRoom > tCond)) {
        newTemperature = tCond
    }

    println(newTemperature)

}