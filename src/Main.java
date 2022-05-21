public class Main {
    public static void main(String[] args) {

        int prise = 70_531;             // Цена авиабилета в рублях
        int rubles = 20;                // Количество рублей необходимое для одной мили
        int miles = prise / rubles;     // Начисленные мили

        System.out.println(miles + " - Начилено миль за покупку");
    }
}
