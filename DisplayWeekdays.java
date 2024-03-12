package codetest;

import java.util.Scanner;
public class DisplayWeekdays
{   
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = in.nextInt();

        System.out.println(getDayName(day));
    }
  
    public static String getDayName(int day) {
        String DayName = "";
        switch (day)
        {
            case 1: DayName = "Monday"; 
            break;
            case 2: DayName = "Tuesday"; 
            break;
            case 3: DayName = "Wednesday";
            break;
            case 4: DayName = "Thursday"; 
            break;
            case 5: DayName = "Friday";
            break;
            case 6: DayName = "Saturday";
            break;
            case 7: DayName = "Sunday";
            break;
            default:DayName = "Invalid day range";
        }

        return DayName;
    }
}
