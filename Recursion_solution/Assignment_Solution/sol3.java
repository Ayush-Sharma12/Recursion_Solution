package Recursion.Assignment;

public class sol3 {
          public static int res = 0;
          public static int FindMaxElement(int[] arr, int i, int max)
         {
            // int res  = 1;
                 if(i==arr.length) return  0;

                 else{


                        if(arr[max]<arr[i]){

                              // arr[max] = arr[i];
                        
                    //       return max + FindMaxElement(arr, i+1, max);
                              res = i;
                           }
                              FindMaxElement(arr, i+1, res);
                    //     else return max + FindMaxElement(arr, i+1, max);

                                          
                 }
 
                   return res;
                  //  return max;
 
          }
      
          public static void main(String[] args) {
                    
             int[] arr = {13, 1, -3, 22, 5};

            int max = 0;

            int res = FindMaxElement(arr, 1, max);
 
            System.out.println("Max Element is: " + arr[res]);
             


          }
}
