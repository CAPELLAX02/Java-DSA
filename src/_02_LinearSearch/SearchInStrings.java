package _02_LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Ahmet";
        System.out.println(search(name, 'e')); // true
        System.out.println(search(name, 'x')); // false
        System.out.println(search(name, '*')); // false

        System.out.println(search2(name, '+')); // false
        System.out.println(search2(name, 'a')); // false
        System.out.println(search2(name, 'A')); // true
    }

    static boolean search(String str, char target) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }

        return false;
    }

    // We can do exactly the same thing changing the implementation a bit
    static boolean search2(String str, char target) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;
    }
}
