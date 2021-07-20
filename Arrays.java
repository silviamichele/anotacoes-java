public class Arrays{
	public static void main(String[] args) {
		// arrays dimensionais e bidimensionais com java

		// declaração de array dimensional
		int[] array_oned_1;

		//para inserção de valores
		int[] array_oned_2 = new int[3];
		array_oned_2[0] = 0;
		array_oned_2[1] = 1;
		array_oned_2[2] = 2;

		int[] array_oned_3 = {0, 1, 2};

		//declaração de array bidimensional
		int[][] array_bid_1 = new int[3][3];
		array_bid_1[0][0] = 1;
		// ...

		int[][] array_bid_2 = {{10, 11}, {12, 13}, {14, 15}};

		// percorrendo o array de uma dimensão
		for (int n=0; n < array_oned_2.length; n++) {
			System.out.println(array_oned_2[n]);
		}

		// percorrendo o array bidimensional
		for (int i=0; i < array_bid_2.length; i++) {
			for (int j=0; j < array_bid_2[i].length; j++ ) {
				System.out.print(array_bid_2[i][j] + " ");
			}
			System.out.println();
		}
	}

}