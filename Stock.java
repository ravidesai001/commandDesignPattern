public class Stock {
    // request class - defining a stock and buy/sell methods

    private String name = "TSLA";
    private int quantity = 10;

    public void buy(){
        System.out.println(
            "You bought " + quantity + " stocks of " + name);
    }

    public void sell(){
        System.out.println(
            "You sold " + quantity + " stocks of " + name);
    }

}