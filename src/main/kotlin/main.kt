fun main() {
    println("Bem vindo(a) ao Bytebank.")
    println()

    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.0

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
    println()

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("Depositando na conta do Alex")
    contaAlex.deposita( 50.0)
    println("Saldo do Alex: ${contaAlex.saldo}")

    println("Depositando na conta da Fran")
    contaFran.deposita( 70.0)
    println("Saldo da Fran: ${contaFran.saldo}")

    println("Sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("Sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("Saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("Saque em excesso na conta da Fran")
    contaAlex.saca(500.0)
    println(contaAlex.saldo)

    println("TRansferências da conta da Fran pra conta do Alex")
    if (contaFran.transfere(300.0, contaAlex)) {
        println("TRansferência efetuada")
    } else {
        println("Falha na TRansferência")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)



}


class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
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



