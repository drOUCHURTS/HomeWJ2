public class Main {

    public static void main(String[] args) {

        int initialBalance = 100;
        // Изначальный баланс счета
        int topUpAmount = 1100;
        // Сумма пополнения
        int bonusPerTopUp = topUpAmount / 100;
        // Бонус от пополнения (более 1000 рублей) - 1 рубль за каждые 100 рублей пополнения
        int finalBalance;
        // Конечный баланс счета с учетом бонусов


        if (topUpAmount > 1000) {
            finalBalance = topUpAmount + bonusPerTopUp + initialBalance;
        } else {
            bonusPerTopUp = 0;
            finalBalance = initialBalance + topUpAmount;
        }

        System.out.println("Текущий баланс счета: " + finalBalance);
        System.out.println("Количество бонусов: " + bonusPerTopUp);
    }
}
