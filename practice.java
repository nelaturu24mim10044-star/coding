//1Q.
// public class CountVowels {
//     public static void main(String[] args) {
//         String s = "Hello World";
//         int count = 0;
//         s = s.toLowerCase();
//         for (char c : s.toCharArray()) {
//             if ("aeiou".indexOf(c) != -1) count++;
//         }
//         System.out.println("Vowels = " + count);
//     }
// }


//2Q.
// public class CountWordsEasy1 {
//     public static void main(String[] args) {
//         String s = "Hello this is sai";
//         String[] words = s.split(" ");
//         System.out.println("Word Count = " + words.length);
//     }
// }




//3Q.
// public class PalindromeEasy1 {
//     public static void main(String[] args) {
//         String s = "madam";
//         String rev = new StringBuilder(s).reverse().toString();
//         System.out.println("Reversed string: " + rev);
//         if (s.equals(rev))
//             System.out.println("Palindrome");
//         else
//             System.out.println("Not Palindrome");
//     }
// }




//4Q.
// public class RemoveSpaces {
//     public static void main(String[] args) {
//         String s = "SAI KRISHNA";
//         s = s.replaceAll(" ", "");
//         System.out.println(s);
//     }
// }


//5Q.
// public class CaseConversion {
//     public static void main(String[] args) {
//         String s = "saikrishna";
//         System.out.println(s.toUpperCase());
//         System.out.println(s.toLowerCase());
//     }
// }


//6Q.
// public class CharFreqEasy2 {
//     public static void main(String[] args) {
//         String s = "programming";

//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);

//             // Skip printed characters
//             if (s.indexOf(c) != i) continue;

//             int count = 0;

//             // Count occurrences
//             for (int j = 0; j < s.length(); j++) {
//                 if (s.charAt(j) == c)
//                     count++;
//             }

//             System.out.println(c + " = " + count);
//         }
//     }
// }

// 7Q.
// public class FirstNonRepeatEasy1 {
//     public static void main(String[] args) {
//         String s = "saikrishna";
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             boolean repeated = false;
//             for (int j = 0; j < s.length(); j++) {
//                 if (i != j && s.charAt(j) == c) {
//                     repeated = true;
//                     break;
//                 }
//             }
//             if (!repeated) {
//                 System.out.println("First non-repeating: " + c);
//                 return;
//             }
//         }
//     }
// }

//8Q.
// import java.util.Arrays;
// public class AnagramEasy1 {
//     public static void main(String[] args) {
//         String s1 = "silent";
//         String s2 = "listen";
//         char[] a = s1.toCharArray();
//         char[] b = s2.toCharArray();
//         Arrays.sort(a);
//         Arrays.sort(b);
//         if (Arrays.equals(a, b))
//             System.out.println("Anagram");
//         else
//             System.out.println("Not Anagram");
//     }
// }


//9Q.
