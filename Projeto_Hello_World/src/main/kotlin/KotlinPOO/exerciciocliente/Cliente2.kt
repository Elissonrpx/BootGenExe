package exerciciocliente

class Cliente2(
    private var nome : String,
    ) {
    private var endereco = ""
    private var telefone = ""
    private val listaComp = mutableListOf<String>()

    init{
        if(nome == "") throw Exception("Por favor insira um valor no espaço pedido.")
    }
    constructor(nome: String, endereco : String): this(nome){
        this.endereco = endereco
    }

    constructor(nome : String, endereco : String, telefone : String):
            this(nome, endereco){
        this.telefone = telefone
    }

    fun addProd(prod: String) {
        if (prod != "") {
            listaComp.add(prod)
            println("Produto adicionado com Sucesso.")
        } else {
            println("Produto Inválido")
        }
    }

    fun rmProd(prod: String){
        if(listaComp.contains(prod) && listaComp.isNotEmpty()){
            listaComp.remove(prod)
            println("\nProduto removido.")
        }else{
            println("\nProduto não encontrado." +
                    "\nInsira o nome de um Produto contido na Lista.")
        }
    }

    fun listarprod(){
        println("\n======Lista de compras=====\n=")
        listaComp.forEach{
            println(it)
        }
        println()
    }

}
