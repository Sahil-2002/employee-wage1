import java.util.Scanner;
// total working hours reached
public class UC5 {
    public static void main(String[] args) {
        System.out.println("total working hours per month is 100 and 20 days ");
        Scanner sc = new Scanner(System.in);
        int wage =20;

        System.out.println("enter total working hour : ");
        int hour = sc.nextInt();
        System.out.println("enter total days you worked : ");
        int day = sc.nextInt();
        if(hour>=100&& day>=20){
            int wage_month  = hour*wage;
            System.out.println("monthly wage of employee is : "+wage_month);
        }
        else{
            System.out.println("you need to complete your hours and days to get the wage ");
        }

    }

}
