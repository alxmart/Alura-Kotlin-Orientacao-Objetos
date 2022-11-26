//fun main() {
//
//    println("Bem vindo(a) ao ByteBank")
//
//    val contaxAlex = Contax()
//    contaxAlex.titular = "Alex"
//    contaxAlex.numero = 1000
//    contaxAlex.saldo = 200.0
//
//    val contaxFran = Contax()
//    contaxFran.titular = "Fran"
//    contaxFran.numero = 1001
//    contaxFran.saldo = 300.0
//
//    println(contaxFran.titular)
//    println(contaxFran.numero)
//    println(contaxFran.saldo)
//
//    println(contaxAlex.titular)
//    println(contaxAlex.numero)
//    println(contaxAlex.saldo)
//
//    println("Depositando na conta do Alex")
//    contaxAlex.deposita(50.0)
//    println("Saldo Conta Alex: ${contaxAlex.saldo}")
//
//    println("Depositando na conta da Fran")
//    contaxFran.deposita(70.0)
//    println("Saldo Conta Fran: ${contaxFran.saldo}")
//
//    println("Sacando na conta do Alex")
//    contaxAlex.saca(250.0)
//    println(contaxAlex.saldo)
//
//    println("Sacando na conta da Fran")
//    contaxFran.saca(100.0)
//    println(contaxFran.saldo)
//
//    println("Saque em excesso na conta do Alex")
//    contaxAlex.saca(100.0)
//    println("Saldo atual: ${contaxAlex.saldo}")
//
//    println("Saque em excesso na conta da Fran")
//    contaxFran.saca(500.0)
//    println("Saldo atual: ${contaxFran.saldo}")
//
//    println("Transferência da conta da Fran para a conta do Alex")
//    if(contaxFran.transfere(800.0, contaxAlex)) {
//        println("Transferência efetivada")
//    } else {
//        println("Falha na transferência.")
//    }
//
//    println("Saldo Conta do Alex: ${contaxAlex.saldo}")
//    println("Saldo Conta da Fran: ${contaxFran.saldo}")
//
//
//}
//
//class Contax {
//    var titular = ""
//    var numero = 0
//    var saldo = 0.0
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
//    fun transfere(valor: Double, destino: Contax): Boolean {
//        if (saldo >= valor) {
//            saldo -= valor
//            //destino.saldo += valor
//            destino.deposita(valor)
//            return true
//        }
//        return false
//    }
//}
