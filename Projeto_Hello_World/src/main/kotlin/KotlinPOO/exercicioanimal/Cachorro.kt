package exercicioanimal

class Cachorro(override var nome: String, override var idade: Int) :Animal {
    override fun emitirSom() {
        println("Au! Au! Au!")
    }

    override fun deslocamento() {
        println("Correndo como um cachorro")
    }
}