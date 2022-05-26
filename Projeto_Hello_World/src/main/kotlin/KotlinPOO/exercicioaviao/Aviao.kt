class Aviao(    var turbina: Int,
                var asas : Int,
                var cor : String,
                var trempouso : Boolean,
                var modelo : String,
                var luzes: Boolean = false
                           ) {

    var voando = false


    fun voar(){
        if (voando) {
            println("O avião está voando")
        }else{
            voando = true
            println("O avião vai voar")
        }
    }
    fun pousar(){
        if(voando){
            voando = false
            println("O avião acabou de pousar.")
        }else{
            println("O avião está no chão.")
        }
    }

    fun trempouso(){
        if(voando){
            println("Trem de pouso recolhido.")
        }else{
            println("Trem de pouso a postos.")
        }

    }
}
    fun ligDesligluzes(){
        var luzes = false
        if(luzes){
            luzes= false
            println("Luzes desligadas.")
        }else{
            luzes = true
            println("Luzes Ligadas.")
        }
    }