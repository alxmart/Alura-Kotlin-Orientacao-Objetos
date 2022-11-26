//fun main() {
//
//    println("Bem vindo(a) ao ByteBank")
//
//    val contaAlex = Conta("Alex", 1000)
//    contaAlex.deposita(200.0)
//
//    val contaFran = Conta("Fran", 1001)
//    contaFran.deposita(300.0)
//
//    println("Titular: ${contaFran.titular}")
//    println("Número da Conta: ${contaFran.numero}")
//    println("Saldo Conta Fran: ${contaFran.saldo}")
//
//    println("Titular: ${contaAlex.titular}")
//    println("Número da Conta: ${contaAlex.numero}")
//    println("Saldo Conta Alex: ${contaAlex.saldo}")
//
//    println("Depositando na conta do Alex")
//    contaAlex.deposita(50.0)
//    println("Saldo Conta Alex: ${contaAlex.saldo}")
//
//    println("Depositando na conta da Fran")
//    contaFran.deposita(70.0)
//    println("Saldo Conta Fran: ${contaFran.saldo}")
//
//    println("Sacando na conta do Alex")
//    contaAlex.saca(250.0)
//    println(contaAlex.saldo)
//
//    println("Sacando na conta da Fran")
//    contaFran.saca(100.0)
//    println(contaFran.saldo)
//
//    println("Saque em excesso na conta do Alex")
//    contaAlex.saca(100.0)
//    println("Saldo atual: ${contaAlex.saldo}")
//
//    println("Saque em excesso na conta da Fran")
//    contaFran.saca(500.0)
//    println("Saldo atual: ${contaFran.saldo}")
//
//    println("Transferência da conta da Fran para a conta do Alex")
//    if (contaFran.transfere(800.0, contaAlex)) {
//        println("Transferência efetivada")
//    } else {
//        println("Falha na transferência.")
//    }
//
//    println("Saldo Conta do Alex: ${contaAlex.saldo}")
//    println("Saldo Conta da Fran: ${contaFran.saldo}")
//
//}
//
//class Conta(
//    var titular: String,
//    var numero: Int
//) {
//    var saldo = 0.0
//        private set    // Apenas nossa classe consegue ajustar o valor
//
//// Usar construtor primário (ver linha 55, acima)
////    constructor(titular: String, numero: Int) {
////        this.titular = titular
////        this.numero = numero
////    }
//
//// Removendo porque já está implementado
////        get() {
////            return field
////        }
//
//
//    fun deposita(valor: Double) {
//        if (valor > 0) {
//            this.saldo += valor
//        }
//    }
//
//    fun saca(valor: Double) {
//        if (this.saldo >= valor) {
//            this.saldo -= valor
//        } else {
//            println("Saque não realizado - Valor Insuficiente")
//        }
//    }
//
//    fun transfere(valor: Double, destino: Conta): Boolean {
//        if (saldo >= valor) {
//            saldo -= valor
//            //destino.saldo += valor
//            destino.deposita(valor)
//            return true
//        }
//        return false
//    }
//
//}
//
////====================================================================
//
//fun testaCopiasEReferencia() {
//
//    val numerox = 10
//    var numeroy = numerox
//    numeroy++
//
//    println("NumeroX: $numerox")
//    println("NumneroY: $numeroy")
//
//    val contaJoao = Conta("João", 1002)
//    contaJoao.titular = "João"
//
//    var contaMaria = Conta("Maria", 1003)
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
////====================================================================
