
import java.util.Scanner;

public class weak {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day order in number");
		int day = sc.nextInt();
		switch(day)
		{
		case 1:
			System.out.println("1: Sunday");
			break;
		case 2:
			System.out.println("2: Monday");
			break;
		case 3:
			System.out.println("3: Tuesday");
			break;
		case 4:
			System.out.println("4: Wednesday");
			break;
		case 5:
			System.out.println("5: Thursday");
			break;
		case 6:
			System.out.println("6: Friday");
			break;
		case 7:
			System.out.println("7:Saturday");
			break;
			
		
		}
		

	}

}
