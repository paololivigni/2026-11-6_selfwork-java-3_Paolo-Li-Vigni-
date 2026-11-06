// creazione sottoclasse Headmaster

public class Headmaster extends Person{

    // attributi
    private String institute;

    // costruttore
    public Headmaster(String name, String surname, int age, String institute){
        super(name, surname, age);

        this.institute = institute;
    }


    public String getInstitute(){
        return institute;
    }

    public void setInstitute(String institute){
        this.institute = institute;
    }

    @Override
    public void infoPerson(){
        System.out.println("Buongiorno, sono " + getName() + " " + getSurname() + ", ho " + getAge() + " anni e sono preside dell'istituto " + getInstitute() + ".");
    }

    public void studentCouncil(){
        System.out.println("Il consiglio degli studenti sarà fissato per il terzo mercoledi di aprile.");
    }

}
