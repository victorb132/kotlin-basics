fun main() {
    boxOfWater()
    println("-----------")
    fizzBuzz()
    println("-----------")
    reverseString()
    println("-----------")
    verifyXAndO()
}

fun boxOfWater() {
    val waterCapacity = 2000
    var capacity = 0
    var quantity = 0

    do {
        capacity += 7
        quantity += 1
    } while (capacity + 7 < waterCapacity)

    println(quantity)
}

fun fizzBuzz() {
    var numberFizz = 0

    do {
        numberFizz += 1

        if (numberFizz % 3 > 0) {
            println("Buzz")
        }
        if (numberFizz % 5 > 0) {
            println("Fizz")
        }
        if (numberFizz % 5 > 0 && numberFizz % 3 > 0) {
            println("FizzBuzz")
        }
    } while (numberFizz <= 50)
}

fun reverseString() {
    println("Digite um texto:")
    val text = readln()
    println(text.reversed())
}

fun verifyXAndO() {
    println("Digite um texto:")
    val text = readln()

    var countX = 0;
    for(x in text) {
        if(x == 'x') {
            countX++
        }
    }

    var countO = 0;
    for(o in text) {
        if(o == 'o') {
            countO++
        }
    }

    if(countX == countO) {
        println(true)
    } else {
        println(false)
    }
}