fun main() {
    //1- Faça um programa que receba três inteiros e diga qual deles é o maior.

    print("Entre com o primeiro número:")
    val n1 = readln().toInt()
    print("Entre com o segundo número:")
    val n2 = readln().toInt()
    print("Entre com o terceiro número:")
    val n3 = readln().toInt()

    if(n1 > n2 && n1 > n3){
        println("O número, $n1, é maior.")

    }else if(n2 > n1 && n2 > n3){

        println("O número, $n2, é maior.")

    }else {
        println("O número, $n3, é maior.")
    }
}