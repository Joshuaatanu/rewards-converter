public class RewardValue {
    private final double cashValue;
    public static final double milesToCashConversionRate= 0.0035;
    public RewardValue( double cashValue){
        this.cashValue= cashValue;
    }

    public RewardValue(int milesValue){
        this.cashValue = convertToMiles(milesValue);
    }
    public static int convertToMiles(double cashValue){
        return (int) ((cashValue)/ milesToCashConversionRate);
    } //convert to miles method
    public static double convertToCash(int milesValue){
        return milesValue * milesToCashConversionRate;
    }
    public  double getCashValue(){
        return cashValue;
    }
    public int getMilesValue(){
        return  convertToMiles(this.cashValue);
    }
}
