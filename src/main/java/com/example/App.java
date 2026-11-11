
package com.example;

public class App {

    public String calculateGrade(int marks) {

        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        App obj = new App();

        System.out.println(obj.calculateGrade(95));
        System.out.println(obj.calculateGrade(80));
        System.out.println(obj.calculateGrade(60));
        System.out.println(obj.calculateGrade(30));
    }
}
