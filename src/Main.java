public class Main {
    public static void main(String[] args) {
        int Pay = 1100;
        int Balance = 100;
        int Bonus;
        System.out.println("Текущий счет: " + Balance + " Рублей(я)");
        System.out.println("Сумма пополнения: " + Pay + " Рублей(я)");
        if (Pay > 999) {
            Bonus = Pay / 100;
        } else {
            Bonus = 0;
        }
        int balance = Pay + Balance + Bonus;
        System.out.println("Счет после пополнения: " + balance + " Рублей(я)");
        System.out.println("Бонус: " + Bonus + " Рублей(я)");
    }
}