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

//    println(contaFran.titular)
//    println(contaFran.numero)
//    println(contaFran.saldo)
//
//    println(contaAlex.titular)
//    println(contaAlex.numero)
//    println(contaAlex.saldo)

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
    var titular = ""
    var numero = 0
    var saldo = 0.0
}
