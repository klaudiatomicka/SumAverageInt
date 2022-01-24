public class SumAverageInts {
    public static void main(String[] args) {
        double sum = 0;
        double squaresum = 0;
        final int lowerbound = 1;
        final int upperbound = 100;
        int number = lowerbound;
        int sqnumber = lowerbound;

        //sum of numbers 1-100
        do {
            sum += number;
            number++;
        } while (number <= upperbound);
        System.out.println("Sum of the numbers 1-100: " + sum);


        // sum of the squares of numbers 1-100 (ex. 1*1, 2*2 etc...)
        do {
            squaresum += sqnumber * sqnumber;
            sqnumber++;
        } while (sqnumber <= upperbound);
        System.out.println("Sum of the squares numbers 1-100: " + squaresum);

        // average of numbers 1-100
        sum = sum / upperbound;
        System.out.println("Average of numbers 1-100: " + sum);

        // average of squares of numbers 1-100
        squaresum = squaresum / upperbound;

        System.out.println("Average of squares of numbers 1-100: " + squaresum);

    }

}


