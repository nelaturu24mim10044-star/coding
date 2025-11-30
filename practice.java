//DAY 1

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
// public class CountWords {
//     public static void main(String[] args) {
//         String s = "Hello this is sai";
//         String[] words = s.split(" ");
//         System.out.println("Word Count = " + words.length);
//     }
// }




//3Q.
// public class Palindrome {
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
// public class CharFreq {
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
// public class FirstNonRepeat {
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
// public class Anagram {
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
// public class RemoveDuplicates {
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
// public class LargestWord {
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


//DAY 2

// Q1.
// public class SumMaxMin {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4};
//         int sum = 0;
//         int max = arr[0];
//         int min = arr[0];
//         for (int n : arr) {
//             sum += n;
//             if (n > max) max = n;
//             if (n < min) min = n;
//         }
//         System.out.println("Sum = " + sum);
//         System.out.println("Max = " + max);
//         System.out.println("Min = " + min);
//     }
// }




// Q3.
// public class CountOccurrences {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 2, 3, 2};
//         int element = 2;
//         int count = 0;
//         for (int n : arr) {
//             if (n == element) count++;
//         }
//         System.out.println("Count = " + count);
//     }
// }





// Q4.
// import java.util.*;

// public class RemoveDuplicates {
//     public static void main(String[] args) {
//         int[] arr = {1, 1, 2, 3, 3};
//         Set<Integer> set = new HashSet<>();
//         for (int n : arr) set.add(n);
//         System.out.println(set);
//     }
// }




// Q5.
//   public class CheckExists {
//     public static void main(String[] args) {
//         int[] tuple = {1, 3, 5, 7};
//         int element = 3;
//         boolean exists = false;
//         for (int n : tuple) {
//             if (n == element) exists = true;
//         }

//         System.out.println("true or false " + exists);
//     }
// }




// Q8.
// import java.util.*;

// public class SecondLargest {
//     public static void main(String[] args) {
//         int[] arr = {12, 45, 33, 27};
//         Arrays.sort(arr);
//         int secondLargest = arr[arr.length - 2];
//         System.out.println("Second Largest = " + secondLargest);
//     }
// }




// Q9.
// import java.util.*;

// public class SetIntersection {
//     public static void main(String[] args) {
//         Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
//         Set<Integer> s2 = new HashSet<>(Arrays.asList(2, 3, 4));
//         s1.retainAll(s2);
//         System.out.println("Intersection = " + s1);
//     }
// }





// Q10.
// import java.util.*;

// public class RemoveIfExists {
//     public static void main(String[] args) {
//         Set<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30));
//         set.remove(40);
//         System.out.println(set);
//     }
// }




//  Q11.
//   import java.util.*;

// public class ReverseListAddFront {
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40};
//         List<Integer> reversed = new ArrayList<>();
//         for (int n : arr) {
//             reversed.add(0, n);  // add at the start
//         }

//         System.out.println(reversed);
//     }
// }





// Q12.
// import java.util.*;

// public class UniqueCount {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 2, 3, 4, 4, 5};
//         Set<Integer> set = new HashSet<>();
//         for (int n : arr) set.add(n);
//         System.out.println("Unique count = " + set.size());
//     }
// }




// Q13.
//   import java.util.*;

// public class SquaresTuple {
//     public static void main(String[] args) {
//         int n = 5;
//         int[] squares = new int[n];
//         for (int i = 1; i <= n; i++) {
//             squares[i - 1] = i * i;
//         }

//         System.out.println(Arrays.toString(squares));
//     }
// }





// Q14.
// public class PairSum {
//     public static void main(String[] args) {
//         int[] arr = {1, 4, 2, 3, 5};
//         int target = 6;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] + arr[j] == target) {
//                     System.out.println("(" + arr[i] + ", " + arr[j] + ")");
//                 }
//             }
//         }
//     }
// }




  

// Q15.
// import java.util.*;

// public class SameElements {
//     public static void main(String[] args) {
//         int[] a = {1, 2, 3};
//         int[] b = {3, 2, 1};
//         Arrays.sort(a);
//         Arrays.sort(b);
//         boolean same = Arrays.equals(a, b);
//         System.out.println("Same elements = " + same);
//     }
// }

//DAY 3
// Q1.
// public class CountVowels {
//     public static int countVowels(String s) {
//         if (s == null) return 0;
//         int count = 0;
//         String lower = s.toLowerCase();
//         for (int i = 0; i < lower.length(); i++) {
//             char c = lower.charAt(i);
//             if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') count++;
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         String input = "saikrishnareddy";
//         System.out.println("Input: " + input);
//         System.out.println("Vowel count: " + countVowels(input)); 
//     }
// }

// Q2.
// public class AreaOverload {
//     public static double area(double radius) {
//         return Math.PI * radius * radius;
//     }
// public static double area(double width, double height) {
//         return width * height;
//     }
//     public static double areaTriangle(double base, double height, boolean triangle) {
//         // using separate signature to avoid ambiguity with rectangle; 
//         // caller sets triangle=true to use triangle formula
//         return 0.5 * base * height;
//     }

//     public static void main(String[] args) {
//         System.out.println("Circle r=3 -> " + area(3.0));
//         System.out.println("Rectangle 4x5 -> " + area(4.0, 5.0));
//         System.out.println("Triangle base=4 height=5 -> " + areaTriangle(4.0, 5.0, true));
//     }
// }


// Q3.
// public class LongestWord {
//     public static String longestWord(String sentence) {
//         String[] words = sentence.split(" ");
//         String longest = "";

//         for (String w : words) {
//             if (w.length() > longest.length()) {
//                 longest = w;
//             }
//         }
//         return longest;
//     }

//     public static void main(String[] args) {
//         String s = "it is Thusday";
//         System.out.println("Longest word: " + longestWord(s));
//     }
// }

// Q4.
// public class RecursiveFactorial {
//     public static long factorial(int n) {
//         if (n < 0) throw new IllegalArgumentException("n must be >= 0");
//         if (n == 0 || n == 1) return 1;
//         return n * factorial(n - 1);
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         System.out.println(n + "! = " + factorial(n)); // 3628800
//     }
// }


// Q5.
// import java.util.Arrays;

// public class SortArray {
//     public static void sortArray(int[] arr) {
//         Arrays.sort(arr);   // built-in sorting
//     }

//     public static void main(String[] args) {
//         int[] a = {5, 3, 8, 4, 2};
//         sortArray(a);
//         System.out.println(Arrays.toString(a));
//     }
// }



// Q6.
// public class RecursiveFactorial {
//     public static long factorial(int n) {
//         if (n < 0) throw new IllegalArgumentException("n must be >= 0");
//         if (n == 0 || n == 1) return 1;
//         return n * factorial(n - 1);
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         System.out.println(n + "! = " + factorial(n));
//     }
// }




// Q7.
// public class RecursiveFibonacci {

//     public static long fib(int n) {
//         if (n < 0) throw new IllegalArgumentException("n must be >= 0");
//         if (n == 0) return 0;
//         if (n == 1) return 1;
//         return fib(n - 1) + fib(n - 2);
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         System.out.println("fib(" + n + ") = " + fib(n)); // 55
//     }
// }


// Q8.
// public class BinarySearchEasy1 {
//     public static int binarySearch(int[] arr, int target, int low, int high) {
//         if (low > high) 
//             return -1;

//         int mid = (low + high) / 2;

//         if (arr[mid] == target)
//             return mid;

//         if (target < arr[mid])
//             return binarySearch(arr, target, low, mid - 1);

//         return binarySearch(arr, target, mid + 1, high);
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 4, 6, 8, 10, 12};
//         System.out.println(binarySearch(arr, 10, 0, arr.length - 1));
//     }
// }


// Q9.
//  public class Power {
//     public static int power(int base, int exp) {
//         if (exp == 0) return 1;
//         return base * power(base, exp - 1);
//     }

//     public static void main(String[] args) {
//         System.out.println(power(2, 5));
//     }
// }


// Q10.
// public class CountOccurrences {

//     public static int count(int[] arr, int target, int index) {
//         if (index == arr.length)
//             return 0;  

//         int add = (arr[index] == target) ? 1 : 0;
//         return add + count(arr, target, index + 1);
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 2, 1, 3, 2};
//         System.out.println(count(arr, 2, 0));  
//     }
// }



// Q11.
// import java.util.*;

// public class PowerSet {

//     public static void subsets(String s, int index, String current) {
//         if (index == s.length()) {
//             System.out.println(current);  
//             return;
//         }
//         subsets(s, index + 1, current);
//         subsets(s, index + 1, current + s.charAt(index));
//     }
//     public static void main(String[] args) {
//         subsets("abc", 0, "");
//     }
// }



// Q12.
// public class Permutation {
//     public static void permute(char[] arr, int index) {
//         if (index == arr.length) {
//             System.out.println(new String(arr));
//             return;
//         }

//         for (int i = index; i < arr.length; i++) {
//             char temp = arr[index];
//             arr[index] = arr[i];
//             arr[i] = temp;

//             permute(arr, index + 1);
//             temp = arr[index];
//             arr[index] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     public static void main(String[] args) {
//         String s = "abc";
//         permute(s.toCharArray(), 0);
//     }
// }


// DAY 4

// Q1.

// public class Marks1 {
//     public static void main(String[] args) {
//         Marks m = new Marks();
//         m.setMaths(85);
//         m.setScience(90);
//         m.setEnglish(78);

//         System.out.println("Maths: " + m.getMaths());
//         System.out.println("Science: " + m.getScience());
//         System.out.println("English: " + m.getEnglish());

//         System.out.println("Total Marks: " + m.totalMarks());
//         System.out.println("Average Marks: " + m.averageMarks());
//     }
// }

// class Marks {
//     private int maths;
//     private int science;
//     private int english;

//     public void setMaths(int maths) {
//         if (isValid(maths)) this.maths = maths;
//         else System.out.println("not in 0-100.");
//     }

//     public void setScience(int science) {
//         if (isValid(science)) this.science = science;
//         else System.out.println("not in 0-100.");
//     }

//     public void setEnglish(int english) {
//         if (isValid(english)) this.english = english;
//         else System.out.println("not in 0-100.");
//     }

//     public int getMaths() { return maths; }
//     public int getScience() { return science; }
//     public int getEnglish() { return english; }

//     private boolean isValid(int mark) {
//         return mark >= 0 && mark <= 100;
//     }

//     public int totalMarks() {
//         return maths + science + english;
//     }

//     public double averageMarks() {
//         return totalMarks() / 3.0;
//     }
// }

// Q2.
// public class Book2 {
//     public static void main(String[] args) {
//         Book b = new Book();
//         b.setTitle("Introduction to Java");
//         b.setPrice(399.50);

//         b.showDetails();
//     }
// }

// class Book {
//     private String title;
//     private double price;

//     public String getTitle() { return title; }
//     public double getPrice() { return price; }

//     public void setTitle(String title) {
//         if (title != null && !title.trim().isEmpty()) this.title = title;
//         else System.out.println("Invalid title.");
//     }

//     public void setPrice(double price) {
//         if (price >= 0) this.price = price;
//         else System.out.println("Price cannot be negative.");
//     }

//     public void showDetails() {
//         System.out.println("Book Title: " + title);
//         System.out.println("Price: " + price);
//     }
// }





  

// Q3.
// public class BankAccount3 {
//     public static void main(String[] args) {

//         BankAccount acc = new BankAccount(500);

//         acc.deposit(200);      
//         acc.withdraw(100);     
//         acc.withdraw(1000);    

//         System.out.println("Final Balance: " + acc.getBalance());
//     }
// }

// class BankAccount {
//     private double balance;

//     BankAccount(double amount) {
//         if (amount >= 0)
//             balance = amount;
//         else {
//             balance = 0;
//             System.out.println("Invalid starting amount. Balance set to 0.");
//         }
//     }

//     void deposit(double amount) {
//         if (amount > 0)
//             balance += amount;
//         else
//             System.out.println("Deposit must be positive.");
//     }

//     void withdraw(double amount) {
//         if (amount <= 0) {
//             System.out.println("Withdraw must be positive.");
//         } 
//         else if (amount > balance) {
//             System.out.println("Not enough balance!");
//         } 
//         else {
//             balance -= amount;
//         }
//     }
//     double getBalance() {
//         return balance;
//     }
// }






  
// Q4.
// public class Employee4 {
//     public static void main(String[] args) {
//         Employee emp = new Employee("Alice");
//         emp.setSalary(5000); 
//         System.out.println(emp.getName() + "'s monthly salary: " + emp.getSalary());
//         System.out.println("Annual Salary: " + emp.calculateAnnualSalary());
//     }
// }

// class Employee {
//     private String name;
//     private double baseSalary; 

//     public Employee(String name) {
//         this.name = name;
//         this.baseSalary = 0.0;
//     }

//     public String getName() { return name; }

//     public void setSalary(double salary) {
//         if (salary >= 0) this.baseSalary = salary;
//         else System.out.println("Salary cannot be negative.");
//     }

//     public double getSalary() {
//         return baseSalary;
//     }

//     public double calculateAnnualSalary() {
//         return baseSalary * 12;
//     }
// }










  
// Q5.
// public class ATM5 {
//     public static void main(String[] args) {
//         ATM atm = new ATM();
//         atm.setPin("123");      
//         atm.setPin("abcd");     
//         atm.setPin("0456"); 
//         atm.getPin();        
//     }
// }

// class ATM {
//     private String pin;
//     public void setPin(String pin) {
//         if (pin != null && pin.matches("\\d{4}")) {
//             this.pin = pin;
//             System.out.println("PIN set successfully.");
//         } else {
//             System.out.println("Invalid PIN. PIN must be exactly 4 digits.");
//         }
//     }
//     public void getPin() {
//         if (pin == null) {
//             System.out.println("No PIN set.");
//         } else {
//             System.out.println("PIN is secured");
//         }
//     }
// }


  
  
  
  
  
  
  
  
//   Q6.
// public class Animal6 {
//     public static void main(String[] args) {
//         Cat kitty = new Cat();
//         kitty.eat();
//         kitty.meow(); 
//     }
// }

// class Animal {
//     public void eat() {
//         System.out.println("The animal is eating.");
//     }
// }

// class Cat extends Animal {
//     public void meow() {
//         System.out.println("Meow! The cat is meowing.");
//     }
// }









// Q7.
// public class Manager7 {
//     public static void main(String[] args) {

//         Manager m = new Manager("sai", 101, 50000, "Sales");

//         m.displayDetails();
//     }
// }
// class Employee {
//     String name;
//     int id;
//     double salary;

//     Employee(String name, int id, double salary) {
//         this.name = name;
//         this.id = id;
//         this.salary = salary;
//     }
//     public void displayDetails() {
//         System.out.println("Employee Name: " + name);
//         System.out.println("Employee ID: " + id);
//         System.out.println("Salary: " + salary);
//     }
// }
// class Manager extends Employee {
//     String department;

//     Manager(String name, int id, double salary, String department) {
//         super(name, id, salary); 
//         this.department = department;
//     }

//     @Override
//     public void displayDetails() {
//         System.out.println("Manager Name: " + name);
//         System.out.println("Manager ID: " + id);
//         System.out.println("Salary: " + salary);
//         System.out.println("Department: " + department);
//     }
// }







// Q8.
// public class PersonDemo {
//     public static void main(String[] args) {

//         Student s = new Student("Arun", 19, "S101", "Computer Science");
//         Teacher t = new Teacher("Meera", 35, "Maths", 45000);

//         s.display();
//         System.out.println("----------");
//         t.display();
//     }
// }

// class Person {
//     String name;
//     int age;

//     Person(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }


//     public void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }
// }


// class Student extends Person {
//     String rollNumber;
//     String course;

//     Student(String name, int age, String rollNumber, String course) {
//         super(name, age);
//         this.rollNumber = rollNumber;
//         this.course = course;
//     }
  
//     @Override
//     public void display() {
//         System.out.println("Student Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Roll Number: " + rollNumber);
//         System.out.println("Course: " + course);
//     }
// }

// class Teacher extends Person {
//     String subject;
//     double salary;

//     Teacher(String name, int age, String subject, double salary) {
//         super(name, age);
//         this.subject = subject;
//         this.salary = salary;
//     }

//     @Override
//     public void display() {
//         System.out.println("Teacher Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Subject: " + subject);
//         System.out.println("Salary: " + salary);
//     }
// }
