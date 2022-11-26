//fun main() {
//
//    println("Bem vindo(a) ao ByteBank")
//
//    val contaAlex = Conta6()
//    contaAlex.titular = "Alex"
//    contaAlex.numero = 1000
//    contaAlex.setSaldo(-200.0)
//
//    val contaFran = Conta6()
//    contaFran.titular = "Fran"
//    contaFran.numero = 1001
//    contaFran.setSaldo(300.0)
//
//    println("Titular: ${contaFran.titular}")
//    println("Número da Conta6: ${contaFran.numero}")
//    println("Saldo Conta6 Fran: ${contaFran.getSaldo()}")
//
//    println("Titular: ${contaAlex.titular}")
//    println("Número da Conta6: ${contaAlex.numero}")
//    println("Saldo Conta6 Alex: ${contaAlex.getSaldo()}")
//
////    println("Depositando na conta do Alex")
////    contaAlex.deposita(50.0)
////    println("Saldo Conta6 Alex: ${contaAlex.saldo}")
////
////    println("Depositando na conta da Fran")
////    contaFran.deposita(70.0)
////    println("Saldo Conta6 Fran: ${contaFran.saldo}")
////
////    println("Sacando na conta do Alex")
////    contaAlex.saca(250.0)
////    println(contaAlex.saldo)
////
////    println("Sacando na conta da Fran")
////    contaFran.saca(100.0)
////    println(contaFran.saldo)
////
////    println("Saque em excesso na conta do Alex")
////    contaAlex.saca(100.0)
////    println("Saldo atual: ${contaAlex.saldo}")
////
////    println("Saque em excesso na conta da Fran")
////    contaFran.saca(500.0)
////    println("Saldo atual: ${contaFran.saldo}")
////
////    println("Transferência da conta da Fran para a conta do Alex")
////    if(contaFran.transfere(800.0, contaAlex)) {
////        println("Transferência efetivada")
////    } else {
////        println("Falha na transferência.")
////    }
////
////    println("Saldo Conta6 do Alex: ${contaAlex.saldo}")
////    println("Saldo Conta6 da Fran: ${contaFran.saldo}")
//
//}
//
//class Conta6 {
//    var titular = ""
//    var numero = 0
//    private var saldo = 0.0
//
//    // Métodos ou Comportamentos da classe:
//    fun deposita(valor: Double) {
//        this.saldo += valor
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
//    fun transfere(valor: Double, destino: Conta6): Boolean {
//        if (saldo >= valor) {
//            saldo -= valor
//            //destino.saldo += valor
//            destino.deposita(valor)
//            return true
//        }
//        return false
//    }
//
//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        if (valor > 0) {
//            saldo = valor
//        }
//    }
//
//
//}
//
////====================================================================
//
//fun testaCopiasEReferencia6() {
//
//    val numerox = 10
//    var numeroy = numerox
//    numeroy++
//
//    println("NumeroX: $numerox")
//    println("NumneroY: $numeroy")
//
//    val contaJoao = Conta6()
//    contaJoao.titular = "João"
//
//    var contaMaria = Conta6()
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