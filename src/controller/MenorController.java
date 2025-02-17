package controller;

public class MenorController {
	public MenorController() {
		super();
	}
	public int menorN(int[]v, int t, int m) {
		//Condição de parada: Primeira posição do Vetor alcançada
		if(t == 0) {
			return m;
		} else {
		//Chamada dos passos: Comparação de valores do número passado com a ultima posição do vetor, retorna o menor valor e chama novamente passando tamanho - 1
			if (v[t] < m) {
				return menorN(v, t-1, v[t]);
			} else {
				return menorN(v, t-1, m);
			}
				
			
		}
	}
}
