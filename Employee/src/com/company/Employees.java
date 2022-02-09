package com.company;

import java.util.ArrayList;

import java.util.Comparator;

public class Employees {
    ArrayList<Employee> employees = new ArrayList<>();
    public void add(Employee emp) {
        employees.add(emp);
        employees.sort(new CompSurname());

    }

    public void print() {
        System.out.println("{");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
        System.out.println("}\n");
    }

    public void del(String tel) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).number.equals(tel)) {
                employees.remove(i);
            }
        }
    }

    public void sortDate() {
        employees.sort(new CompDate());
    }

    class CompDate implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.compareTo(o2);
        }
    }

    class CompSurname implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getSurname().compareTo(o2.getSurname());
        }
    }

}
