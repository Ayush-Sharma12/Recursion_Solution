package Recursion.Assignment;

public class sol4 {
          public static int FindSum(int[] arr, int i)
   {
         int sum = 0;
          if(i==arr.length) return 0;

          else{
                     sum  += arr[i]; 
                    return sum + FindSum(arr, i+1);
          }
   }

           public static void main(String[] args) {
              int[] arr = {92, 23, 15, -20, 10};
              
              int res = FindSum(arr, 0);

              System.out.println("Sum of an Array is: "  + res);


     

           }
}
