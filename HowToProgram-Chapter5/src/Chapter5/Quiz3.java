package Chapter5;

import java.security.SecureRandom;
import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SecureRandom randomNumbers = new SecureRandom();
		
		String[] correct_resp = {"Vera good!", "Excellent!", "Nice work!", "Keep up the good work!"};
		String[] incorrect_resp = {"No. Please try again.", "Wrong. Try once more.", "Dont give up!", "No. Keep trying."};
		int correct = 0;
		int incorrect = 0;
		char tryagain = 'y';
		
		while(tryagain == 'y') {
			for(int i=0; i<10; i++) {
				int nums[] = generateNums();
				int result = nums[0] * nums[1];
				System.out.print("How much is "+ nums[0] +" times "+nums[1]+" ?");
				int user_answer = input.nextInt();
				if(result == user_answer) {
					System.out.println(correct_resp[randomNumbers.nextInt(4)]);
					correct ++;	
				} else {
					System.out.println(incorrect_resp[randomNumbers.nextInt(4)]);
					incorrect ++;
				}
			}
			
			double pass = correct / (correct + incorrect) * 100;
			
			if(pass > 0.75) {
				System.out.println("Congratulations, you are ready to go to the next level!");
				System.out.print("if you want to practice again, please enter 'y'. if you not, please enter 'n': ");
				tryagain = input.next().charAt(0);
			} else {
				System.out.println("Please ask your teacher for extra help.");
				System.out.print("if you want to practice again, please enter 'y'. if you not, please enter 'n': ");
				tryagain = input.next().charAt(0);
			}

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
