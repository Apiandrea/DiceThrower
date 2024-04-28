import javax.swing.*;
import java.awt.*;

public class View extends JFrame{
    private JTextArea history;
    private JPanel southPanel;
    private JSplitPane southDivider;
    private JPanel buttonsPanel;
    private JPanel historyPanel;
    private JPanel northPanel;
    private JPanel rootPanel;
    private JButton resetButton;
    private JButton throwButton;
    private JPanel resetBtnPanel;
    private JPanel throwBtnPanel;
    private JPanel resultPanel;
    private JPanel detailsPanel;
    private JLabel resultLabel;
    private JLabel textOddLabel;
    private JLabel valueOddLabel;
    private JLabel textEvenLabel;
    private JLabel valueEvenLabel;

    public View()
    {
        defaultSettings("DiceThrower - Apiandrea");

        Font fontResult = new Font(Font.SERIF , Font.BOLD, 50);
        resultLabel.setFont(fontResult);

        Font fontDetails = new Font(Font.SERIF, Font.BOLD, 20);
        textOddLabel.setFont(fontDetails);
        textEvenLabel.setFont(fontDetails);
        valueOddLabel.setFont(fontDetails);
        valueEvenLabel.setFont(fontDetails);

        resetButton.setFont(fontDetails);
        throwButton.setFont(fontDetails);

    }

    public void defaultSettings(String title)
    {
        setContentPane(rootPanel);
        setLocationRelativeTo(null);
        setSize(450, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(title);
        setResizable(false);

        setVisible(true);
    }

    public JButton getBtnThrow()
    {
        return throwButton;
    }

    public JButton getBtnReset()
    {
        return resetButton;
    }
}