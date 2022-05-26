package exercicioanimal

class Cavalo(override var nome: String, override var idade: Int) : Animal {
    override fun emitirSom() {
        println("Relinchando como um cavalo.")
    }

    override fun deslocamento() {
        println("O cavalo \nGalopa" +
                "\nGalopa" +
                "\nGalopa" +
                "\nPE - DRO - SAM - PAI - OH, VAI!!")
    }
}