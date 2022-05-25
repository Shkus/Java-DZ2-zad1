public class Main {

    public static void main(String[] args) {

        int priceTicket = 10_000; // цена авиабилета, рублей
        int costMile = 20; // стоимость одной мили, рублей
        int bonusMile = priceTicket / costMile; //расчет количества бонусных милей

        System.out.println("Количество милллей: " + bonusMile);

    }
}
