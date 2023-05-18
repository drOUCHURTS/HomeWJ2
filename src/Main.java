public class Main {

    public static void main(String[] args) {

        int InitialBalance = 100;
        // Изначальный баланс счета
        int TopUpAmount = 1100;
        // Сумма пополнения
        int BonusPerTopUp = TopUpAmount / 100;
        // Бонус от пополнения (более 1000 рублей) - 1 рубль за каждые 100 рублей пополнения
        int FinalBalance;
        // Конечный баланс счета с учетом бонусов


        if (TopUpAmount > 1000) {
            FinalBalance = TopUpAmount + BonusPerTopUp + InitialBalance;
        } else {
            BonusPerTopUp = 0;
            FinalBalance = InitialBalance + TopUpAmount;
        }

        System.out.println("Текущий баланс счета: " + FinalBalance);
        System.out.println("Количество бонусов: " + BonusPerTopUp);
    }
}
