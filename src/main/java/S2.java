import java.util.Arrays;

public class S2 {
    public static void main(String[] args) {
        System.out.println(contain());
        System.out.println(spin());
        System.out.println(num());
        System.out.println(eql());
        System.out.println(eql1());
    }

    public static boolean contain() { //Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        String long_string = "Hello world!";
        String stirng = "world";
        return long_string.contains(stirng);
    }
    public static boolean spin() { //Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
        String str = "Hello world";
        String rts = "dlrow olleH";
        rts = new StringBuilder(rts).reverse().toString();
        return (str.contains(rts) && rts.contains(str));
    }
    public static String num() { //Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        int a = 3;
        int b = 56;
        StringBuilder builder = new StringBuilder();
        builder
                .append(a)
                .append(" + ")
                .append(b)
                .append(" = ")
                .append(a + b);
        String str = builder.toString();
        return str;
    }
    public static String eql() { //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
        String str = "3 + 56 = 59";
        StringBuilder builder = new StringBuilder(str);
        int i = builder.indexOf("=");
        return  builder.deleteCharAt(i).insert(i,"равно").toString();
    }
    public static String eql1() { //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        String str = "3 + 56 = 59";
        StringBuilder builder = new StringBuilder(str);
        int i = builder.indexOf("=");
        return  builder.replace(i,i + 1,"равно").toString();
    }
}
