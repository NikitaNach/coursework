import javax.swing.*;
import java.awt.*;

public class SpecimensPanel extends JPanel {
    public SpecimensPanel() {
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel actionPanel = new JPanel();
        JPanel listPanel = new JPanel();
        JButton addButton = new JButton("Добавить образец");
        JButton delButton = new JButton("Удалить образец");
        JPanel leftActionPanel = new JPanel();
        JPanel rightActionPanel = new JPanel();
        JTextField searchTextField = new JTextField("Поиск образцов", 10);
        JButton searchButton = new JButton("Поиск");



//        Заполнение экшн панели
        leftActionPanel.add(addButton, BorderLayout.WEST);
        leftActionPanel.add(delButton, BorderLayout.EAST);
        rightActionPanel.add(searchTextField, BorderLayout.WEST);
        rightActionPanel.add(searchButton, BorderLayout.EAST);
        actionPanel.add(leftActionPanel, BorderLayout.WEST);
        actionPanel.add(rightActionPanel, BorderLayout.EAST);



        mainPanel.add(actionPanel, BorderLayout.NORTH);
        mainPanel.add(listPanel, BorderLayout.CENTER);
        add(mainPanel);
    }
}
