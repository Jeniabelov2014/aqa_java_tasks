package lesson2;

import org.apache.commons.lang3.StringUtils;

public class PersonManager {
    public PersonManager() {
    }

    public Person createPerson(int age, String name) {
        boolean ageValidationResult = ageValid(age);
        boolean nameValidationResult = nameValid(name);
        if (ageValidationResult && nameValidationResult) {
            name = formatName(name);
            return new Person(age, name);
        } else if (!ageValidationResult) {
            System.out.println("Enter valid age!");
        } else {
            System.out.println("Enter valid name");
        }
        return null;
    }

    private String formatName(String name) {
        name = name.trim();
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    private boolean ageValid(int age) {
        return age > 0 && age <= 100;
    }

    private boolean nameValid(String name) {
        return notEmptyName(name) && name.length() >= 3 && name.length() <= 50;
    }


    private boolean notEmptyName(String name) {
        return !StringUtils.isBlank(name);
    }
}
