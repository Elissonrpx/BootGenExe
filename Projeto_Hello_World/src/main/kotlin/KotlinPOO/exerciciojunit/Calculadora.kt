import java.lang.Math.pow
import kotlin.math.pow
import kotlin.math.sqrt

class Calculadora {

    companion object{
        fun soma(n1: Int, n2: Int): Int{
            //TODO("Construa a fun soma.")
            return n1 + n2
        }

        fun subtracao(n1: Int, n2:Int):Int{
           //TODO("Construa a fun subtracao.")
            return n1 - n2
        }

        fun mult(n1: Int, n2: Int):Int{
            //TODO("Construa a fun mult.")
            return n1 * n2
        }

        fun divisao(n1: Double, n2: Double):Double{
            //TODO("Construa a fun divisao.")
            return n1 / n2
        }

        fun raizq(n1: Double):Double{
            //TODO("Construa a fun raizq")

            return sqrt(n1)

        }

        fun potencia(n1: Double, n2: Double): Double{
            //TODO("Construa a fun potencia")
            return n1.pow(n2)
        }
    }

}