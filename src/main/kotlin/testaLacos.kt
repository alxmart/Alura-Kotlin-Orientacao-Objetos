fun testaLacos() {

    for (i in 1..5) {//
    // for (i in 5 downTo 1 /*step 2*/) {//
        /*
        if (i == 4) {

             /*break*/ continue
        }
        */
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("Titular: $titular")
        println("Número da Conta: $numeroConta")
        println("Saldo da Conta: $saldo")
        println()
    }

}