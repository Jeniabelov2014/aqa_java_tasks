package lesson2;

public class Person {
    private int age;
    private String name;
    private String ageGroup;


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        this.ageGroup = defineAgeGroup(age);
    }

    private String defineAgeGroup(int age) {
        if (age < 15) {
            return "child";
        } else if (age >= 15 && age <= 25) {
            return "student";
        } else if (age > 25 && age < 65) {
            return "worker";
        } else {
            return "pensioner";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgeGroup() {
        return ageGroup;
    }
}

