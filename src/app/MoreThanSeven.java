package app;

class MoreThanSeven extends Game {
    public MoreThanSeven(double bet) {
        super(bet);
    }

    @Override
    public double calculateWinnings(int number) {
        if (number > 7) {
            return this.bet * 2 - (this.bet * 0.1);
        } else {
            return super.calculateWinnings(number);
        }
    }
}
