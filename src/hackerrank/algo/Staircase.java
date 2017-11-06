package hackerrank.algo;

import java.util.Scanner;

public class Staircase {
    public static void printPattern(int n){
        for(int i = 5;i>=0;i--){
        	System.out.println(String.format("%"+(n)+"s",String.format("%-"+(n-i)+"s","").replaceAll(" ","#") ));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printPattern(n);
    }
}
