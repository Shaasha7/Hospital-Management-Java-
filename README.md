# Hospital-Management-Java-
To design and implement a Hospital Role Based System using Java.  The system allows different roles such as Doctor and Patient to access hospital  features based on their roles.  This project demonstrates core Object-Oriented Programming concepts such as:  • Inheritance  • Polymorphism  • Class and Object  • Method Overriding  • Upcasting 
🏥 Hospital Role Management System using Java

A simple Java-based application that demonstrates Object-Oriented Programming (OOP) concepts such as Inheritance, Method Overriding, and Polymorphism in a hospital environment.

🚀 Features
👤 Base class: Person
👨‍⚕️ Doctor class with specialization
🧑‍ بیمار Patient class with disease details
🔁 Method overriding for role-specific behavior
🔄 Runtime polymorphism using parent reference
🎯 Type casting to access subclass methods
🛠️ Technologies Used
Java
OOP Concepts
Inheritance
Polymorphism
Method Overriding
Type Casting
📌 Concepts Demonstrated
🔹 Inheritance
Doctor and Patient inherit from Person
🔹 Method Overriding
showRole() method behaves differently for each class
🔹 Polymorphism
Parent reference (Person) is used to refer to child objects
🔹 Type Casting
Downcasting is used to access specific methods of subclasses
📂 Class Structure
Person
 ┣ Doctor
 ┗ Patient
▶️ How to Run
javac Main.java
java Main
💻 Source Code
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
        System.out.println(name + " treats patients as a " + specialization + " specialist."); 
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
<img width="1918" height="748" alt="Hospital management 1" src="https://github.com/user-attachments/assets/a1c84bcd-ecd3-4e5b-a642-24767959b511" />
<img width="1918" height="737" alt="Hospital management 2" src="https://github.com/user-attachments/assets/6def1709-a9fb-4d25-95d8-2932de53f022" />

📊 Sample Output
Role: Doctor
Dr.Udayakumar is in the hospital.

Role: Patient
Shalini is in the hospital.

Dr.Udayakumar treats patients as a Opthomologist specialist.
Shalini is receiving treatment for irritation of Eye
🎯 Learning Outcomes
Understanding inheritance hierarchy
Applying method overriding
Using runtime polymorphism
Performing type casting in Java
Designing real-world scenarios using OOP
🙌 Conclusion

This project demonstrates how Java OOP concepts can be used to model real-world systems like a hospital environment. It provides a clear understanding of inheritance, polymorphism, and dynamic behavior of objects.
