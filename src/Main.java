import java.util.ArrayList;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Car myCar = new Car();
//
//        myCar.setBrand("Mercedes");
//        myCar.setModel("C200");
//        myCar.setYear(2023);
//        myCar.setSpeed(120);
//
//        System.out.println("Marka: " + myCar.getBrand());
//        System.out.println("Model: " + myCar.getModel());
//        System.out.println("Yıl: " + myCar.getYear());
//        System.out.println("Arabanın hızı: " + myCar.getSpeed() + " km/s");
//        myCar.start();

//        Animal cat = new Cat();
//        Animal dog = new Dog();
//
//        cat.makeSound();
//        dog.makeSound();

//        Calculator calculator = new Calculator();
//
//        int sum2 = calculator.add(6,8);
//        System.out.println(sum2);
//        int sum3 = calculator.add(7,8,9);
//        System.out.println(sum3);

//        int result = Calculator.multiply(8, 6);
//        System.out.println("Çarpım sonucu: " +result);

//        Student student = new Student("Melike", 23, "ESTU");
//        student.displayStudent();

//        Circle circle = new Circle();
//        Rectangle rectangle = new Rectangle();
//        circle.draw();
//        rectangle.draw();

//        Dog dog = new Dog();
//        dog.sound();
//        Cat cat = new Cat();
//        cat.sound();

//        Gun bugün = Gun.CUMA;
//        System.out.println("Bugün günlerden: " +bugün);

        // // ARRAYLIST EXAMPLE
        // ArrayList<String> cities = new ArrayList<>();
        // cities.add("İzmir");
        // cities.add("Ankara");
        // cities.add("İstanbul");
        //
        // for (String i : cities) {
        //     System.out.println(i);
        // }

        HashSet<String> fruits = new HashSet<>();
        fruits.add("elma");
        fruits.add("elma");
        fruits.add("muz");
        fruits.add("kiraz");
        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}