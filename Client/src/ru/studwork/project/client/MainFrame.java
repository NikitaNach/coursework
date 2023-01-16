import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() throws HeadlessException {
        super("Курсовая");
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Профиль", new JButton("Профиль"));
        tabbedPane.addTab("Студенты", new JButton("Студенты"));
        tabbedPane.addTab("Бригады", new JButton("Бригады"));
        tabbedPane.addTab("Образцы", new SpecimensPanel());

        setLayout(new BorderLayout());

        add(tabbedPane);



    }

}
