import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setSize(1200, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
