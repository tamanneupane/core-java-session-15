package oopconcept.inheritance;

public class Teacher extends Person{

    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d", this.getName(), this.getGender(), this.subject, this.getAge());
    }

}
