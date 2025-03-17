package br.edu.fateczl.ordenacao3;

public class QuickSort {

	public QuickSort() {
		super();
	}
	
	public int[] quickSort(int[] vetor, int inicio, int fim) {
	
		if(fim > inicio) {
			int pivoFixo = dividir(vetor, inicio, fim);
			quickSort(vetor, inicio, pivoFixo-1); //esquerda
			quickSort(vetor, pivoFixo+1, fim); //direita
		}
		return vetor;
	}
	
	public int dividir(int[] vetor, int inicio, int fim) {
		
		int pivo = vetor[inicio];
		int ponteiroEsquerda = inicio + 1;
		int ponteiroDireita = fim;
		
		while (ponteiroEsquerda <= ponteiroDireita) {
			
			while(ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroEsquerda] <= pivo) {
				ponteiroEsquerda++;
			}
			
			while(ponteiroDireita >= ponteiroEsquerda && vetor[ponteiroDireita] > pivo) {
				ponteiroDireita--;
			}
			
			if(ponteiroEsquerda < ponteiroDireita) {
				trocar(vetor, ponteiroEsquerda, ponteiroDireita);
				ponteiroEsquerda ++;
				ponteiroDireita --;
			}
		}
		
		trocar(vetor, inicio, ponteiroDireita);
		return ponteiroDireita;
	}
	
	private void trocar(int[] vetor, int ponteiroEsquerda, int ponteiroDireita) {
		int aux = vetor[ponteiroEsquerda];
		vetor[ponteiroEsquerda] = vetor[ponteiroDireita];
		vetor[ponteiroDireita] = aux;
	}
}
