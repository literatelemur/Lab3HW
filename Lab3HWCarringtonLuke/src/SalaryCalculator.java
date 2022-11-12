import java.util.Scanner;
public class SalaryCalculator {

	public static void main(String[] args) {
	Scanner info = new Scanner(System.in);
	int grade, step;
	System.out.println("Enter the grade for your position:");
	grade = info.nextInt();
	System.out.println("Enter the step for your position:");
	step = info.nextInt();
	
	switch(grade){
		case 1:
			switch(step){
				case 1: 
					System.out.println("Your salary is: $18785");
					break;
				case 2:
					System.out.println("Your salary is: $19414");
					break;
				case 3:
					System.out.println("Your salary is: $20039");
					break;
				default:
					System.out.println("You did not enter a valid step");
			}
		break;
			
		case 2:
			switch(step){
				case 1:
					System.out.println("Your salary is: $21121");
					break;
				case 2:
					System.out.println("Your salary is: $21624");
					break;
				case 3:
					System.out.println("Your salary is: $22323");
					break;
				default:
					System.out.println("You did not enter a valid step");
			}
		break;
			
			
		case 3:
			switch(step){
				case 1:
					System.out.println("Your salary is: $23045");
					break;
				case 2:
					System.out.println("Your salary is: $23813");
					break;
				case 3:
					System.out.println("Your salary is: $24581");
					break;
				default:
					System.out.println("You did not enter a valid step");
			}
		break;
			
		case 4:
			switch(step){
				case 1:
					System.out.println("Your salary is: $25871");
					break;
				case 2:
					System.out.println("Your salary is: $26733");
					break;
				case 3:
					System.out.println("Your salary is: $27595");
					break;
				default:
					System.out.println("You did not enter a valid step");
			}
		break;
		default:
			System.out.println("You did not enter a valid grade");
	}

	}
}
