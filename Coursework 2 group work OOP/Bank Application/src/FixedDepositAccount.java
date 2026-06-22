public class FixedDepositAccount extends Account {

    @Override
    public double minimumDeposit() {
        return 1000000;
    }

}
