fun main(){

    println("Digite o primeiro número a ser somado: ")
    val num1 = readln().toInt()
    println("Digite o segundo número a ser somado: ")
    val num2 = readln().toInt()
    println("--------------------------------------------------------------")
    println("Agora digite o número correspondente à operação que você deseja:" +
            "\n1- SOMA" +
            "\n2- SUBTRAÇÃO" +
            "\n3- MULTIPLICAÇÃO" +
            "\n4- DIVISÃO")
    val op = readLine()

    when(op){

        "1" -> println("A soma de $num1 + $num1 é igual a: ${soma(num1, num1)}")
        "2" -> println("A subtração de $num1 + $num1 é igual a: ${sub(num1, num1)}")
        "3" -> println("A multiplicação de $num1 + $num1 é igual a: ${multi(num1, num1)}")
        "4" -> println("A divisão de $num1 + $num1 é igual a: ${divisao(num1.toDouble(), num1.toDouble())}")


    }

}


fun soma(n1 : Int, n2 : Int): Int {
    val resultsoma = n1 + n2
    return resultsoma

}

fun sub(n1 : Int, n2 : Int): Int {
    return n1 - n2

}

fun multi(n1 : Int, n2: Int): Int{
    return n1 * n2

}

fun divisao(n1 : Double, n2: Double): Double{
    return n1 / n2


}
