fun main() {

    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }
/*
    i 1
    j 1
    j 2
    j 3
    j 4
    j 5

 */

}



