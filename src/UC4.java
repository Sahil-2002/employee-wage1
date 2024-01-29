import java.util.Scanner;
// wages for month
public class UC4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wage =20;
        System.out.println("enter the working hour per day : ");
        int time_day = sc.nextInt();
        int time_month = time_day*20;
        System.out.println("calculating wages for month is  : ");
int wage_month=time_month*wage;
        System.out.println("wage per month is "+wage_month);

    }
}
