// creazione sottoclasse Teacher

public class Teacher extends Person{

    private String subject;

    public Teacher (String name, String surname, int age, String subject){
        super(name, surname, age);
        this.subject = subject;
    }


    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    @Override 
    public void infoPerson(){
        System.out.println("Salve a tutti, sono " + getName() + " " + getSurname() + ", ho " + getAge() + " anni e insegno " + getSubject() + ".");
    }

    public void evaluateStudent(Student s, double p){
        System.out.println("La prestazione dello studente " + s.getName() + " è stata valutata con il punteggio di " + p + ".");
    }

}
