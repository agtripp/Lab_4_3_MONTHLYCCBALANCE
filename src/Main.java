public class Main {
    public static void main(String[] args)
    {
        double twotimesBalance = 2760;
        double interest = .17;
        double onemonthInterest =  0;
        double twomonthInterest = 0;

        onemonthInterest = twotimesBalance - (twotimesBalance * interest);
        System.out.println("After one month of interest at 17%, your balance is " + onemonthInterest);

        twomonthInterest = onemonthInterest - (onemonthInterest * interest);
        System.out.println("After two months of interest at 17%, your balance is " + twomonthInterest);

    }
}