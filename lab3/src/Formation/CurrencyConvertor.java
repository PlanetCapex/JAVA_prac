package Formation;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyConvertor {
    private NumberFormat format = NumberFormat.getCurrencyInstance();
    int price_rel;

    public CurrencyConvertor() {

    }

    public void set_convertor(String currency, int price_rel) {
        this.format.setMaximumFractionDigits(2);
        this.format.setCurrency(Currency.getInstance(currency));
        this.price_rel = price_rel;
    }

    public String convert(double price){
        return format.format(price/this.price_rel);
    }
}
