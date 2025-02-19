package week4;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by abbyr on 19/02/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
public class ParametrizedTest {
   @ParameterizedTest
   @CsvSource({
         "20, USD",
         "30, EUR",
         "15, CHF"

   })

   void constructShouldSetAmountAndCurrency(int amount, String currency){
      Money money = new Money(amount, currency);
      assertThat(money.getAmount()).isEqualTo(amount);
      assertThat(money.getCurrency()).isEqualTo(currency);
   }

}//class
