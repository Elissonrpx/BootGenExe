fun main(){
    /*
    4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
    o número de pessoas calmas;
    o número de mulheres nervosas;
    o número de homens agressivos;
    o número de outros calmos;
    o número de pessoas nervosas com mais de 40 anos;
    o número de pessoas calmas com menos de 18 anos.
     */
    var cont = 0
    var idade = 0
    var sexo = 0
    var opcao = 0
    var pcalmas = 0
    var mNerv = 0
    var hAgr = 0
    var outcalmos = 0
    var pnnm40 = 0
    var pcm18 = 0


    while (cont < 5){
        println("***Pessoa ${cont + 1}***")

        println("Digite a idade: ")
        idade = readln().toInt()

        println("Digite o sexo(1 - Feminino, 2- Masculino, 3 - Outros): ")
        sexo = readln().toInt()

        println("Você é uma pessoa: 1- Calma; 2- Nervosa ou 3- Agressiva")
        opcao = readln().toInt()

        if(opcao ==1){
            pcalmas++
        }
        if(sexo == 1 && opcao == 2){
            mNerv++
        }

        if(sexo == 2 && opcao == 3){
            hAgr++
        }

        if(sexo == 3 && opcao == 1){
            outcalmos++
        }

        if(opcao == 2 && idade > 40){
            pnnm40++
        }
        if(opcao ==1 && idade < 18){
            pcm18++
        }

        cont++

    }
    println("O número de pessoas calmas é: $pcalmas")
    println("O número de mulheres nervosas é: $mNerv")
    println("o número de homens agressivos é: $hAgr")
    println("o número de outros calmos: $outcalmos")
    println("o número de pessoas nervosas com mais de 40 anos é: $pnnm40")
    println("o número de pessoas calmas com menos de 18 anosé: $pcm18")
}