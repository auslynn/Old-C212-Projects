////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  1/20/20
//
//  Lab 2
//  @Author  Austin Lynn , auslynn
//  Last Edited:  1/29/20
//
//
//  Directions: See Below 
//               
//////////////////////////////////////////////////////////////////////////////////

// 1. Change the following program to use compound assignments, pre- or post- increment/decrement statements ONLY as appropriate.
class CompoundExercises {

     public static void compoundOperators(){
          
          int result = -1; // result is -1
          System.out.println(result);

          result -= 1; // result is now -2
          System.out.println(result);

          result *= -2; // result is now 4
          System.out.println(result);

          result /= 2; // result is now 2
          System.out.println(result);

          result += 3; // result is now 5
          System.out.println(result);

          result %= 3; // result is now 2
          System.out.println(result);
     }
     
// 2. In the following program, explain why the value "-4" is printed thrice in a row:
     public static void question1() {
        int i = -5;
        i++;
        System.out.println(i);    // "-4"
        ++i;                     
        System.out.println(i);    // "-3"
        System.out.println(--i);  // "-4"
        System.out.println(i--);  // "-4"
        System.out.println(++i);  // "-4"
     }
     
/* Explanation written in steps
 * 1) i begins as -5
 * 2) post-incremental addition is carried out, making i = -4
 * 3) i is printed as -4
 * 4) pre-incremental addition is carried out, making i = -3
 * 5) i is printed as -3
 * 6) a pre-incremental subrtaction of i is printed, so i goes from -3 to -4 BEFORE the line is printed, so -4 is printed
 * 7) a post-incremental subraction of i is printed, so i goes from -4 to -5 AFTER the line is printed, so -4 is printed
 * 8) a pre-incremental addition of i is printed, so i goes from -5 to -4 BEFORE the line is printed, so -4 is printed once again
 */
}