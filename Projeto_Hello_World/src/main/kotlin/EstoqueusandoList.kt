fun main(){

/*
Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Kotlin para manipular os dados desse
estoque, oprograma deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
 */
    val estoque = mutableListOf<String>()

    while(true){
        println("Bem vindo ao Estoque de lojas."+
                "\nEscolha uma opção")
        println("1- Adicionar Produtos")
        println("2- Remover Produtos")
        println("3- Atualizar Produtos")
        println("4- Exibir Produtos")
        println("5- Sair\n")

        print("Opção: ")
        val op = readln().toInt()

        when(op){
            1 -> {
                println("Digite o produto para ser cadastrado no estoque." +
                        "\nOu pressione ENTER para sair.")
                val produto = readln()
                if(produto !=""){
                    estoque.add(produto)
                    println("Produto cadastrado!\n")
                }else{
                    println("O nome do produto não pode ser vazio")
                    break
                }
            }
            2-> {
                println("Digite o produto a ser deletado: ")
                val removproduto = readln()
                if(removproduto.contains(removproduto)){
                    estoque.remove(removproduto)
                    println("Produto removido com sucesso!")
                }else{
                    println("Produto não existe na lista.\n")
                }
            }

            3-> {
                println("Lista de produtos\n")
                estoque.forEach{
                    println(it)
                }
                println("\nDigite um produto a ser atualizado: ")
                val attprod = readln()
                if(estoque.contains(attprod)){
                    val index = estoque.indexOf(attprod)

                    println("Digite o novo produto: ")
                    val novoprod = readln()
                    estoque[index] = novoprod

                    println("produto atualizado com sucesso!")

                }else{

                    println("Produto não existe na lista\n")
                }

            }

            4 ->{
                println("Lista de Produtos\n")
                estoque.forEach{
                    println(it)
                }

            }
            5 -> break
            else -> println("Valor Inválido\n")

        }

    }



}