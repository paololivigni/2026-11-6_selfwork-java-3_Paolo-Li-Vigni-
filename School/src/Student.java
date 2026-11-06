// creazione sottoclasse Student

public class Student extends Person{

    private double average;
    private String lab;
    private String section;

    public Student(String name, String surname, int age, double average, String lab, String section){
        super(name, surname, age);
        this.average = average;
        this.lab = lab;
        this.section = section;
    }


    public double getAverage(){
        return average;
    }

    public void setAverage(double average){
        this.average = average;
    }

    public String getLab(){
        return lab;
    }

    public void setLab(String lab){
        this.lab = lab;
    }

    public String getSection(){
        return section;
    }

    public void setSection(String section){
        this.section = section;
    }

    @Override 
    public void infoPerson(){
        System.out.println("Ciao a tutti, sono " + getName() + " " + getSurname() + " e ho " + getAge() + " anni. La mia media è " + getAverage() + ".");
    }

    public void studentLab(){
        System.out.println("L'alunno " + getName() + " " + getSurname() + " della sezione " + getSection() + " ha scelto il laboratorio di " + getLab() + ".");
    }

}
