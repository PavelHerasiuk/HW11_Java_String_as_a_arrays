package by.epam.linear_program.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 4. В строке найти количество чисел.
public class Main70_1 {
    public static void main(String[] args) {

        Pattern p = Pattern.compile("-?\\d+");
        Matcher m = p.matcher("Тестовая_12 строка_2 на поиск_52  4   колич11111есво_8222 цифр_2");
        int group = 0;
        while (m.find()) {
            System.out.print(m.group() + ", ");
            group++;
        }
        System.out.println('\n' + "Количество чисел в строке ровно: " + group);
    }
}