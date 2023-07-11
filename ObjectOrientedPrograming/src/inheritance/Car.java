package inheritance;

public class Car {

    public static void main(String[] args) {
        CarInherit BMW = new CarInherit();

        BMW.CarName = "BMW";
        BMW.color = "Black";
        BMW.setPrice(15000000);

        BMW.print();

        CarInherit Thar = new CarInherit();

        Thar.CarName = "Thar";
        Thar.color = "Black";
        Thar.setPrice(130000);

        Thar.print();

    }

}
