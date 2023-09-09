class PrimeNum{
public static void main (String[] args) {
                      // Your code here

	     {
        Scanner sc = new Scanner(System.in);
        // Declare the variables
        int N, M, i, j, flag;
        N = sc.nextInt(); // Take input
        M = sc.nextInt(); 
 
        // Print display message
        //System.out.printf(N, M);
 
        // Traverse each number in the interval
        // with the help of for loop
        for (i = N; i <= M; i++) {
 
            // Skip 0 and 1 as they are
            // neither prime nor composite
            if (i == 1 || i == 0)
                continue;
 
            // flag variable to tell
            // if i is prime or not
            flag = 1;
 
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
 
            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                System.out.println(i);
        }
    }