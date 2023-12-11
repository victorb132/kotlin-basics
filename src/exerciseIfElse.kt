import kotlin.reflect.typeOf

fun main() {
    isSquartle(3, 3)
    isTriangleEquilater(2, 3,2)
    eventPort()
}

fun isSquartle(x: Int, y: Int) {
    if(x == y) {
        println("É um quadrado")
    } else {
        println("Não é um quadrado")
    }
}

fun isTriangleEquilater(x: Int, y: Int, z: Int) {
    if(x == y && y == z) {
        println("É um triângulo equilátero")
    } else {
        println("Não é um triângulo equilátero")
    }
}

fun eventPort() {
    println("Digite sua idade:")
    val age = readln().toIntOrNull()
    if(age != null) {
        if(age < 18) {
            println("Negado. Menores de idade não são permitidos.")
        } else {
            println("Digite o tipo do seu convite:")
            val typeInvite = readln()
            if(typeInvite.lowercase() == "comum" ||
                typeInvite.lowercase() == "premium" ||
                typeInvite.lowercase() == "luxo") {
                println("Digite o código do seu convite:")
                val codeInvite = readln()
                if(typeInvite.lowercase() == "premium"  && codeInvite.lowercase() == "xl" ||
                    typeInvite.lowercase() == "luxo" && codeInvite.lowercase() == "xl" ||
                    typeInvite.lowercase() == "comum" && codeInvite.lowercase() == "xt") {
                    println("Welcome :)")
                } else {
                    println("Negado. Convite inválido.")
                }
            } else {
                println("Negado. Convite inválido.")
            }
        }
    } else {
        println("Digite um número válido")
    }
}