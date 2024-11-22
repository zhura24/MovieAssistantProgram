import javax.swing.*;
import java.util.Stack;

public class AsistenMenu extends JPanel {
    private Stack<String> menuStack;

    public AsistenMenu() {
        menuStack = new Stack<>();
        JButton sapaButton = new JButton("Sapa Neng Geulis");
        JButton modeAsistenButton = new JButton("Mode Asisten");

        sapaButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Aku udah punya pacar jangan ganggu aku"));
        modeAsistenButton.addActionListener(e -> showAssistantMenu());

        add(sapaButton);
        add(modeAsistenButton);
    }

    private void showAssistantMenu() {
        menuStack.push("Mode Asisten");
        String[] options = {"Tambah Watchlist", "Tambah yang Sudah Ditonton", "Lihat Watchlist", "Lihat Yang Sudah Ditonton", "Rekomendasi Film", "Gak Jadi"};
        int choice = JOptionPane.showOptionDialog(this, "Mau Apa Tuan?:", "Mode Asisten",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        switch (choice) {
            case 0 -> Watchlist.addMovie();
            case 1 -> addWatchedMovieOption();
            case 2 -> Watchlist.showWatchlist();
            case 3 -> MovieQueue.showWatchedMovies();
            case 4 -> MovieRecommendation.showRecommendations();
            case 5 -> goBackToPreviousMenu();
        }
    }

    private void addWatchedMovieOption() {
        String movie = JOptionPane.showInputDialog("Masukkan judul film yang sudah ditonton:");
        if (movie != null && !movie.isEmpty()) {
            MovieQueue.addWatchedMovie(movie);
        } else {
            JOptionPane.showMessageDialog(this, "Film tidak valid.");
        }
    }

    private void goBackToPreviousMenu() {
        if (!menuStack.isEmpty()) {
            menuStack.pop();  //

            JOptionPane.showMessageDialog(this, "SEMUA COWOK SAMA AJA.");
        } else {
            JOptionPane.showMessageDialog(this, "Tidak ada menu sebelumnya.");
        }
    }
}
