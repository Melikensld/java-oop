public class Car extends Vehicle{
    private String brand;
    private String model;
    private int year;

    @Override
    public void start(){
        System.out.println("Mercedes çalıştırılıyor.");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //    public Car(String brand, String model, int year) {
//        this.brand = brand;
//        this.model = model;
//        this.year = year;
//    }

//    public void displayInfo() {
//        System.out.println("Marka: " + brand);
//        System.out.println("Model: " + model);
//        System.out.println("Yıl: " + year);
//    }
}
