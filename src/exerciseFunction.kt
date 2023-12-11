fun main() {
    convertYearToMonthDayHours(2)
    numberOfCaracteres("teste")
    calculateCubeOfANumber(2)
    convertMilesToKilometers(1.0)
    changeLettersAtoX("Variavel")
}

fun convertYearToMonthDayHours(year: Int) {
    println("$year anos equivalem a:")

    val month = year * 12
    println("$month meses")

    val days = year * 365
    println("$days dias")

    val hours = year * 8760
    println("$hours horas")

    val seconds = year * 3.154e+7
    println("$seconds segundos")
}

fun numberOfCaracteres(text: String) {
    println("-----------------------")
    println("Quantidade de caracteres: ${text.length}")
}

fun calculateCubeOfANumber(number: Int) {
    println("-----------------------")
    println("O cubo de $number é: ${number * number * number}")
}

fun convertMilesToKilometers(miles: Double) {
    println("-----------------------")
    println("O valor de $miles em KM é: ${miles * 1.609}KM")
}

fun changeLettersAtoX(text: String) =
    print(text.lowercase().replace('a', 'x'))
