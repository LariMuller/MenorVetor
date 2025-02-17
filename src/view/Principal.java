package view;
import controller.MenorController;
import javax.swing.JOptionPane;

/*
 2. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um vetor de inteiros, o
	tamanho do vetor e o valor da última posição do vetor como o primeiro menor valor, retorne o menor
	valor contido neste vetor.
	O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
	O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;
 */
public class Principal {
	public static void main(String args[]) {
		MenorController menor = new MenorController();
		int vet[] = {7, 22, 34, 15, 48, 9, 37, 2, 29, 42};
		int tamanho = vet.length;
		int num = vet[--tamanho];
		
		JOptionPane.showMessageDialog(null, "O menor número desse vetor é " + menor.menorN(vet, tamanho, num));
		
	}
}
