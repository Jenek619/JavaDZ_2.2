public class Main {
    public static void main(String[] args) {

        int amount = 200;
        int payment = 1500;

        int bonus;
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        int amount2 = amount + payment + bonus;
        System.out.println("Баланс: " + amount2);




    }
}
