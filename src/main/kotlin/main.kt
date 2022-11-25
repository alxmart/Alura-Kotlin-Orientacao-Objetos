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
    deposita(contaAlex, 50.0)
    println("Saldo do Alex: ${contaAlex.saldo}")

    println("Depositando na conta da Fran")
    deposita(contaFran, 70.0)
    println("Saldo da Fran: ${contaFran.saldo}")

}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor

}




class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}



