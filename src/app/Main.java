package app;

public class Main {
    public static void main(String[] args) {
        double betAmount = 100;

        Game game1 = new LessThanThree(betAmount);
        Game game2 = new ThreeToSeven(betAmount);
        Game game3 = new MoreThanSeven(betAmount);

        // Let's explain the number that came up is 5
        int number = 5;

        if (number < 3) {
            System.out.println("Less than 3: " + game1.calculateWinnings(number));
        } else if (number >= 3 && number <= 7) {
            System.out.println("3 to 7: " + game2.calculateWinnings(number));
        } else {
            System.out.println("More than 7: " + game3.calculateWinnings(number));
        }
    }
}
