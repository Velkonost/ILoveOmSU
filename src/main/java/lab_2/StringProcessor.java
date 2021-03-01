package lab_2;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 */
public class StringProcessor {
    // На входе строка s и целое число N.
    // Выход — строка, состоящая из N копий строки s,
    // записанных подряд. При N = 0 результат — пустая строка. При N < 0 выбрасывается
    // исключение.
    public static String mulStr(String string, int n) throws Exception {
        if(string == null){
            throw new Exception("Can't multiply null string");
        }
        if(n<0) {
            throw new Exception("Can't multiply string negative times");
        }
        StringBuilder sb = new StringBuilder(string);
        for(int i = 0; i < n-1; i++){
            sb.append(string);
        }
        return sb.toString();
    }

    // На входе две строки.
    // Результат — количество вхождений второй строки в первую.
    public static int countOfSubstring(String string1, String string2) throws Exception{
        if(string1 == null || string2 == null){
            throw new Exception("String can't be null");
        }
        int counter = 0;
        for(int i = 0;i + string2.length() <= string1.length();++i){
            if(string1.substring(i,i + string2.length()).contains(string2)){
                counter++;
            }
        }
        return counter;
    }

    // Построение по строке новой строки, которая получена из исходной заменой каждого
    // символа '1' на подстроку ”один”, символа ‘2’ на подстроку “два” и символа ‘3’ на
    // подстроку “три”.
    public static String charToNumberReplace(String string)throws Exception{
        if(string == null){
            throw new Exception("String can't be null");
        }
        StringBuilder sb = new StringBuilder(string);
        for(int i = 0; i<sb.length(); i++){
            switch (sb.charAt(i)){
                case '1': {
                    sb.deleteCharAt(i);
                    sb.insert(i,"one");
                    break;
                }
                case '2': {
                    sb.deleteCharAt(i);
                    sb.insert(i,"two");
                    break;
                }
                case '3': {
                    sb.deleteCharAt(i);
                    sb.insert(i,"three");
                    break;
                }
            }
        }
        return sb.toString();
    }

    // Удалени в строке типа StringBuilder каждого второго по счету символа.
    // Модифицируется входная строка, а не порождается новая.
    public static String charRemove(StringBuilder sb) throws Exception{
        if (sb == null){
            throw new Exception("String Builder can't be null");
        }

        for (int i = 1; i < sb.length(); i++){
            sb.deleteCharAt(i);
        }

        return sb.toString();
    }
}
