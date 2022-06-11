package lesson7.string;

public class StringMethods {

    public static void main(String[] args) {
        String a1 = "Hello My ";
        String a2 = "Dear World";
        String a3 = a1 + a2;
        //a3 = a1.concat(a2); //ровно аналигичное действие предыдущему

        String b1 = "Число";
        int b2 = 10;
        String b3 = b1 + b2; //здесь прежде чем конкатенировать надо преобразовать еще к строке
        //b3 = b1.concat(b2); ошибка нельзя конкатенировать с примитивом
       // b3 = b1.concat(String.valueOf(b2)); прежде чем проконкантировать у нас всегда будет вызывать примерно метод valueOf

        System.out.println(a1.equals(a2));
        System.out.println(a1.compareTo(a2));

        String spaces = "         \t\n\s        ";
        System.out.println(spaces.trim()); //убирает пробелы, и возвращает новую строку не меняет ее
        System.out.println(spaces == null); //есть ли вообще экземпляр строки, "" - false, пустая строка все таки значение
        System.out.println(spaces.isEmpty());//"" - true, данный метод говорит что нет никаких символов в этой строке. "   " - false, это уже какие-то символы, не пустая строка
        System.out.println(spaces.isBlank());//"" - true, "    " - true даже если есть символ табуляции \t переноса \n пробела \s
        System.out.println(spaces.trim().isEmpty()); //более распространенный вариант в корпоративной разработке, аналогичен isBlank
        System.out.println(!(spaces.length() > 0)); //проверяет на длину строки "" - true, "    " - false

        System.out.println(a3.substring(10)); //говорим начальный символ с которого мы будем вырезать одну строку из другой строки
        System.out.println(a3.substring(10, 16)); //перегруженный метод, всего 6 символов
        //как сделать в строке заглавной только первую букву, специального метода нет, поэтому используют костыль свящанный с сабстрингом и группой методов toLowerCase и toUpperCase

        System.out.println(a3.charAt(10)); //буква е в Dear
        System.out.println(a3.indexOf('e')); //индекс 1 Hello
        System.out.println(a3.indexOf('e',2)); //можно с циклом чтобы найти все

        //Как сделать в строке заглавной только первую букву?
        System.out.println(a3.toUpperCase());
        System.out.println((a3.toUpperCase()).substring(1).toLowerCase());
        System.out.println(a3.toLowerCase());

        String a11 = "jenya";
        String bgLtr = a11.substring(0, 1);
        System.out.println(bgLtr.toUpperCase() + a11.substring(1));

        for (String s : a3.split("\s+",3)) { //универсальный перенос строки
            System.out.println("Слово: " + s); //в данном случае делим каждую строку по пробелам
        }

        System.out.println(a3.replaceAll("My", "Our"));
        System.out.println(a3.startsWith("/auth"));
        // /auth login pass

        System.out.println(String.join(", ", a1, a2, b1, b3));
    }
}
