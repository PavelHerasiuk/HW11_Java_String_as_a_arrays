package by.epam.linear_program.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
public class RegexMatches67 {

    private static String INPUT = "camelCase.";

    public static void main(String[] args) {
        String REGEX = "camel";
        Pattern p = Pattern.compile(REGEX);

        // получение matcher объекта
        Matcher m = p.matcher(INPUT);
        String REPLACE = "snake_";
        INPUT = m.replaceAll(REPLACE);
        System.out.println(INPUT);
    }
}