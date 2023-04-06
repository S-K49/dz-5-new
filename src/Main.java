public class Main {
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int c = 5;
        int d = 7;

        int sum1 = a+b;
        int sum2 = c+d;

        if(sum1>sum2) {
            System.out.println(true + ": " + sum1 + " is bigger than " + sum2);
        } else {
            System.out.println(false + ": " + sum1 + " is not bigger than " + sum2 + " . Or Some other result.");
        }

        int sum3 = ++sum1;
        int sum4 = sum2-2;

        if(sum3>sum4) {
            System.out.println(true + ": " + sum3 + " is bigger than " + sum4);
        } else {
            System.out.println(false + ": " + sum3 + " is not bigger than " + sum4 + " . Or Some other result.");
        }

        boolean sum5 = sum1%2 == 0 || sum2%2 == 0 || sum3%2 == 0 || sum4%2 == 0;

       if(sum5) {
            System.out.println(true + ": " + sum1%2 + " or " + sum2%2 + " or " + sum3%2 + " or " + sum4%2 + " %2");
        } else {
            System.out.println(false + ": " + sum1%2 + " or " + sum2%2 + " or " + sum3%2 + " or " + sum4%2 + " not %2");
        }


        // What I also found with chat Gpt

        int e = 1;
        int f = 2;
        int g = 3;
        int i = 4;

        int sum6 = e + f;
        int sum7 = g + i;

        boolean isSum1Greater = sum6 > sum7;
        System.out.println("Is first sum greater? " + isSum1Greater);

        sum6++;
        sum7 -= 2;

        boolean isSum2Greater = sum6 > sum7;
        System.out.println("Is sum1 greater? " + isSum2Greater);
    }
}

