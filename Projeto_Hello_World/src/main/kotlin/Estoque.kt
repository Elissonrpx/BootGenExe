fun main(){
/*
Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.

----O programa para quando o usuário remove um item da lista e aperta ENTER ---
à ser melhorado.
 */
    val estoque = mutableListOf<String>()

    println("Olá, você está acessando o estoque."+
            "\nEscolha abaixo uma das opções:")

    println("1- Adicionar produtos ao estoque."+
            "\n2 - Remover produtos do estoque."+
            "\n3 -Atualizar dados do estoque."+
            "\n4 -Ver lista de produtos." +
            "\n5 - Sair do Programa")

    while(true) {

        when (readln()) {
            "1" -> println("PRODUTO: ${addproduto(estoque)}")
            "2" -> {println("REMOVENDO PRODUTO... ${removerproduto(estoque)}")
                break
            }
            "3" -> println("ATUALIZANDO PRODUTO...${attproduto(estoque)}")

            "4" -> {mostrarlista(estoque)}

            "5" -> {
                println("Obrigado por sua contribuição.")
                break
            }


        }
    }
    }
fun addproduto(estoque:MutableList<String>): MutableList<String>{
    while(true){
        println("Digite o produto para ser cadastrado no estoque." +
                "\nOu pressione ENTER para sair.")
        val produto = readln()
        if(produto !=""){
            estoque.add(produto)
        }else{
            break
        }
    }
    return estoque
}
fun removerproduto(estoque:MutableList<String>): MutableList<String>{
    while(true){
        println("Digite um produto para remover do estoque." +
                "\nOu pressione ENTER para sair.")
        val removproduto = readln()
        if(removproduto != ""){
            estoque.remove(removproduto)
        }else{
            break
        }
    }
    return estoque
}
fun attproduto(estoque:MutableList<String>): MutableList<String>{
    print("Digite agora um produto que você queira editar:")
    val edit = readln()

    if(estoque.contains(edit)){
        val index = estoque.indexOf(edit)
        println("Digite o novo produto: ")
        val novoproduto = readln()
        estoque[index] = novoproduto
        println("O nome foi atualizado com sucesso!")
    }else{
        println("O nome $edit não existe na lista.")
    }
    return estoque
}
fun mostrarlista(estoque:MutableList<String>): MutableList<String>{
    println(estoque)
    return estoque
}