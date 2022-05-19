fun main(){

    var soma = 0.0
    var cont = 0

    do{

        print("Digite um número: ")
        val num = readln().toInt()

        if(num % 3 == 0 && num != 0){
            soma += num
            cont ++
        }

    }while (num != 0)

    val media = soma / cont
    println("A soma de todos os numero multiplos de 3 digitados é $soma"+
            " e a média desses números é $media")

}