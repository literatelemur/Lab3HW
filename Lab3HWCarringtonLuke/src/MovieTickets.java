import java.util.Scanner;
public class MovieTickets {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		int time;
		int age;
		int child = 0;
		int adult = 0;
		int senior = 0;
		
		System.out.println("What time is your showing? (use 24-hour format)");
		time = info.nextInt();
		
		System.out.println("How old is party member 1? (enter 0 to skip)");
		age = info.nextInt();
		if (age == 0){
		}else if (age <= 10){
			child ++;
		} else if (age >= 65){
			senior ++;
		} else{
			adult ++;
		}
		
		System.out.println("How old is party member 2? (enter 0 to skip)");
		age = info.nextInt();
		if (age == 0){
		}else if (age <= 10){
			child ++;
		} else if (age >= 65){
			senior ++;
		} else{
			adult ++;
		}
		
		System.out.println("How old is party member 3? (enter 0 to skip)");
		age = info.nextInt();
		if (age == 0){
		}else if (age <= 10){
			child ++;
		} else if (age >= 65){
			senior ++;
		} else{
			adult ++;
		}
		
		System.out.println("How old is party member 4? (enter 0 to skip)");
		age = info.nextInt();
		if (age == 0){
		}else if (age <= 10){
			child ++;
		} else if (age >= 65){
			senior ++;
		} else{
			adult ++;
		}
		
		System.out.println("Order summary:");
		if (time < 1700 && time != 0){
			System.out.println("(Matinee rates)");
			System.out.println("Adult:\t\t$8.00\t\tx   " + adult + "   =\t$" + 8.00 * adult);
			System.out.println("Child:\t\t$0.00\t\tx   " + child + "   =\t$" + 0.00 * child);
			System.out.println("Senior:\t\t$6.50\t\tx   " + senior + "   =\t$" + 6.50 * senior);
			System.out.println("TOTAL:\t\t\t\t\t$" + ((8.00 * adult) + (6.50 * senior)));
		} if (time >= 1700 || time == 0){
			System.out.println("(Evening rates)");
			System.out.println("Adult:\t\t$10.50\t\tx   " + adult + "   =\t$" + 10.50 * adult);
			System.out.println("Child:\t\t$4.00\t\tx   " + child + "   =\t$" + 4.00 * child);
			System.out.println("Senior:\t\t$8.00\t\tx   " + senior + "   =\t$" + 8.00 * senior);
			System.out.println("TOTAL:\t\t\t\t\t\t$" + ((10.50 * adult) + (4.00 * child) + (8.00 * senior)));
		}
		
	}

}
