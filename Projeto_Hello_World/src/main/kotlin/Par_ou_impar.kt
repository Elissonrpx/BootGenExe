import java.lang.Math.sqrt
import kotlin.math.pow

fun main(){

    /*
    Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
     */

    println("Entre com um número qualquer e veja a mágica acontecer:")
    val num = readln().toDouble()

    if (num % 2 == 0.0){
        println("O número $num é PAR e sua raiz quadrada é: ${"%.2f".format(sqrt(num))}")
    }else {
        println("O número $num é IMPAR e ele elevado ao quadrado é: ${num.pow(2)}")
    }
}