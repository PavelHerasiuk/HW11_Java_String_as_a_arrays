package by.epam.linear_program.main;

//2. Заменить в сротке все вхождения 'word' на 'letter'.
public class Main68 {
    public static void main(String[] args) {

        String str1 = "Заменим в тексте все слова  word  все слова word на letter. Ещеword естьword слова word.";
        System.out.println(str1);
        String str2 = "Измененный текст: " + str1.replaceAll("word", "letter");
        System.out.println(str2);
    }
}