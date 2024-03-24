public class largestRowCol {
	
	public static void main(String[] args) {

		int input[][] = { { 1, 2, 3, 4, 11 }, { 5, 6, 7, 8, 22 }, { 9, 10, 11, 12, 33 } };

		int row = input.length;
		int col = input[0].length;

		int MAXcol = Integer.MIN_VALUE;
		int MAXrow = Integer.MIN_VALUE;

		int Column=0;
		int Row=0;

		//Calculating max sum among columns
		for(int j=0; j<col; j++){
			int Sum = 0;
			for(int i=0; i<row; i++){
				Sum = Sum + input[i][j]; 

			}
			if(Sum > MAXcol){
				MAXcol = Sum;
				Column = j;
			}
		}
		//Calculating max sum among rows
		for(int i=0; i<row; i++){
			int Sum = 0;
			for(int j=0; j<col; j++){
				Sum = Sum + input[i][j]; 

			}
			if(Sum > MAXrow){
				MAXrow = Sum;
				Row = i;
			}
		}
		if(MAXrow>MAXcol){
			System.out.print("row" + " " +  Row + " " + MAXrow );
		}
		else{
			System.out.print("column" + " " +  Column + " " + MAXcol );
		}
	}
}