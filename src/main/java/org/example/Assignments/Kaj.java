package org.example.Assignments;

public class Kaj {
    public static void main(String[] args) {
        String name = "ka25ja35";
        int sum = 0;
        StringBuilder a = new StringBuilder();

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (Character.isDigit(ch)) {
                a.append(ch);
            } else {
                if (a.length() > 0) {
                    sum += Integer.parseInt(a.toString());
                    a.setLength(0);
                }
            }
        }

        if (a.length() > 0) {
            sum += Integer.parseInt(a.toString());
        }

        System.out.println("The sum of numbers in the string is " + sum);
    }
}
