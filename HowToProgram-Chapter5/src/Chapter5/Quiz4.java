package Chapter5;

import java.security.SecureRandom;
import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SecureRandom randomNumbers = new SecureRandom();
		
		String[] correct_resp = {"Vera good!", "Excellent!", "Nice work!", "Keep up the good work!"};
		String[] incorrect_resp = {"No. Please try again.", "Wrong. Try once more.", "Dont give up!", "No. Keep trying."};
		
		System.out.print("choose the level 1,2,3 : ");
		int level = input.nextInt();
		int[] nums = {0,0};
		
		switch(level) {
			case 1:
				nums = lv1Nums();
				break;
			case 2:
				nums = lv2Nums();
				break;
			case 3:
				nums = lv3Nums();
				break;
		}
	
		int result = nums[0] * nums[1];	
		System.out.print("How much is "+ nums[0] +" times "+nums[1]+" ?");
		int user_answer = input.nextInt();
		
		for(int i=0; i<3; i++) {
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
	
	
	public static int[] lv1Nums() {
		SecureRandom randomNumbers = new SecureRandom();
		int[] nums = {0,0};
		nums[0] = 1 + randomNumbers.nextInt(10);
		nums[1] = 1 + randomNumbers.nextInt(10);
		
		return nums;
	}
	public static int[] lv2Nums() {
		SecureRandom randomNumbers = new SecureRandom();
		int[] nums = {0,0};
		nums[0] = 1 + randomNumbers.nextInt(100);
		nums[1] = 1 + randomNumbers.nextInt(10);
		
		return nums;
	}
	public static int[] lv3Nums() {
		SecureRandom randomNumbers = new SecureRandom();
		int[] nums = {0,0};
		nums[0] = 1 + randomNumbers.nextInt(100);
		nums[1] = 1 + randomNumbers.nextInt(100);
		
		return nums;
	}
}
