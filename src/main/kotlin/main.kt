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


    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)
    println()

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)





}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}



