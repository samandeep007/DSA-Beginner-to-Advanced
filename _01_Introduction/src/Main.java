public class Main{
    public static void main(String[] args){
        System.out.println("Introduction to Data structures and algorithms");
        /*
        The increasing order of time complexities is: 1 < log(n) < root(n) < n < nlog(n) < n^2 ....... < n^n < 2^n < 3^n < n!
        Asymptotic Notations: Big Oh, Big omega, Big theta
        Big Oh: It is the upper bound of the function. f(n) = O(g(n)) for all positive values of n such that 0 <= f(n) <= c*g(n) where c and n are constants
        Big Omega: It is the lower bound of the function. f(n) = omega(g(n)) for all positive values of n such that 0 <= c*g(n) <= f(n) where c and n are constants
        Big Theta: It is the middle bound of the function. f(n) = theta(g(n)) for all positive values of n such that c1*g(n) <= f(n) <= c2*g(n) where c1 and c2 are constants

       Asymptotic notations have nothing to do with best, worst, and average case
       Log Formulae
       log(ab) = log(a) + log(b)
       log(a/b) = log(a) - log(b)
       log(a^m) = mlog(a)

         */
    }

    /**
     * @param n
     * This algorithm has a time complexity of O(n) --> Big O of n
     * Why? Because the loop runs n+1 times and the statement inside it runs n times --> n + 1 + n => 2n + 1 => O(n)
     */
    static void algorithm1(int n){
        for(int i = 0; i<n; i++){
            System.out.println(i+1);
        }
    }

    /**
     * This algorithm has a time complexity of O(n^2) --> Big O of n square
     * How? n + 1 + n(n+1) + n^2 => n + 1 + n^2 + n + n^2 => 2n^2 + 2n + 1 => O(n^2)
     */
    static void algorithm2(int n) {
        for (int i = 0; i < n; i++) { // int i = 0 --> Initialization happens only once, so it will run for constant time i.e 1, condition will be checked n+1 times, and the loop variable will be updated
           for(int j = 0; j<n; j++){ // This will run n times because of the outer loop, but it will also run n + 1 times of its own
               System.out.println(i); // This will run n times because of the outer loop and n times because of the inner loop
           }
        }
    }

    /**
     * This algorithm has a time complexity of O(log2n) --> Big O of log n base 2
     * How? let's track i --> Iteration 1 : i = 1 --> iteration 2 : 2 --> iteration 3 --> 2 * 2 = 2^2 ---> iteration 4 --> 2 * 2 * 2 = 2^3 ----------------> iteration k --> 2^k
     * Termination condition would be i >= n => 2^k = n => k = log2n
     */
    static void algorithm3(int n){
        for(int i = 1; i<n; i*=2){
            System.out.println(i);
        }
    }

    /**
     * This algorithm has a time complexity of O(log3n) --> Big O of log n base 3
     */
    static void algorithm4(int n){
        for(int i = 0; i<n; i*=3){
            System.out.println(i);
        }
    }

    /**
     * This algorithm has a time complexity of O(log2n) --> Big O of log n base 2
     * How? let's track i --> Iteration 1: i = n --> Iteration 2: n/2 --> Iteration 3: n/4 --------> Iteration k: n/2^k
     * termination condition would be i<=1 ==> n/2^k = 1 => n = 2^k => k = log2n
     */
    static void algorithm5(int n){
        for(int i = n; i>1; i/=2){
            System.out.println(i);
        }
    }

    /**
     * This algorithm has a time complexity of O(n) --> Big O of n
     * How? let's track i --> Iteration 1: i = 0 --> Iteration 2: 2 --> Iteration 3: 4 --> Iteration 4: 4 + 2 --> Iteration k: 2k
     * termination condition would be i>=n => 2k = n => k = n/2 => k = n
     * @param n
     */
    static void algorithm6(int n){
        for(int i = 0; i<n; i+=2){
            System.out.println(i);
        }
    }

    /**
     * This algorithm has a time complexity of 0(root n) --> Big O of root n
     * How? let's track i --> Iteration 1: i = 0 --> Iteration 2: i --> 1 ---> Iteration k: k
     * Termination condition would be i*i >= n => k^2 = n => k = root n
     * @param n
     */
    static void algorithm7(int n){
        for (int i = 0; i*i < n; i++) {
            System.out.println(i);
        }
    }

    /**
     * This algorithm has a time complexity of O(n) --> Big 0 of n
     * How? Let's track i --> Iteration 1: i = 0; j = 0; --> Iteration 2: i = 1; j = 1; --> Iteration k --> both are k
     * Time function = t(n) = n + 1 + n + n + 1 + n => 3n + 2 => n
     * @param n
     */
    static void algorithm8(int n){
        for (int i = 0; i < n; i++) { //This will run n + 1 times
            System.out.println(i); // This will run n times
        }
        for (int j = 0; j < n; j++) { // This will run n + 1 times
            System.out.println(j); //This will run n times
        }
    }

    /**
     * This algorithm has a time complexity of O(log2(log2n)) --> Big 0 of log of (log n base 2 ) base 2
     */
    static void algorithm9(int n){
        int p = 0;
        for (int i = 1; i < n; i*=2) {
            p++; // This will run log n  times
        }

        // p will be log n here
        for (int j = 1; j < p; j*=2) {
            System.out.println(j); //This will run log(log2n)
        }

    }

    /**
     * This algorithm has a time complexity of O(nlog2n) --> Big 0 of nlog2n
     */
    static void algorithm10(int n){
        for (int i = 0; i < n; i++) { //This will run n + 1 times
            for (int j = 1; j < n; j*=2) { //This will run n(log n + 1) times
                System.out.println(j); // This will run n(log n) times
            }
        }
    }


}