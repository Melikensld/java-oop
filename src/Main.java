
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setBrand("Mercedes");
        myCar.setModel("C200");
        myCar.setYear(2023);

        System.out.println("Marka: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Yıl: " + myCar.getYear());
    }
}