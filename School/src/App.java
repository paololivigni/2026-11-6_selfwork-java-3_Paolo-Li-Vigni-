// Simulazione contesto scolastico.

public class App {
    public static void main(String[] args) throws Exception {


        Headmaster h = new Headmaster("Daniele", "Rossi", 56, "A. Volta");
        h.infoPerson();

        Teacher t = new Teacher("Massimo", "Bianchi", 48, "matematica");
        t.infoPerson();
        
        Student s = new Student("Davide", "Fumagalli",16, 9, "Informatica", "III A");
        s.infoPerson();
        s.studentLab();

        t.evaluateStudent(s, 9.5);
    }
}
