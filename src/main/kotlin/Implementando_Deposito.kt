fun main() {

    println("Bem vindo(a) ao ByteBank")

    val contaxAlex = Contax()
    contaxAlex.titular = "Alex"
    contaxAlex.numero = 1000
    contaxAlex.saldo = 200.0

    val contaxFran = Contax()
    contaxFran.titular = "Fran"
    contaxFran.numero = 1001
    contaxFran.saldo = 300.0

    println(contaxFran.titular)
    println(contaxFran.numero)
    println(contaxFran.saldo)

    println(contaxAlex.titular)
    println(contaxAlex.numero)
    println(contaxAlex.saldo)

    println("Depositando na conta do Alex")
    deposita(contaxAlex, 50.0)
    println("Saldo Conta Alex: ${contaxAlex.saldo}")

    println("Depositando na conta da Fran")
    deposita(contaxFran, 70.0)
    println("Saldo Conta Fran: ${contaxFran.saldo}")

}

fun deposita(contax: Contax, valor: Double) {
    contax.saldo += valor
}

class Conta3 {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

//====================================================================

fun testaCopiasEReferencia() {

    val contaxJoao = Contax()
    contaxJoao.titular = "João"

    var contaxMaria = Contax()
    contaxMaria.titular = "Maria"
    contaxJoao.titular = "João"

    println("Titular conta Joao: ${contaxJoao.titular}")
    println("Titular conta Maria: ${contaxMaria.titular}")

    println(contaxJoao)
    println(contaxMaria)

}

//====================================================================

