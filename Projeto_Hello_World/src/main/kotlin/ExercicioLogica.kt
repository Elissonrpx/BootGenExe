fun main(){
// Variáveis: Nome, Idade, Altura, Peso

    println("Olá! Escreva seu nome: ")
    val nome: String = readln()

    println("Agora escreva a sua idade: ")
    val idade:Int = readln().toInt()
    println("Obrigado!" +
            "Agora digite a sua altura: ")
    val altura = readLine()!!.toDouble()

    println("Legal!" +
            "Agora digite seu peso, por favor: ")
    val peso = readLine()!!.toDouble()


    println("Nome: $nome")
    println("Idade: $idade")
    println("Altura: $altura")
    println("Peso: $peso")


}

