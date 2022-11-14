import java.math.BigDecimal;

public class SimpleInterestCalculator {

  public static void main(String[] args) {
    SimpleInterestCalculator calc = new SimpleInterestCalculator(
      "4500.0",
      "7.5"
    );
    BigDecimal totalValue = calc.calculateTotalValue(5);
    System.out.println(totalValue);
  }

  private BigDecimal principal;
  private BigDecimal interest;

  SimpleInterestCalculator(String principal, String interest) {
    this.principal = new BigDecimal(principal);
    this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
  }

  public BigDecimal calculateTotalValue(int years) {
    // total value = principal + principal * interest * years
    return this.principal.add(
        this.principal.multiply(this.interest).multiply(new BigDecimal(years))
      );
  }
}
