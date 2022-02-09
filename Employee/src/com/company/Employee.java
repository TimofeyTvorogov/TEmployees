package com.company;

public class Employee implements Comparable<Employee> {
    String surname;
    String name;
    String number;
    int birthDate;
    public Employee(String name,String surname, String number, int birthDate) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.birthDate = birthDate;
    }
    @Override
    public int compareTo(Employee employee) {
        if (this.birthDate > employee.birthDate) {
            return 1;
        } else if (this.birthDate < employee.birthDate) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    @Override
    public String toString() {
        return String.format("|%s\n%s\n%s\n%d|\n ",name,surname,number,birthDate);
    }

    public String getSurname() {
        return surname;
    }
}

