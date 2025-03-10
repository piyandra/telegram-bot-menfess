package bot.telegram.menfess.utils.text;


public class TextUtils {

    public static String welcomMessage = """
            Welcome to Menfess Bot!
            Sebuah bot untuk mengirim pesan kepada base menfess.
            
            Untuk mendafaftar sebagai pengguna, tekan tombol dibawah ini.""";

    public static String alreadyRegistered = "Anda sudah terdaftar sebagai pengguna, silahkan menggunakan bot ini.";

    public static String registerSuccess = "Anda berhasil terdaftar sebagai pengguna, silahkan menggunakan bot ini.";

    public static String errorRegistered = "Ada yang salah, silahkan hubungi Admin untuk bantuan.";

    public static String account = "Selamat datang di bot menfess, detail user anda adalah :";

    public static String help = """
            ☐ Cara daftar member fwbess melalui trakteer \s
            ├ 1. Kirim /start untuk daftar akun dan Informasi Saldo anda \s
            ├ 2. Membayar nominal berapapun untuk mendaftar Premium\s
            ├ 3. Kirim /send {pesan anda} untuk mengirim pesan ke base menfess \s
            └ 4. Kirim /topup {kode transaksi} untuk top up saldo anda \s
            └ 4. Benefit free hanya diberikan sebanyak 3 kali send \s
            └ 4. Benefit Premium sesuai jumlah top up saldo anda \s
            └ Note: jika sudah daftar member bot fwbess, tidak perlu daftar lagi.
            """;

    public static String helpSendMenfess = "Gunakan command /send lalu diikuti dengan pesan yang anda kirim";

    public static String topUpSuccess = "Top up berhasil. Saldo anda bertambah :";

    public static String topUpFailed = "Top up gagal. Kode transaksi tidak ditemukan, Silahkan coba lagi";

    public static String helpTopUp = "Gunakan command /topup lalu diikuti dengan kode transaksi top up anda";

    public static String helpDeleteMessage = """
            Gunakan /delete untuk pesan yang ingin dihapus, ini akan menghapus limit anda \s
            dan mengurangi saldo anda sebesar 1000 \s
            """;
}
