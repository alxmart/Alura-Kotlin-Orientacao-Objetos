fun main() {
    println("Bem vindo(a) ao Bytebank.")
    var i = 0

    while (i < 5) {

        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("Titular: $titular")
        println("Número da Conta: $numeroConta")
        println("Saldo da Conta: $saldo")
        println()

        i++

    }

//    for (i in 5 downTo 1 /*step 2*/ ) {
//
//        if (i == 4) {
//            /*break*/ continue
//        }
//
//        val titular: String = "Alex $i"
//        val numeroConta: Int = 1000 + i
//        var saldo: Double = i + 10.0
//
//        println("Titular: $titular")
//        println("Número da Conta: $numeroConta")
//        println("Saldo da Conta: $saldo")
//        println()

    // testaCondicoes(saldo)


}

