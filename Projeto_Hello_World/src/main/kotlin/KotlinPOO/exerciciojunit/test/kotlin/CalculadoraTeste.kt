import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class CalculadoraTeste {


    @Test
    fun somaTest(){
        assertEquals(25 , Calculadora.soma(20, 5))
    }

    @Test
    fun subtracaoTest(){
        assertEquals(2, Calculadora.subtracao(18, 16))
    }

    @Test
    fun multiTest(){
        assertEquals(345, Calculadora.mult(345, 1))
    }
    @Test
    fun divisaoTest(){
        assertEquals(12.0, Calculadora.divisao(60.0, 5.0))
    }

    @Test
    fun powTest(){
        assertEquals(25.0, Calculadora.potencia(5.0,2.0))
    }

    @Test
    fun raizqTest(){
        assertEquals(5.0, Calculadora.raizq(25.0))
    }

}
