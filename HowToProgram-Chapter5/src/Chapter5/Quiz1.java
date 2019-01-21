package Chapter5;

import java.util.Scanner;
import java.security.SecureRandom;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int nums[] = generateNums();
		int result = nums[0] * nums[1];
		
		System.out.print("How much is "+ nums[0] +" times "+nums[1]+" ?");
		int user_answer = input.nextInt();
		
		while(true) {
			if(result == user_answer) {
				System.out.println("Very good!");
				break;
			} else {
				System.out.println("No. Please try agian.");
			}
			
			System.out.print("How much is "+ nums[0] +" times "+nums[1]+" ? ");
			user_answer = input.nextInt();
		}
		
	}
	
	public static int[] generateNums() {
		SecureRandom randomNumbers = new SecureRandom();
		int[] nums = {0,0};
		nums[0] = 1 + randomNumbers.nextInt(10);
		nums[1] = 1 + randomNumbers.nextInt(10);
		
		return nums;
	}
}
