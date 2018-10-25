import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*double base = in.nextDouble();
        long exp = in.nextInt();

        long startTime = System.nanoTime();
        double result = powerIteration(base,exp);
        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("PowerIteration spent " + totalTime + " nanoseconds and the result is " + result);

        startTime = System.nanoTime();
        result = powerRootRecursive(base,(int)exp);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("PowerRootRecursive spent " + totalTime + " nanoseconds and the result is " + result);
        */

        /*int[] array = new int[7];
        for(int i = 0;i < 7;i++)
            array[i] = in.nextInt();
        in.nextLine();
        System.out.println("The max number in the array is " + vecMax(array));
        */

        int base = in.nextInt();
        int times = in.nextInt();
        in.nextLine();
        System.out.println(multiPRecursive(base,times));
        in.close();
    }

    private static double powerIteration(double base, long exp){
        double accumulator = 1;
                for(;exp > 0; exp--)
                    accumulator = accumulator * base;
        return accumulator;
    }

    private static double powerRootRecursive(double base, int exp) {
            if (exp == 0)
                return 1;
            else if (exp % 2 == 0)
                    return powerRootRecursive(base * base,exp/2);
                else
                    return powerRootRecursive(base * base, exp / 2) * base;

    }

    private static int vecMax(int[] array){
        return vecMaxRec(array,array.length);
    }

    private static int vecMaxRec(int[] array, int length) {
        if(length == 1)
            return array[0];
        else
            return Math.max(array[length-1],vecMaxRec(array,length-1));
    }

    private static  int multiPRecursive(int base, int times){
        if(base == 0 || times == 0)
            return 0;
        else if(Math.abs(base) > Math.abs(times))
            return multiplyR(base,times);
        else
            return multiplyR(times,base);
    }

    private static int multiplyR(int max, int min) {
        if(min == 1)
            return max;
        else if(min > 0)
            return max + multiplyR(max, min-1);
        else if(max > 0)
            return max + multiplyR(max, min+1);
        else
            return multiplyR(-max,-min);
    }
}
