public class StringChecker {
    private static String spaceRemove(String s) {//убираю пробелы в строке
        while (s.contains(" ")) {
            int x = s.indexOf(" ");
            String s1 = s.substring(0, x);
            s = s1 + s.substring(x + 1, s.length());
        }
        return s;

    }

    public void isPolindrome(String s) {
        s = spaceRemove(s);//убираю пробелы в строке
        s = s.toLowerCase();
        char a[] = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != a[a.length - 1 - i]){
                System.out.println("Не полиндром");
                return;
            }
        }

        System.out.println("Полиндром");
        return;
    }

}