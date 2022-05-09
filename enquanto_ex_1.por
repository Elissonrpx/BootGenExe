programa
{
	
	funcao inicio()
	{
	/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e 
	 * apresente no final o total do somatório, a média e o total de valores lidos. 
	 * O programa deve fazer as leituras dos valores enquanto o usuário estiver 
	 * fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário 
	 * fornecer um valor negativo.
*/
		inteiro soma = 0, media = 0, num =0, tn = 0

		enquanto(num >= 0){

			
			escreva("\nDigite um número: ")
			leia(num)

			soma += num
			tn++
			media = soma / tn
			escreva("\nValor total até o momento: ", soma)
			escreva("\nA media dos valores é: ", media)
		}

		soma -= num
		tn --
		media = soma / tn
		escreva("\nValor total até o momento: ", soma)
		escreva("\nA media dos valores é: ", media)
		escreva("\nTotal de números inseridos: ", tn)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 564; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */