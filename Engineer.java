public class Engineer extends Bonus {
    String name = "Sameksha Bafna";
    String id = "01fe22bca145";
    int Salary = 10000;

    public void displaydetails() {
        System.out.println("Name=" + name);
        System.out.println("Id is" + id);
        System.out.println("Salary is" + Salary);
    }

    public static void main(String[] args) {
        Engineer e = new Engineer();
        e.displaydetails();
        e.display();
    }
}