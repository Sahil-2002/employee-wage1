import java.util.Scanner;

class wage {
    Scanner sc = new Scanner(System.in);
    int wage = 20;

    public void hour_daily() {
        System.out.println("enter the total working hour of employee of the day ");
        int daily_hour = sc.nextInt();
        int daily_wage = wage * daily_hour;
        System.out.println("daily wage is " + daily_wage);
    }
}

    public class UC6{
        public static void main(String[] args) {
            wage obj = new wage();
            obj.hour_daily();

        }
    }






