package print.patterns;

public class MatrixDiagnoally {
public static void main(String[] args) {
	int n = 4;
	int m = 3;
	String[][] arr = new String[n][n];
	arr[0] = new String[]{"1","2","3"};
	arr[1] = new String[]{"4","5","6"};
	arr[2] = new String[]{"7","8","9"};
	arr[3] = new String[]{"10","11","12"};
	// for n*n matrix
	int max  = (int)Math.pow(2, n-1);
	//for m*n matrix
	max = n+m-2;
	System.out.println(max);
	for(int i = 0; i<=max;i++){
		for(int j=0;j<=i;j++){
//			this condition is for n * n
//			if(j<n&&(i-j)<n)
//			this condition is for n * m
			if(j<n&&(i-j)<m)
			System.out.print(arr[j][i-j]+" ");
		}
		System.out.println(" ");
	}
}
}
