import java.util.Scanner;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        int[] count = new int[26]; 
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        int index = firstUniqChar(input);
        System.out.println("First unique character index: " + index);
    }
}
