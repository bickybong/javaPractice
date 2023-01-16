class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount that) throws CurrenciesNoMatchExceptions {
        if(!this.currency.equals(that.currency)){
            throw new CurrenciesNoMatchExceptions("Currencies dont match " + this.currency + "&" + that.currency);
//            throw new Exception("Currencies dont match " + this.currency + "&" + that.currency); //custom exception thrown
        }
        this.amount = this.amount + that.amount;
    }

    @Override
    public String toString() {
        return "Amount{" +
                "currency='" + currency + '\'' +
                ", amount=" + amount +
                '}';
    }
}

class CurrenciesNoMatchExceptions extends Exception {
    public CurrenciesNoMatchExceptions(String msg){
        super(msg); //pass to exception
    }
}
public class ThrowingExceptionRunner {
    public static void main(String[] args) throws CurrenciesNoMatchExceptions {
        Amount amount1 = new Amount("USD", 10);
        Amount amount2 = new Amount("EUR", 20);
        amount1.add(amount2);
        System.out.println(amount1);
    }
}
