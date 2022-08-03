import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Car fiat = new Car("Fiat", 2019);
        Car nissan = new Car("Nissan", 2016);
        Car porsche = new Car("Porsche", 2023);
        Car porsche2 = new Car(porsche);

        System.out.println();
        System.out.println(fiat + "\thashCode: " + fiat.hashCode());
        System.out.println(nissan + "\thashCode: " + nissan.hashCode());
        System.out.println(porsche + "\thashCode: " + porsche.hashCode());
        System.out.println(porsche2 + "\thashCode: " + porsche2.hashCode());
        System.out.println();
        System.out.println("porsche.equals(porsche2): " + porsche.equals(porsche2));
        System.out.println();

        HashMap<Car, Double> prices = new HashMap<Car, Double>();
        prices.put(fiat, 2100.);
        prices.put(nissan, 15000.);
        prices.put(porsche, 55000.);

    }
}
