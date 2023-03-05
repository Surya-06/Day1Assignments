package week1.day1;
public class Fibbinocci {
	public static void main(String[] args) {
		
//		a) Create a class by name: Fibbinocci
//	b) Create a main method using shortcut
//	c) Write a logic to print fibbinocci from 0 to 56
		
		//Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
		//Print first number
		//Iterate from 1 to the 11
		//Add first and second number assign to sum
		//Assign second number to the first number
		//Assign sum to the second number
		//Print sum

		int firstNum = 0;
		int secNum = 1;
		int sum=0;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i = 1; i <=11; i++) {
			sum=firstNum+secNum;
			System.out.println( sum);
			firstNum=secNum;
			secNum=sum;
			
}}}




