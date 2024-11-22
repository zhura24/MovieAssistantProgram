import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Movie Assistant");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        AvatarPanel avatarPanel = new AvatarPanel();
        add(avatarPanel, BorderLayout.CENTER);

        AsistenMenu menu = new AsistenMenu();
        add(menu, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
