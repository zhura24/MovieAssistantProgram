import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

public class MovieQueue {
    private static Queue<String> watchedMovies = new LinkedList<>();

    public static void addWatchedMovie(String movie) {
        if (movie != null && !movie.isEmpty()) {
            if (watchedMovies.contains(movie)) {
                JOptionPane.showMessageDialog(null, "Film nya sudah ada tuan");
            } else {
                watchedMovies.add(movie);
                JOptionPane.showMessageDialog(null, "Film berhasil ditambahkan ke daftar yang sudah ditonton.");
            }
        }
    }

    public static void showWatchedMovies() {
        if (watchedMovies.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Belum ada film yang ditonton.");
        } else {
            StringBuilder sb = new StringBuilder("Film yang sudah ditonton:\n");
            for (String movie : watchedMovies) {
                sb.append(movie).append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }
}
