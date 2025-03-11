package bot.telegram.menfess.utils.text;

public class ConvertDateUtils {

    public static String convertToMinutesAndSecond(long timeMillis) {
        long limitEndsWith = timeMillis - System.currentTimeMillis();

        long minutes = (limitEndsWith / 1000) / 60;
        long seconds = (limitEndsWith / 1000) % 60;
        return "Anda Dapat Mengirim Pesan Lagi Dalam " + minutes + " Menit " + seconds + " Detik";
    }
}
