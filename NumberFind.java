package naman;
public class NumberFind {
    private double number;

    public NumberFind(double number) {
    	super();
        this.number = number;
    }

    public boolean isZero() {
        return number == 0;
    }

    public boolean isPositive() {
        return number > 0;
    }

    public boolean isNegative() {
        return number < 0;
    }

    public boolean isOdd() {
        return number % 2 != 0;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public boolean isPrime() {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public boolean isArmstrong() {
        int temp = (int) number;
        int digits = String.valueOf(temp).length();
        int sum = 0;
        int originalNumber = temp;

        while (temp != 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }
        return originalNumber == sum;
    }

    public static void main(String[] args) {
    	
        NumberFind num = new NumberFind(11);
        System.out.println("Is zero: " + num.isZero());
        System.out.println("Is positive: " + num.isPositive());
        System.out.println("Is negative: " + num.isNegative());
        System.out.println("Is odd: " + num.isOdd());
        System.out.println("Is even: " + num.isEven());
        System.out.println("Is prime: " + num.isPrime());
        System.out.println("Is Armstrong: " + num.isArmstrong());
    }
}
