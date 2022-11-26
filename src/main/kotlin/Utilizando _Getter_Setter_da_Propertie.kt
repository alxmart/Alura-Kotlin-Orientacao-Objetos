fun main() {

    println("Bem vindo(a) ao ByteBank")

    val contaAlex = Conta7()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.deposita(200.0)

    val contaFran = Conta7()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.deposita(300.0)

    println("Titular: ${contaFran.titular}")
    println("Número da Conta7: ${contaFran.numero}")
    println("Saldo Conta7 Fran: ${contaFran.saldo}")

    println("Titular: ${contaAlex.titular}")
    println("Número da Conta7: ${contaAlex.numero}")
    println("Saldo Conta7 Alex: ${contaAlex.saldo}")

    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println("Saldo Conta7 Alex: ${contaAlex.saldo}")

    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println("Saldo Conta7 Fran: ${contaFran.saldo}")

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
    if(contaFran.transfere(800.0, contaAlex)) {
        println("Transferência efetivada")
    } else {
        println("Falha na transferência.")
    }

    println("Saldo Conta7 do Alex: ${contaAlex.saldo}")
    println("Saldo Conta7 da Fran: ${contaFran.saldo}")

}

class Conta7 {
    var titular = ""
    var numero = 0
    var saldo = 0.0
        private set // Apenas nossa classe consegue ajustar o valor

// Removendo porque já está implementado
//        get() {
//            return field
//        }

    // Métodos ou Comportamentos da classe:
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

    fun transfere(valor: Double, destino: Conta7): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            //destino.saldo += valor
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

}

//====================================================================

//fun testaCopiasEReferencia() {
//
//    val numerox = 10
//    var numeroy = numerox
//    numeroy++
//
//    println("NumeroX: $numerox")
//    println("NumneroY: $numeroy")
//
//    val contaJoao = Conta7()
//    contaJoao.titular = "João"
//
//    var contaMaria = Conta7()
//    contaMaria.titular = "Maria"
//    contaJoao.titular = "João"
//
//    println("Titular conta Joao: ${contaJoao.titular}")
//    println("Titular conta Maria: ${contaMaria.titular}")
//
//    println(contaJoao)
//    println(contaMaria)
//
//}
//====================================================================