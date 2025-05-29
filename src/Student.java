public class Student extends Person{
    String school;

    public Student(String name, int age, String school) {
        super(name, age);       // super ile Person sınıfının constructor'ı çağrılır
        this.school = school;   // this ile Student sınıfındaki 'school' alanı belirtilir
    }

    public void displayStudent() {
        System.out.println("İsim: " + name);
        System.out.println("Yaş: " + age);
        System.out.println("Okul: " + school);
    }
}
