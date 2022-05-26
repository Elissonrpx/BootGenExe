package exerciciocliente

fun main(){
    /*Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão e pelo menos mais
duas opções de construtores conforme sua percepção, com os atributos: nome (String), endereço (String),
telefone (String), listaDeCompras (mutableListOf<Strings>()).

A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.*/

    while(true) {
        println("Bem Vinde!")
        println("\nPor favor, digite o seu nome: ")
        val nome = readln()
        println("\n Agora digite o seu endereço: ")
        val endereco = readln()
        println(
            "Ótimo!" +
                    "\nAgora digite o seu telefone da seguinte forma:" +
                    "\n (DDD)#####-####")
        val telefone = readln()

        try {
            val cliente2 = Cliente2(nome, endereco, telefone)

            while (true) {

                println("      OPÇÔES      ")

                println(
                    "1 - Adicionar Produtos" +
                            "\n 2- Remover Produtos" +
                            "\n 3- Listar Produtos" +
                            "\n 4 - sair\n")

                val opc = readln().toInt()

                when (opc) {

                    1 -> {
                        println("Digite o nome do Produto à ser adicionado na lista: ")
                        val prod = readln()
                        cliente2.addProd(prod)
                    }
                    2 -> {
                        println("Digite o nome do Produto a ser removido na lista: ")
                        val prod = readln()
                        cliente2.rmProd(prod)
                    }
                    3 -> {
                        println("\nLISTA DE PRODUTOS\n")
                        cliente2.listarprod()
                    }
                    4 -> break

                    else -> println("Valor inválido, escolha uma das opções do menu.")
                }
            }
            break
        } catch (e: Exception) {
            println(e.message)
        }
    break
    }


}