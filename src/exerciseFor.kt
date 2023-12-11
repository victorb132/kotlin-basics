fun main() {
    print1To50()
    println("-----------")
    print50To1()
    println("-----------")
    print1To50MenusMultipyOf5()
    println("-----------")
    printSumOf1To50()
    println("-----------")
    numberHashs()
}

fun print1To50() {
    for (n in 1..50) {
        print("$n,")
    }
    println("")
}

fun print50To1() {
    for (n in 50 downTo 1) {
        print("$n,")
    }
    println("-------")
}

fun print1To50MenusMultipyOf5() {
    for (n in 1..50) {
        if(n % 5 != 0) {
            print("$n,")
        }
    }
    println("")
}

fun printSumOf1To50() {
    var sum = 0
    for (n in 1..500 ) {
        sum += n;
    }
    println(sum)
}

fun numberHashs() {
    println("Insira um número:")
    val number = readln().toIntOrNull()

    if(number != null) {
        if(number > 0) {
            for(n in 1..number) {
                val hash = "#"
                println(hash.repeat(n))
            }
        } else {
            println("Insira um número maior do que 0")
        }
    } else {
        println("Insira um número")
    }
}