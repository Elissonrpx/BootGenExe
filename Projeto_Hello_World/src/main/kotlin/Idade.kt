fun main(){

    /*
    3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
     */

    println("Entre com a sua idade: ")
    val idade = readln().toInt()

    if(idade in 10 .. 14){
        println("A idade $idade é categoria Infantil")

    }else if(idade in 15 .. 17){
        println("A idade $idade é da categoria Juvenil")
    }else if(idade in 18 .. 25){
        println("A idade $idade é da categoria Adulto")
    }else {
        println("por favor, insira uma idade entre 10 e 25 anos.")
    }
}