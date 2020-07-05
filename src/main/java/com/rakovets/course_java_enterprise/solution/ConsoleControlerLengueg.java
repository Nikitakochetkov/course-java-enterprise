package com.rakovets.course_java_enterprise.solution;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import static java.lang.System.out;

public class ConsoleControlerLengueg {
    public static void main(String[] args) throws UnsupportedClassVersionError {
        Locale localeUS = new Locale("en","US");
        Locale localeRu = new Locale("ru", "RU");
        Locale localeBY = new Locale("by", "BY");
        ResourceBundle resourceBundleUS = ResourceBundle.getBundle("translations_en_US.properties.properties", localeUS);
        ResourceBundle resourceBundleRU = ResourceBundle.getBundle("translations_ru_RU.properties.properties", localeRu);
        ResourceBundle resourceBundleBY = ResourceBundle.getBundle("translations_by_BY.properties.properties", localeBY);
        String textUS =resourceBundleUS.getString("text");
        String textRU =resourceBundleRU.getString("text");
        String textBY =resourceBundleBY.getString("text");

        Scanner scanner = new Scanner(System.in);
        out.println("Enter values (en , ru , by): ");
        String value = scanner.nextLine();
        if (value.equals("en")) {
            out.println(textUS);
        } else if (value.equals("ru")) {
            out.println(textRU);
        } else if (value.equals("by")) {
            out.println(textBY);
        }else {
            out.println("Enter corect values !!!!!");
        }
    }
}
