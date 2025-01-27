import java.util.Scanner;

class Weekpro2
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Day:");
      String Day = sc.nextLine();
      switch(Day)
        {
          case "Monday":
          case "Tuesday":
          case "Wednesday":
          case "Thursday":
          case "Friday":
            System.out.println("WeekDays!");
            break;
          default:
            System.out.println("WeekEnd!");
            break;
        }
    }
  }
