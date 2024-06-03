package HW11;

import java.util.Scanner;

public class Lesson11 {

    static class Person {

        String name;
        int age;
        String profession;

        public Person(String name, int age, String profession) {
            this.name = name;
            this.age = age;
            this.profession = profession;
        }

        public void setProfession(String profession) {
            this.profession = profession;
        }

        public String getInfo() {
            return "Name: " + name + ", Age: " + age + ", Profession: " + profession;
        }

        public static void main(String[] args) {

            Person person1 = new Person("Olga", 22, "Teacher");
            Person person2 = new Person("Zhanna", 36, "SMM-manager");
            Person person3 = new Person("David", 34, "Mechanic");

            System.out.println(person1.getInfo());
            System.out.println(person2.getInfo());
            System.out.println(person3.getInfo());

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the number of the person you want to change the profession for (1 for Olga, 2 for Zhanna, 3 for David):");
            int personNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the new profession:");
            String newProfession = scanner.nextLine();

            switch (personNumber) {
                case 1:
                    person1.setProfession(newProfession);
                    break;
                case 2:
                    person2.setProfession(newProfession);
                    break;
                case 3:
                    person3.setProfession(newProfession);
                    break;
                default:
                    System.out.println("Invalid person number.");
                    break;
            }

            System.out.println("Updated information:");
            System.out.println(person1.getInfo());
            System.out.println(person2.getInfo());
            System.out.println(person3.getInfo());

            scanner.close();
        }
    }
}