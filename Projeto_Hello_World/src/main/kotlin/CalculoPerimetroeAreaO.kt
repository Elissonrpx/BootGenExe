import kotlin.math.pow

fun main (){

    //Ler o raio de um circulo a partir de entrada de Usuário e com isso calcular
    //circunferência e área desse círculo.

    print("Digite aqui o diâmetro do círculo a ser calculado: " )

    val diam = readln().toDouble()
    val raio = diam / 2
    val area = 3.14 * (raio * raio)
    val peri = 3.14 * diam

    println("A área do círculo é de ${"%.2f".format(area)}, e seu perímetro é de: ${"%.2f".format(peri)}")

}
