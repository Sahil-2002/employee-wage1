import javax.lang.model.element.Name;
// part time employee and wage
public class UC3 {
    private String name;
    private double wage;
    private int time;

    // Constructor
    public UC3(String name, double wage, int time) {
        this.name = name;
        this.wage = wage;
        this.time = time;
    }
    public String getName(){
        return name;

    }

    public double getWage() {
        return wage;
    }

    public int getTime() {
        return time;
    }

    public static void main(String[] args) {
        UC3 data = new UC3("sahil ", 45, 3);
        System.out.println("name : " + data.getName());
        System.out.println("wage "+data.getWage());
        System.out.println("time "+data.getTime());
}}