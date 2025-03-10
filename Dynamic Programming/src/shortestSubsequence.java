/*Shortest Subsequence
Gary has two string S and V. Now, Gary wants to know the length shortest subsequence in S, which is not a subsequence in V.
Note: The input data will be such that there will always be a solution.
Input Format :
The first line of input contains a string, that denotes the value of S.
The following line contains a string, that denotes the value of V.
Output Format :
Length of shortest subsequence in S such that it is not a subsequence in V
Constraints:
1 <= |S| <= 1000 (|x| implies the length of the string x)
1 <= |V| <= 1000 
Time Limit: 1 second
Sample Input 1:
babab
babba
Sample Output 1:
3
Explanation:
"aab" is the shortest subsequence which is present in S and absent in V.*/
public class shortestSubsequence {
	static final int MAX = 1005; 
	public static void main(String[] args) {
		System.out.print(solve("babab","babba"));
	}

	public static int solve(String S,String V){

		int storage[][] = new int[S.length() + 1][V.length() + 1];
		for( int i = 0; i < S.length() + 1; i++ ) {
			for( int j = 0; j < V.length() + 1; j++ ) {
				storage[i][j] = -1;
			}
		}
		return solveM( S, V, storage );
	}

	private static int solveM(String s, String v, int[][] storage) {

		int m = s.length();
		int n = v.length();

		if(m == 0 ) {
			storage[m][n] =  MAX;
			return storage[m][n];
		}
		if( n == 0 ) {
			storage[m][n] =  1;
			return storage[m][n];
		}
		if( storage[m][n] != -1 ) {
			return storage[m][n];
		}
		//If shortest subsequence does't include first character of string S
		int op1 = solveM( s.substring(1), v, storage );

		//If includes
		int index;
		for( index = 0; index < v.length(); index++ ) {
			if( v.charAt(index) == s.charAt(0) ) {
				break;
			}
		}
		int op2 = 1;
		if( index == v.length() ) {
			storage[m][n] =  1;
			return storage[m][n];
		}
		else {
			//ie character found in V
			op2 = 1 +  solveM( s.substring(1), v.substring(index+1),storage);
		}
		storage[m][n] =  Math.min(op1, op2);
		return storage[m][n];
	}

}
