fun main() {

    println("Bem vindo(a) ao ByteBank")

    val contaAlex = Conta4()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.0

    val contaFran = Conta4()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

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

}


class Conta4 {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    // Métodos ou Comportamentos da classe:
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
}

//====================================================================

fun testaCopiasEReferencia2() {

    val numerox = 10
    var numeroy = numerox
    numeroy++

    println("NumeroX: $numerox")
    println("NumneroY: $numeroy")

    val contaJoao = Conta4()
    contaJoao.titular = "João"

    var contaMaria = Conta4()
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("Titular conta Joao: ${contaJoao.titular}")
    println("Titular conta Maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)

}

//====================================================================

