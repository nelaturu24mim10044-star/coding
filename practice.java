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
// public class RemoveDuplicatesEasy3 {
//     public static void main(String[] args) {
//         String s = "programming";
//         String result = "";
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);

//             if (result.indexOf(c) == -1) {
//                 result += c;
//             }
//         }
//         System.out.println(result);
//     }
// }



// 10Q.
// public class LargestWordEasy1 {
//     public static void main(String[] args) {
//         String s = "Java is a powerful language";
//         String[] words = s.split(" ");
//         String largest = "";
//         for (String w : words) {
//             if (w.length() > largest.length())
//                 largest = w;
//         }
//         System.out.println("Largest Word: " + largest);
//     }
// }



// 11Q.
// public class ToggleCharacters {
//     public static void main(String[] args) {
//         String s = "HeLLo";
//         StringBuilder sb = new StringBuilder();
//         for (char c : s.toCharArray()) {
//             if (Character.isUpperCase(c))
//                 sb.append(Character.toLowerCase(c));
//             else
//                 sb.append(Character.toUpperCase(c));
//         }
//         System.out.println(sb.toString());
//     }
// }



// 12Q.
//   public class CountTypes {
//     public static void main(String[] args) {
//         String s = "Hello@123";
//         int letters = 0, digits = 0, special = 0;
//         for (char c : s.toCharArray()) {
//             if (Character.isLetter(c)) letters++;
//             else if (Character.isDigit(c)) digits++;
//             else special++;
//         }
//         System.out.println("Letters = " + letters);
//         System.out.println("Digits = " + digits);
//         System.out.println("Special = " + special);
//     }
// }




// 13Q.
// public class LongestCommonPrefix {
//     public static void main(String[] args) {
//         String[] arr = {"flower","flow","flight"};
//         String prefix = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             while (!arr[i].startsWith(prefix)) {
//                 prefix = prefix.substring(0, prefix.length() - 1);
//             }
//         }
//         System.out.println("Longest Common Prefix: " + prefix);
//     }
// }  

