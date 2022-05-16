import kotlin.math.roundToInt
import kotlin.math.roundToLong

fun main(){
    //calculadora  IMC = peso / altura (em metro) ²
    //println = já pula a linha. (não é interessante para entrada de dados dos usuários)

    imc()






}
fun imc(){
    print("Insira aqui o seu peso: ")
    val peso = readLine()!!.toDouble()

    print("Insira aqui a sua altura: ")
    val altura = readLine()!!.toDouble()

    val imc = peso/(altura*altura)
    val imcf = "%.2f".format(imc)

    if(imc<18.5){
        println("Seu IMC é: $imcf" + ".Seu peso está abaixo do normal")
    }else if(imc>=18.5 && imc < 25.5){
        println("Seu IMC é: $imcf" + ".Você está com peso normal.")
    }else if(imc>=25.5 && imc < 29.9){
        println("Seu IMC é: $imcf" + ". Você está com Sobrepeso.")
    }else if(imc >= 30 && imc < 34.9){
        println("Seu IMC é: $imcf" + ".Você está com Obesidade I")
    }else if (imc >= 35 && imc < 39.9){
        println("Seu IMC é: $imcf" + ".Você está com Obesidade II")
    }else{
        println("Seu IMC é: $imcf" + ".Você está com Obesidade III")
    }
}