package builder;

import builder.person.Person;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .name("Felipe")
                .age("32")
                .cpf("99999999999")
                .height("180")
                .id("999999999")
                .builder();

        System.out.println(person.toString());
    }
}
