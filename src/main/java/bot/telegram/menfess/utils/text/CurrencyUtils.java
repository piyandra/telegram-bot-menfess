package bot.telegram.menfess.utils.text;

public class CurrencyUtils {

    public static String convertToCurrency(long amount) {
        return String.format("Rp %,d", amount).replace(',', '.');
    }
}
