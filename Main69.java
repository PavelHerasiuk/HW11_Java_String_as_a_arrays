package by.epam.linear_program.main;

// 3. В строке найти количество цифр. Цифры это знаки от 0 до 9.
public class Main69 {
    public static void main(String[] args) {

        String s = "Тестовая_3,092 строка_1,7 на поиск52 количесво  8202 цифр7";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                System.out.print(s.charAt(i) + ", ");
                count++;
            }
        }
        System.out.println("\n Количество цифр в строке равно: " + count);
    }
}