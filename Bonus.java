public class Bonus {
    int Salary = 10000;
    int Bonus = 4000;
    int total;

    public void display() {
        System.out.println("Bonus " + Bonus);
        total = Salary + Bonus;
        System.out.println("Total salary with bonus  is " + total);
    }
}