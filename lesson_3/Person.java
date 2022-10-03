package homework.lesson_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Person implements getUserInfo{

    @Override
    public String getUserName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String str = sc.nextLine();
        if (str.isEmpty()) {
            throw new RuntimeException("Enter your name!");
        }
        return str;
    }

    @Override
    public String getUserSecondName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter second name: ");
        String str = sc.nextLine();
        if (str.isEmpty()) {
            throw new RuntimeException("Enter your second name!");
        }
        return str;
    }

    @Override
    public String getUserSurname() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter surname: ");
        String str = sc.nextLine();
        if (str.isEmpty()) {
            throw new RuntimeException("Enter your surname!");
        }
        return str;
    }

    @Override
    public String getUserBirthDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birthdate, format - dd.mm.yyyy: ");
        String str = sc.nextLine();
        if (str.isEmpty()) {
            throw new RuntimeException("Enter your birthdate!");
        } else {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            try {
                LocalDate date = LocalDate.parse(str, dtf);
                return date.toString();
            } catch (RuntimeException e) {
                System.out.println("Wrong format! Enter your birthdate as dd.mm.yyyy!");
            }

        }
        return null;
    }

    @Override
    public String getUserPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your phone number, format - 9999999: ");
        String str = sc.nextLine();
        if (str.isEmpty()) {
            throw new RuntimeException("Enter your phone number!");
        } else {
            String number;
            try {
                number = String.valueOf(Integer.parseInt(str));
                return number;
            } catch (RuntimeException e) {
                System.out.println("Wrong format! Enter your phone number as integer!");
            }

        }
        return null;
    }

    public String getUserFuLlInfo() {
        ArrayList<String> person = new ArrayList<>();
        person.add(getUserName());
        person.add(getUserSecondName());
        person.add(getUserSurname());
        person.add(getUserBirthDate());
        person.add(getUserPhoneNumber());
        return person.toString();
    }
}
