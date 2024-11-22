import javax.swing.*;

public class MovieRecommendation {
    private static String[] popularMovies = {
            "Deadpool 3",
            "Joker: Folie à Deux",
            "Godzilla x Kong: The New Empire",
            "Kung Fu Panda 4",
            "A Quiet Place: Day One",
            "Inside Out 2",
            "Mufasa: The Lion King",
            "Gladiator 2",
            "Venom 3",
            "Beetlejuice 2",
            "Pengabdi Setan 2"

    };
    public static void showRecommendations() {
        JOptionPane.showMessageDialog(null, "Rekomendasi Film 2024:\n" + String.join("\n", popularMovies));
    }
}
