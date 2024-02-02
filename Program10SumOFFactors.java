package ai.dv.ui.as;

import java.util.Scanner;
public class Program10SumOFFactors {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int number = scan.nextInt();
		scan.close();
		int sum=0;
		for(int i=1;i<=number;i++){
			if(number%i==0){
				sum = sum+i;
			}
		}
		System.out.println("Sum of Factors: "+sum);
	}
}
