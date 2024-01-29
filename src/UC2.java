import java.util.Scanner;
// calculate daily employee wage
public class UC2 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int daily =20;
        System.out.println("enter your working hour ");
        int working_hour = sc.nextInt();
        if(working_hour>=8){
            System.out.println("daily wage is "+daily*8);
        }
        else {
            System.out.println(working_hour*daily + " this is your daily wage ");
        }


    }
}
