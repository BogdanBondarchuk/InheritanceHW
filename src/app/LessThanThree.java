package app;

class LessThanThree extends Game {
    public LessThanThree(double bet) {
        super(bet);
    }

    @Override
    public double calculateWinnings(int number) {
        if (number < 3) {
            return this.bet * 1.25;
        } else {
            return super.calculateWinnings(number);
        }
    }
}