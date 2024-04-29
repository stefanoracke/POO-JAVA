public class App {
    public static void main(String[] args) throws Exception {
        Major m1 = new Major("Ingeniería en Sistema", 6, 2010, true);
        Major m2 = new Major("Odontología", 5, 2020, false);
        Person p1 = new Person("Jhon", "Smith", 35, m1);
        Person p2 = new Person("Rodrigo", "Polaco", 25, m2);
        Person p3 = new Person("Pablo", "Rodriguez", 40);

        System.out.println(p1.giveFullName() + " tiene " + p1.age + " años. " + p1.major.infoMajor());
        System.out.println(p2.giveFullName() + " tiene " + p2.age + " años. " + p2.major.infoMajor());
        System.out.println(p3.giveFullName() + " tiene " + p3.age + " años. ");
        System.out.println(p1.greeting(p2));
        System.out.println(p1.greeting(p3));
    }
}
