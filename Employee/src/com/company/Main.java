package com.company;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
       Employee e = new Employee("Jack","Yingson", "+7914123", 2004);
       Employee e1 = new Employee("John","Johnson", "+79140056", 1999);
       Employee e2 = new Employee("Yanna","Lu", "+123456", 2006);
       Employee custom = new Employee(s.nextLine(),s.nextLine(),s.nextLine(),s.nextInt());
       Employees employees = new Employees();
       employees.add(e);
       employees.add(e2);
       employees.add(e1);
        employees.print();
        employees.del("+123456");
        employees.sortDate();
        employees.print();





    }
}
