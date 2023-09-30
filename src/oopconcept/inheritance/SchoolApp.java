package oopconcept.inheritance;

public class SchoolApp {

    public static void main(String[] args) {

        Student arbind = new Student();
        arbind.setName("Arbind");
        arbind.setAge(25);
        arbind.setGender("Male");
        arbind.setRollNumber(2);

        Teacher taman = new Teacher();
        taman.setName("Taman");
        taman.setAge(29);
        taman.setGender("Male");
        taman.setSubject("Java");

        Staff ram = new Staff();
        ram.setName("Ram");
        ram.setAge(40);
        ram.setGender("Male");
        ram.setJobResponsibility("Cleaner");

        System.out.println(taman.getName());
        System.out.println(taman.getAge());
        System.out.println(taman.getGender());
        System.out.println(taman.getSubject());

        System.out.println(taman.toString());

    }
}
