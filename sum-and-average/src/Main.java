public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int average;

        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        int i;
        for (i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        average = sum / 5;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}