public class Main {
    public static void main(String[] args) {

        int prise = 70531;              // Цена авиабилета в рублях
        int miles;                      // Начисленные мили
        int rubles = 20;                // Количество рублей необходимое для одной мили
        int x = (miles = prise / rubles); // формула для рассчета бонуса

        System.out.println(x + " - Начилено миль за покупку");
    }
}
