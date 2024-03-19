public class Main {
    public static void main(String[] args) {
      //  Write a Java Program to Compute the Sum of Array Elements.

        // Declaration of Array

        int arr[] ={12,12,4,15,5};

        // method for sumof elements in an Array

            static  int sum()

        {

            sum =0; //Initialize sum
            int i;

            // iterate through all elements  and add them to sum

            for(i=0;i<arr.length ; i++)
                sum+=arr[i];

            return sum;


        }



    }
}