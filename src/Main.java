public class Main {
    public static void main(String[] args) {
    int score = 100; // сумма которая была на счету
    int deposit = 1100; // сумма которую вносят на счет
    if (deposit > 1000){
        int percent = 1;
        int bonus = (deposit / 100 * percent);
        System.out.println ("Бонус за пополнение " + bonus + " рублей");
        int depositBonus = (deposit + bonus);
        System.out.println ("Сумма пополнения с бонусом " + depositBonus + " рублей");
        int finalScore = (score + depositBonus);
        System.out.println ("Сумма на счете " + finalScore + " рублей");
    } else {
        System.out.println ("За пополнение от 1000 рублей можно получить бонус на счет");
        System.out.println ("Сумма пополнения " + deposit + " рублей");
        int finalScore = (score + deposit);
        System.out.println ("Сумма на счете " + finalScore + " рублей");
    }
    }
}