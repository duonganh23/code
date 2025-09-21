/*
	Specify the complexity of the piece of codes below 
*/
//1
public class Calculate_Complexity_Exercises_2 {

	// Example variable declarations for demonstration
	int n = 10;
	int[][] A = new int[n][n];

	//1
	public void example1() {
		for (int i = 0; i < n; i++) {
			System.out.println("Hey - I'm busy looking at: " + i);
		}
	}

	//2.
	public void example2() {
		for (int i = 1; i <= Math.pow(2, n); i += 2) {
			System.out.println("Hey - I'm busy looking at: " + i);
		}
	}

	//3.1
	public void example3_1() {
		for (int i = 1; i <= n; i++) {        //Outer loop
			for (int j = 1; j <= 10; j++) {   //Inner loop
				System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
			}
		}
	}

	//3.2
	public void example3_2() {
		for (int i = 1; i <= n; i++) {        //Outer loop
			for (int j = 1; j <= i; j++) {    //Inner loop
				System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
			}
		}
	}

	//4.1
	public void example4_1() {
		for (int i = 1; i <= n; i = i * 2) {
			System.out.println("Hey - I'm busy looking at: " + i);
		}
	}

	//4.2
	public void example4_2() {
		for (int i = 1; i <= n; i++) {            //Outer loop
			for (int j = 1; j <= n; j = j * 2) {  //Inner loop
				System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
			}
		}
	}

	//-------------------------------------
	//5.
	public void example5() {
		// int i = 0;
		int tempN = n;
		while (tempN % 2 == 0 && tempN != 0) {
			tempN = tempN / 2;
		//	i++;
		}
	}

	//6.1
	public void example6_1() {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				A[i][j] = 0;
		for (int k = 0; k < n; k++)
			A[k][k] = 1;
	}

	//6.2
	public void example6_2() {
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				A[i][j] = 0;
		for (int k = 0; k < n; k++)
			A[k][k] = 1;
	}

	//6.3
	public void example6_3() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				A[i][j] = 0;
			for (int k = 0; k < n; k++)
				A[k][k] = 1;
		}
	}
	//-----------------------------
	//7. 
	public int fib(int n) {
		if (n <= 2) return 1;
		return fib(n - 1) + fib(n - 2);
	}
}

