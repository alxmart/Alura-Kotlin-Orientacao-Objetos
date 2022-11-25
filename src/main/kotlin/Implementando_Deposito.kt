fun main() {

    println("Bem vindo(a) ao ByteBank")

    val conta3Alex = Conta3()
    conta3Alex.titular = "Alex"
    conta3Alex.numero = 1000
    conta3Alex.saldo = 200.0

    val conta3Fran = Conta3()
    conta3Fran.titular = "Fran"
    conta3Fran.numero = 1001
    conta3Fran.saldo = 300.0

    println(conta3Fran.titular)
    println(conta3Fran.numero)
    println(conta3Fran.saldo)

    println(conta3Alex.titular)
    println(conta3Alex.numero)
    println(conta3Alex.saldo)

    println("Depositando na conta do Alex")
    deposita(conta3Alex, 50.0)
    println("Saldo Conta Alex: ${conta3Alex.saldo}")

    println("Depositando na conta da Fran")
    deposita(conta3Fran, 70.0)
    println("Saldo Conta Fran: ${conta3Fran.saldo}")

}
fun deposita(conta3: Conta3, valor: Double) {
    conta3.saldo += valor
}

class Conta3 {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

//====================================================================
//
//fun testaCopiasEReferencia() {
//
//    val contaxJoao = Contax()
//    contaxJoao.titular = "João"
//
//    var contaxMaria = Contax()
//    contaxMaria.titular = "Maria"
//    contaxJoao.titular = "João"
//
//    println("Titular conta Joao: ${contaxJoao.titular}")
//    println("Titular conta Maria: ${contaxMaria.titular}")
//
//    println(contaxJoao)
//    println(contaxMaria)
//
//}

//====================================================================