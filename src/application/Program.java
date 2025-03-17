package application;

import br.edu.fateczl.ordenacao3.QuickSort;

public class Program {

	public static void main(String[] args) {
		
		int[] vetor = {2,0,1,3,7,8,5,4,9,6};
		
		QuickSort sort = new QuickSort();
		int inicio = 0;
		int fim = vetor.length-1;
		vetor = sort.quickSort(vetor, inicio, fim);
		
		for(int i : vetor) {
			System.out.print("["+i+"]");
		}
		

	}

}
