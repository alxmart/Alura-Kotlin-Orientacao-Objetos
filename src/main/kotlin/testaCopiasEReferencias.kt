fun testaCopiasEReferencias() {

    val numerox = 10
    var numeroy = numerox
    numeroy++

    println("NumeroX: $numerox")
    println("NumneroY: $numeroy")

    val contaxJoao = Contax()
    contaxJoao.titular = "João"
    var contaMaria = contaxJoao

    contaMaria.titular = "Maria"
    // Alterando o mesmo objeto (contaJoao) Referência e não uma cópia !

    contaxJoao.titular = "João"
    // Alterou titular nos 2 objetos ( Joao => João / Maria => João )

    println("Titular conta Joao: ${contaxJoao.titular}")
    println("Titular conta Maria: ${contaMaria.titular}")

    println(contaxJoao) //  Imprimiu: Conta@19dfb72a
    println(contaMaria) //  Imprimiu: Conta@17c68925

}

class Contax {
    fun deposita(d: Double) {

    }

    var titular = ""
    var numero = 0
    var saldo = 0.0
}
