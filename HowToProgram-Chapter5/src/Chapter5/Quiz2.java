package Chapter5;

import java.util.Scanner;
import java.security.SecureRandom;

public class Quiz2 {
	public static void main(String[] args) {
		String[] correct_resp = {"Vera good!", "Excellent!", "Nice work!", "Keep up the good work!"};
		String[] incorrect_resp = {"No. Please try again.", "Wrong. Try once more.", "Dont give up!", "No. Keep trying."};
		
		Scanner input = new Scanner(System.in);
		SecureRandom randomNumbers = new SecureRandom();
		
		int nums[] = generateNums();
		int result = nums[0] * nums[1];
		
		System.out.print("How much is "+ nums[0] +" times "+nums[1]+" ?");
		int user_answer = input.nextInt();
		
		while(true) {
			if(result == user_answer) {
				String resp = correct_resp[randomNumbers.nextInt(4)];
				System.out.println(resp);
				break;
			} else {
				String resp = incorrect_resp[randomNumbers.nextInt(4)];
				System.out.println(resp);
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
