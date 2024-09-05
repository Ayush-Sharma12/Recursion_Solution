package Recursion.Assignment;

public class sol5 {
          public static int FindAms(int n)
          {
                  int sum = 0 ;
                  if(n==0) return 0;
                  else{
                      //       sum += Math.pow(n%10, 3);
                              sum += findPowOf(n%10, 3);
                            return sum + FindAms(n/10);
                  }
          }

      
          public static int findPowOf(int n, int pow)
          {
              if(pow == 1) return n*n;

              else{
                      return n * findPowOf(n, pow/2);
              }
           }
         public static void main(String[] args) {
                  

                  int n = 153;
                int res =  FindAms(n);

                 if(res == n) System.out.println("Yes");
                 else System.out.println("No");

         }
}
