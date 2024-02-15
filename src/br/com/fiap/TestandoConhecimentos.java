package br.com.fiap;

public class TestandoConhecimentos {
	public static void main(String[] args) {
		System.out.println("Testando os conhecimentos em Java \n");
		
		System.out.println("1. Explique Orientação à Objetos. \n");
		
		System.out.println("Orientação à objetos seria uma forma de entender a complexidade do mundo"
				+ " de maneira mais simples. Você abstrai, transformando em grupos, que possuem um "
				+ "nome, atributos e metódos. Você entende completamente o problema antes de "
				+ "codificar completamente, e isso também facilita o código, podendo reutilizar "
				+ "conforme seu trabalho.");
		
		System.out.println("2. Explique o que é objeto.");
		System.out.println("Objeto é tudo aquilo que eu posso visualizar na vida real e posso" 
				+ " representar através de classes. Como por exemplo, Letícia, Sofia e Joana, são" 
				+ " exemplos de objetos que podem ser representados na classe Homem, que será utilizada"
				+ " como exemplo na próxima questão.");
		
		System.out.println("3. Explique o que é classe.");
		System.out.println("Toda classe são criadas através de objetos que possuem características em" 
				+ " comum. A classe possui seus atributos com valores (que diferem entre si) e que" 
				+ " tornam a classe ser o que é. Também possuem os metódos, que são os comportamentos" 
				+ "que aquele objeto possui.");
		System.out.println("Um exemplo clássico seria a própria Mulher que pode possuir atributos como"
				+ " raça, etnia, altura, cor dos olhos e cor dos cabelos; em relação aos metódos," 
				+ " simplificando, poderiam ser andar(), falar(), sentir() e maquiar().");
		
		System.out.println("4. Explique o que é abstração.");
		System.out.println("Abstração seria a forma de descomplexar o objeto. Como exemplo usado" 
				+ " anteriormente, Letícia, Sofia e Joana são pessoas com seus valores diferentes e relação aos"
				+ " seus atributos. Mas todas elas são mulheres (nesse exemplo em específico). Mais ainda, poderia"
				+ " abstrair/simplificar e dizer que todas da classe ser humano.");
		
		System.out.println("5. Explique o que é herança.");
		System.out.println("Partindo do exemplo citado na questão anterior, que a abstração nos levaria"
				+ " a Ser humano, teriam os atributos que os seres humanos possuem como raça, etnia," 
				+ " altura, cor dos olhos e cor dos cabelos; em relação aos metódos, simplificando em algo"
				+ " comum, poderiam ser andar(), falar() e sentir(). ");
		System.out.println("A partir dessa ideia, poderíamos ter a herança de Homem e Mulher que,"
				+ " herdando as características da classe ser humano, teriam alguns atributos e até mesmo" 
				+ " metódos próprios, mas partindo da ideia que todos partem de um mesmo princípio, vulgo,"
				+ " a mesma classe.");
		
		System.out.println("6. Explique o que é encapsulamento.");
		System.out.println("Encapsulamento partiria do princípio de simplificar diferentes procedimentos"
				+ " que podemos realizar em um algoritmo. Por exemplo, em um sistema de livraria, podemos" 
				+ " cadastrar livros novos e consultar livros já anteriormente cadastrados. Ao invés de" 
				+ " escrever a todo momento que desejamos cadastrar um livro novo o mesmo código, que iria"
				+ " se repetir 300 vezes e consequentemente deixar o código sujo, podemos transformar isso" 
				+ " em uma função, ou como definimos aqui, o encapsulamento. Isso valeria para o mesmo" 
				+ " exemplo de consultar livros. Ao invés de ficarmos escrevendo o mesmo código diversas" 
				+ " vezes, encapsulamos e transformamos em algo único e relativamente simples. ");
		
		System.out.println("7. Explique o que é polimorfismo.");
		System.out.println("Pode ser definido como algo que possui muitas formas. Através de um único" 
				+ " nome, gerar diversos comportamentos diferentes. Como por exemplo, o verbo abrir." 
				+ " Podemos abrir uma caixa de papelão que chegou de uma entrega, podemos abrir uma janela"
				+ " para entrar um ar, abrir uma conta bancária para depositarmos dinheiro ou abrir o" 
				+ " caderno para escrever. Do mesmo verbo, se originou diferentes formas do que podemos"
				+ " realizar.");
		
		System.out.println("8. Quais são os principais tipos de polimorfismo? Explique cada um deles.");
		System.out.println("Os dois principais tipos de polimorfismo são:");

		System.out.println("- Sobrescrita: sobreescrevendo. Costuma acontecer em casos de herança." 
				+ " Como exemplo, todo carro tem pedal, mas em carros básicos a potencialidade é diferente"
				+ " que em carros luxuosos. O metódo acelerador nesse caso, no objeto carro, iria se herdar"
				+ " em CarroLuxuoso e CarroBásico, mas o comportamento do metódo acelerador(). Nesse caso," 
				+ " é necessário escrever o que herdou, como se estivesse sobreescrevendo o metódo da" 
				+ " classe-mãe (carro). Possui o mesmo nome mas com comportamentos diferentes.");
				
		System.out.println("- Sobrecarga: quando dois ou + metódos possuem o mesmo nome, entretanto," 
				+ " assinaturas diferentes. Como exemplo, os metódos são: exibir(texto) e"
				+ " exibir(texto, numero). Assinatura seriam esses parametros");
	}
}
