public class Main {

    public static void main(String[] args) {

        int priceBilet = 10_000; // цена авиабилета, рублей
        int costMile = 20; // стоимость одной мили, рублей
        int bonusMile = priceBilet / costMile; //расчет количества бонусных милей

        System.out.println("Количество милллей: " + bonusMile);

    }
}
