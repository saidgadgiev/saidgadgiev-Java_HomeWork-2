/*
 * public class Task_0 {

// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
public static void main(String[] args) {

}

public String findJewelsInStones(String jewels, String stones) {

    return "";
}
*/


package Homework_2;

public class Task_0 {
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        System.out.println(findJewelsInStones(jewels, stones));
    }
    
    public static String findJewelsInStones(String jewels, String stones) {
        int count = 0;
        StringBuilder result = new StringBuilder();
    
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }
            if (count > 0) {
                result.append(jewels.charAt(i));
                result.append(count);
                count = 0;
            }
        }
        return result.toString();
    }
    
}
