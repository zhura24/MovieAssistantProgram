import javax.swing.*;
import java.awt.*;

public class AvatarPanel extends JPanel {
    public AvatarPanel() {
        setLayout(null);

        JLabel background = new JLabel(new ImageIcon(getClass().getResource("/background.jpg")));
        background.setBounds(0, 0, 800, 600);

        ImageIcon avatarIcon = new ImageIcon(getClass().getResource("/avatar.png"));
        Image avatarImage = avatarIcon.getImage().getScaledInstance(100, 200, Image.SCALE_SMOOTH);
        JLabel avatar = new JLabel(new ImageIcon(avatarImage));
        avatar.setBounds(300, 250, 100, 200);

        add(avatar);
        add(background);
    }
}
