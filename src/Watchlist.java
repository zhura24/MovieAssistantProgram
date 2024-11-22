import javax.swing.*;
import java.util.ArrayList;

public class Watchlist {
    private static ArrayList<String> watchlist = new ArrayList<>();

    public static void addMovie() {
        String movie = JOptionPane.showInputDialog("Masukkan judul film untuk Watchlist:");
        if (movie != null && !movie.isEmpty()) {
            if (watchlist.contains(movie)) {
                JOptionPane.showMessageDialog(null, "Film nya sudah ada tuan");
            } else {
                watchlist.add(movie);
                JOptionPane.showMessageDialog(null, "Film berhasil ditambahkan ke Watchlist.");
            }
        }
    }

    public static void showWatchlist() {
        if (watchlist.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Watchlist masih kosong.");
        } else {
            String watchlistText = "Watchlist:\n" + String.join("\n", watchlist);
            String movieToAdd = (String) JOptionPane.showInputDialog(
                    null,
                    watchlistText + "\nPilih film yang sudah ditonton dan tekan OK.",
                    "Pilih Film untuk Ditonton",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    watchlist.toArray(),
                    watchlist.get(0));

            if (movieToAdd != null && !movieToAdd.isEmpty()) {
                int response = JOptionPane.showConfirmDialog(
                        null,
                        "Apakah kamu sudah menonton film " + movieToAdd + "?",
                        "Konfirmasi",
                        JOptionPane.YES_NO_OPTION);

                if (response == JOptionPane.YES_OPTION) {
                    watchlist.remove(movieToAdd);
                    MovieQueue.addWatchedMovie(movieToAdd);  // Memindahkan film ke MovieQueue
                    JOptionPane.showMessageDialog(null, movieToAdd + " berhasil dipindahkan ke daftar yang sudah ditonton.");
                }
            }
        }
    }
}
