package org.example.JavaPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelfromRegex {
    public static void main(String[] args) {
        String name = "kajalsinghrajput";
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher =pattern.matcher(name);
        System.out.print("Vowel in the string is : ");
        while (matcher.find())
        {
            System.out.print(matcher.group());
        }
    }
}
