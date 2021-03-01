public class Calculation {

    public static void main(String[] args) {
        // write your code here
        int number = 180;
        int firstDigit, secondDigit;
        firstDigit = number / 10;
        secondDigit = number % 10;
        int sum = firstDigit + secondDigit;
        System.out.println(sum);
    }

}