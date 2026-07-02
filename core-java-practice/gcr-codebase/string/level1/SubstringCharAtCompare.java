import java.util.Scanner;

public class SubstringCharAtCompare {
    public static String substringByCharAt(String s, int start, int end) {
        if (s == null) return null;
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareByCharAt(String a, String b) {
        if (a == null || b == null) return a == b;
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String subManual = substringByCharAt(text, start, end);
        String subBuilt = "";
        try {
            subBuilt = text.substring(start, end);
        } catch (Exception e) {
            subBuilt = "<substring error: " + e.getClass().getSimpleName() + ">";
        }

        System.out.println("Manual substring: " + subManual);
        System.out.println("Built-in substring: " + subBuilt);
        System.out.println("Equal by charAt compare: " + compareByCharAt(subManual, subBuilt));
        sc.close();
    }
}
