import java.util.Random;
//Check Employee is or present or Absent
public class UC1 {
    public static void main(String[] args) {
        Random r = new Random();
int present=0;
int absent =0;

        for (int i = 1; i <=30; i++) {
            boolean attendance = r.nextBoolean();
            if (attendance == true) {
                present++;
                System.out.println("employee is present");
            } else {
                absent++;

                System.out.println("employee is absent ");
            }

        }
        System.out.println("total present count is "+present);
        System.out.println("total absent count is "+absent);
    }
}
