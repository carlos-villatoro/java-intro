import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.awt.*;
import java.nio.channels.AsynchronousByteChannel;

// PRIMITIVE TYPES -- store simple values
// int - whole numbers
// long - larger whole numbers
// float - num w decimals
// double - larger nums w decimals
// char - letters
// boolen - true/false
// public class App { 
//     public static void main(String[] args) throws Exception {
//         byte age = 30; //small num
//         int viewCount = 123_456_789; // split large nums up w _ as comma
//         long viewsCount = 3_123_456_789L; // 7+ digits need to be long and suffixed with L
//         float price = 10.99F; // default as double, suffix w F to be float
//         double pricing = 10.99;
//         char letter = 'k'; // single char with ''
//         boolean isLearning = true;  
//     }
// }


// REFERENCE TYPES -- referencing values
// public class App { 
//     public static void main(String[] args) throws Exception {
//         // byte age = 30; // primitive
//         // LocalDate now = LocalDate.now(); // techinically a class with class methods
//         // System.out.println(now); // sout shortcut 

//         // byte x = 1;
//         // byte y = x;
//         // x = 2;
//         // System.out.println(y); // x and y are independent with primitives

//         Point point1 = new Point(1, 1); // these obj addr's will be stored in memory
//         Point point2 = point1; // referencing the same addr = obj
//         point1.x = 2;
//         System.out.println(point2);
//     }
// }


// STRINGS
// public class App { 
//     public static void main(String[] args) throws Exception {
//         // String message = "hello world"; // can use string literal
//         String message = "hello world" + "!"; // concat with +
//         System.out.println(message);
//         System.out.println(message.endsWith("!")); // string methods -- return true or false
//         System.out.println(message.startsWith("!")); // false
//         System.out.println(message.length());
//         System.out.println(message.indexOf("h")); //  return -1 if not in string
//         System.out.println(message.replace("!", "!!")); // returns new string, Strings are class >> immutable
//         System.out.println(message.toLowerCase());
//         System.out.println(message.trim()); // gets rid of white spaces
//     }
// }
// public class App { 
//     public static void main(String[] args) throws Exception {
//         String message = "helllo \"mate\" "; // \ to put characters in string
//         String url = "c:\\Windows\\.."; // double \ to prefix \
//         String lines = "hello \nMate this is a \tindent"; // \n makes new line
//         System.out.println(url); // c:\Window\...
//     }
// }


// ARRAYS
// have fixed length , no default push pop methods
public class App { 
    public static void main(String[] args) throws Exception {
        // array of integers -- type can be spec'd
        int[] numbers = new int[5]; // new instance[length of the array]
        numbers[0] = 1;
        numbers[1] = 2; // any index not set defaults to 0
        // numbers[10] = 3; // throws error since more than length
       System.out.println(Arrays.toString(numbers)); // prints string representation of array
        System.out.println(numbers); // [I@75a1cd57 -- mem hash

        int[] newNumbers = { 2, 3, 5, 4, 6 }; // basically array literal
        System.out.println(newNumbers.length); // 5 -- 
        Arrays.sort(newNumbers);
        System.out.println(Arrays.toString(newNumbers));

        // multidimensional array - add more [] = [length]
        int[][] nums = new int[2][3]; // two rows, 3 columns
        nums[0][0] = 1;
        System.out.println(Arrays.toString(nums)); // array of hashes
        System.out.println(Arrays.deepToString(nums)); // array of string reps

        int[][] newNums = { {1,2,3}, {4,5,6} }; // {} for each array
        System.out.println(Arrays.deepToString(newNums)); // array of string reps
    }
}