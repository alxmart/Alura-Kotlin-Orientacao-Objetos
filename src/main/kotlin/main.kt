fun main() {

    println("Bem vindo(a) ao ByteBank")

    val contaAlex = Conta(titular = "Alex", numero = 1000)
    contaAlex.deposita(200.0)

    val contaFran = Conta(numero = 1001, titular = "Fran")
    contaFran.deposita(300.0)

    println("Titular: ${contaFran.titular}")
    println("Número da Conta: ${contaFran.numero}")
    println("Saldo Conta Fran: ${contaFran.saldo}")

    println("Titular: ${contaAlex.titular}")
    println("Número da Conta: ${contaAlex.numero}")
    println("Saldo Conta Alex: ${contaAlex.saldo}")

    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println("Saldo Conta Alex: ${contaAlex.saldo}")

    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println("Saldo Conta Fran: ${contaFran.saldo}")

    println("Sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("Sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("Saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println("Saldo atual: ${contaAlex.saldo}")

    println("Saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println("Saldo atual: ${contaFran.saldo}")

    println("Transferência da conta da Fran para a conta do Alex")

    //if (contaFran.transfere(800.0, contaAlex)) {
    if (contaFran.transfere(valor = 800.0, destino = contaAlex)) {
        println("Transferência efetivada")
    } else {
        println("Falha na transferência.")
    }

    println("Saldo Conta do Alex: ${contaAlex.saldo}")
    println("Saldo Conta da Fran: ${contaFran.saldo}")
}

class Conta(
    var titular: String,
    val numero: Int = 0
) {
    var saldo = 0.0
        private set    // Apenas nossa classe consegue ajustar o valor

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            println("Saque não realizado - Valor Insuficiente")
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            //destino.saldo += valor
            destino.deposita(valor)
            return true
        }
        return false
    }

}

//====================================================================

fun testaCopiasEReferencia() {

    val numerox = 10
    var numeroy = numerox
    numeroy++

    println("NumeroX: $numerox")
    println("NumneroY: $numeroy")

    val contaJoao = Conta("João", 1002)
    contaJoao.titular = "João"

    var contaMaria = Conta("Maria", 1003)
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("Titular conta Joao: ${contaJoao.titular}")
    println("Titular conta Maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)

}
//====================================================================








/*
fun main() {
    println("Bem vindo ao Bytebank")
    //val titular: String = "Alex"
    val titular: String = "Alex"     // String
    val numeroConta = 1000
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200
    saldo -= 1000.0

    //println(titular)
    //println("Titular: " + titular)
    println("Titular: $titular")
    //titular = "Homer"
    println("Número da Conta: $numeroConta")
    println("Saldo da Conta: $saldo")

    //testaCondicoes(saldo)

}


fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0 -> println("A conta é positiva")
        saldo == 0.0 -> println("A conta é neutra")
        else -> println("A conta é negativa")
    }
}
*/


/*
fun main() {

    println("Bem vindo ao ByteBank\n")

    val contaAlex = Conta(titular = "Alex", numero = 1000)
    contaAlex.deposita(200.0)

    val contaFran = Conta(numero = 1001, titular = "Fran")
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)


    println("Depositando na conta do Alex")
    contaAlex.deposita(50.00)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(70.00)
    println(contaFran.saldo)


    println("Sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("Sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)


    println("Saque em Excesso na Conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("Saque em Excesso na Conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)


    println("Tranferência da conta da Fran para o Alex")

    if (contaFran.transfere(destino = contaAlex, valor = 300.0)) {

        println("Transferência efetuada")
    } else {
        println("Falha na transferência")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)

}

class Conta(
    var titular: String,
    val numero: Int
) {

    var saldo = 0.00
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {

        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        if (valor > 0) {
//            saldo = valor
//        }
//    }

    fun testaCopiasEReferencias() {

        val contaJoao = Conta("João", 1002)
        contaJoao.titular = "Joao"

        var contaMaria = Conta("Maria", 1003)
        contaMaria.titular = "Maria"

        //contaJoao.titular = "Joao"

        println("Titular conta Joao:  ${contaJoao.titular}")
        println("Titular conta Maria:  ${contaMaria.titular}")

        println(contaJoao)
        println(contaMaria)

    }

    fun testaLacos() {
        var i = 0
        while (i < 5) {
            val titular: String = "Alex $i"
            val numeroConta: Int = 1000 + i
            var saldo = i + 10.0

            println("Titular: $titular")
            println("Número da Conta: $numeroConta")
            println("Saldo da conta: $saldo")
            println()
            i++

        }

//    for (i in 5 downTo 1  ) {
//
//        if (i == 4) continue
//
//        val titular: String = "Alex $i"
//        val numeroConta: Int = 1000 + i
//        var saldo = i + 10.0
//
//        println("Titular: $titular")
//        println("Número da Conta: $numeroConta")
//        println("Saldo da conta: $saldo")
//        println()
//    }

    }

    fun testaCondicoes(saldo: Double) {

//        if (saldo > 0.0) {
//            println("A conta é positiva")
//        } else if (saldo == 0.0) {
//            println("A conta é neutra")
//        } else {
//            println("Conta Negativa")
//        }

        when {
            saldo > 0.0 -> println("A conta é positiva")
            saldo == 0.0 -> println("A conta é neutra")
            else -> println("Conta Negativa")
        }

    }

}

 */