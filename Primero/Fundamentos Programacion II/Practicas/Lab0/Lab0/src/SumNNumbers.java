
public class SumNNumbers {

    static int sum1(int n) {
        int sum = 0, i;
        for (i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    static int sum2(int i) {

        int sum = 0;

        sum = i*(i+1)/2;

        return sum;
    }

    public static void main(String[] args){
        int[] array = {3,4,13,21,67,102,155,365,1007};
        for(int i=0; i<array.length;i++)
        {
            int output = sum1(array[i]);
            int output2 = sum2(array[i]);
            boolean isEqual = output == output2;

            System.out.println("Are both equal? "+isEqual);
        }


    }

}