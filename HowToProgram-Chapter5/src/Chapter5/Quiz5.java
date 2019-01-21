package Chapter5;

import java.security.SecureRandom;
import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SecureRandom randomNumbers = new SecureRandom();
		
		String[] correct_resp = {"Vera good!", "Excellent!", "Nice work!", "Keep up the good work!"};
		String[] incorrect_resp = {"No. Please try again.", "Wrong. Try once more.", "Dont give up!", "No. Keep trying."};
		
		System.out.println("We prepared 4 types of arithmetic problem to study.");
		System.out.println("Please choose the number matched the type you want to study.");
		System.out.println("(1: addition, 2: subtraction, 3: multiplication, 4: division)");
		System.out.println();
		System.out.print("Choose the number: ");
		
		int type = input.nextInt();
		int[] nums = generateNums();
		int result = 0;
		String ques = "";
		boolean flag = true;
		
		System.out.println();
		
		switch(type) {
			case 1:
				result = nums[0] + nums[1];	
				ques = "How much is "+ nums[0] +" plus "+nums[1]+" ?  ";
				break;
			case 2:
				result = nums[0] - nums[1];	
				ques = "How much is "+ nums[0] +" subtraction "+nums[1]+" ?  ";
				break;
			case 3:
				result = nums[0] * nums[1];	
				ques = "How much is "+ nums[0] +" times "+nums[1]+" ?  ";
				break;
			case 4:
				result = nums[0] / nums[1];	
				ques = "How much is "+ nums[0] +" divided by "+nums[1]+" ?  ";
				break;
		}
		System.out.print(ques);
		int user_answer = input.nextInt();
		
		for(int i=0; i<4; i++) {
			if(result == user_answer) {
				String resp = correct_resp[randomNumbers.nextInt(4)];
				System.out.println(resp);
				flag = false;
				break;
			} else {
				String resp = incorrect_resp[randomNumbers.nextInt(4)];
				System.out.println(resp);
			}
			
			System.out.print(ques);
			user_answer = input.nextInt();
		}
		
		if (flag) {
			System.out.println("Please ask your teacher for extra help.");
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
