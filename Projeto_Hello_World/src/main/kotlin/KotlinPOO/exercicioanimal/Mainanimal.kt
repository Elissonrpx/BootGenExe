package exercicioanimal

fun main(){

    val cachorro = Cachorro ("Tobby", 2)
    val cavalo = Cavalo ("Spirit", 10)
    val preguica = Preguica ("Sally", 8)

    cachorro.emitirSom()
    cavalo.emitirSom()
    preguica.emitirSom()

    println()

    cachorro.deslocamento()
    cavalo.deslocamento()
    preguica.deslocamento()

}