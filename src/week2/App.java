package week2;

import week2.task1.*;
import week2.task2.*;
import week2.task3.*;

public class App {
    public static void main(String[] args) {
        Desktop c1 = new Desktop();
        Laptop c2 = new Laptop();
        Tablet c3 = new Tablet();

        /* The setProcessor method for each device
         * is inherited from the Computer class
         */
        c1.setProcessor("Intel");
        c2.setProcessor("Apple M1");
        c3.setProcessor("Apple M2");

        Academic a = new Academic();

        /* The setFirstname and setSurname methods
         * are inherited from the Employee class
         */
        a.setFirstname("Joe");
        a.setSurname("Bloggs");

        ITTechnician tech = new ITTechnician();

        /* Same here... */
        tech.setFirstname("Sally");
        tech.setSurname("Jones");

        Dog d = new Dog();
        Cat c = new Cat();

        /* The setName method is inherited from Animal */
        d.setName("Odie");
        c.setName("Garfield");

        Pigeon p = new Pigeon();

        /* setName again inherited from Animal */
        p.setName("Yankee Doodle");

        /* For a Pigeon, the flapWings method is inherited from Bird */
        p.flapWings();

    }
}
