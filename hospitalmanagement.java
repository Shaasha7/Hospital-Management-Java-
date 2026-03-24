class Person { 
    String name; 
    Person(String name) { 
        this.name = name; 
    } 
    void showRole() { 
        System.out.println("Person in Hospital"); 
    } 
    void accessHospital() { 
        System.out.println(name + " is in the hospital."); 
    } 
} 
class Doctor extends Person { 
    String specialization; 
    Doctor(String name, String specialization) { 
        super(name); 
        this.specialization = specialization; 
    } 
    @Override 
    void showRole() { 
        System.out.println("Role: Doctor"); 
    } 
    void treatPatient() { 
        System.out.println(name + " treats patients as a " + specialization + " 
specialist."); 
    } 
} 
class Patient extends Person { 
    String disease; 
    Patient(String name, String disease) { 
        super(name); 
        this.disease = disease; 
    } 
    @Override 
    void showRole() { 
        System.out.println("Role: Patient"); 
    } 
    void getTreatment() { 
        System.out.println(name + " is receiving treatment for " + disease); 
    } 
} 
public class Main { 
    public static void main(String[] args) { 
        Person p1 = new Doctor("Dr.Udayakumar", "Opthomologist"); 
        Person p2 = new Patient("Shalini", "irritation of Eye"); 
        p1.showRole(); 
        p1.accessHospital(); 
        System.out.println(); 
        p2.showRole(); 
        p2.accessHospital(); 
        System.out.println(); 
        Doctor d = (Doctor) p1; 
        d.treatPatient(); 
        Patient pt = (Patient) p2; 
        pt.getTreatment(); 
    } 
}
