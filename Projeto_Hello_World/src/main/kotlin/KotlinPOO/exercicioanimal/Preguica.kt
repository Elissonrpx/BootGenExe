package exercicioanimal

class Preguica(override var nome: String, override var idade: Int) : Animal {
    override fun emitirSom() {
        println("emitindo som da Preguiça")
    }

    override fun deslocamento() {
        println("Preguiça escalando")
    }
}