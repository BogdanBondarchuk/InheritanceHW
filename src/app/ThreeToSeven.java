package app;

class ThreeToSeven extends Game {
    public ThreeToSeven(double bet) {
        super(bet);
    }

    @Override
    public double calculateWinnings(int number) {
        if (number >= 3 && number <= 7) {
            return this.bet * 1.25 - (this.bet * 0.05);
        } else {
            return super.calculateWinnings(number);
        }
    }
}