public class App {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        p1.age = 35;
        p1.name = "Jhon";
        p1.lastname = "Smith";
        Person p2 = new Person();
        p2.age = 30;
        p2.name = "Rodrigo";
        p2.lastname = "Polaco";

        Major m1 = new Major();
        Major m2 = new Major();
        m1.name = "Ingeniería en Sistema";
        m1.duration = 6;
        m1.start_year = 2010;
        m1.ended = true;

        m2.name = "Odontología";
        m2.duration = 6;
        m2.start_year =2014;
        m2.ended = false;

        p1.major = m1;
        p2.major = m2;


        System.out.println(p1.giveFullName() + " tiene " + p1.age + " años. " + p1.major.infoMajor());
        System.out.println(p2.giveFullName() + " tiene " + p2.age + " años. " + p2.major.infoMajor());
        System.out.println(p1.greeting(p2));
    }
}
