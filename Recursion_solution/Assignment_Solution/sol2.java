package Recursion.Assignment;

public class sol2 {
          public static int AlternateSum(int n)
          {
                 if(n==1) return 1;
       
                  else if(n%2==0)
                  {
                             return -n + AlternateSum(n-1);
                  }
       
                  else{
                           return n + AlternateSum(n-1);
                  }
          }

          public static void main(String[] args) {
                    int n = 10;
                    System.out.println("Alternate Sum: " + AlternateSum(n));
          }
}
