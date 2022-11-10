fun main() {

    println("Bem vindo ao Bytebank")
    println()

    val titular: String = "Alex"
    val numeroConta: Int  = 1000
    var saldo: Double = 0.0

    saldo = 100 + 2.0
    saldo += 200
    saldo -= 1000.0

    println("Titular: $titular")
    println("Titular: $numeroConta")
    println("Titular: $saldo")

    testaCondicoes(saldo)

}

