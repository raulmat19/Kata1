package kata1;

import java.time.LocalDate;

public class Kata1 {

    public static void main(String[] args) {
        
        System.out.println("PRUEBA 1 - (72 años)");
        Person person = new Person("Juan Manuel", LocalDate.of(1949, 9, 24));
        System.out.println(person.getName() + " tiene " + person.getAge()
                           + " años");
        
        System.out.println("\nPRUEBA 2 - (21 años)");
        Person new_person = new Person("Alexis", LocalDate.of(2000, 7, 15));
        System.out.println(new_person.getName() + " tiene " + new_person.getAge()
                           + " años");
    }
    
}
