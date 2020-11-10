package by.epam.linear_program.main;

//5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
// Крайние пробелы в строке удалить.
public class Main71 {
    private static String removeExtraSpaces(String s) {

        StringBuilder strBuilder = new StringBuilder();
        String line = s.trim();
        boolean isSpace = false;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                if (!isSpace) {
                    strBuilder.append(" ");
                }
                isSpace = true;
            } else {
                strBuilder.append(line.charAt(i));
                isSpace = false;
            }
        }
        return strBuilder.toString();
    }

    public static void main(String[] args) {
        String plentyOfSpace = "  Remove   all  extra  spaces  in  the  string  and replace   a  series  of  consecutive  spaces  with  single  spaces.";

        System.out.println(removeExtraSpaces(plentyOfSpace));
    }
}