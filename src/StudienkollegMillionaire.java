import java.awt.*; // swing relies on awt classes
import javax.swing.*;

class StudienkollegMillionaire {
    private JFrame gameFrame;
    private JLabel questionLabel;
    private JButton[] answerButtons;

    public StudienkollegMillionaire() {
        gameFrame = new JFrame("Who wants to be a Millionaire in Studienkolleg?");
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setSize(800, 600);
        gameFrame.setLocationRelativeTo(null); // centers the window (weird AWT method)

        JPanel mainPanel = new JPanel(new BorderLayout());

        questionLabel = new JLabel("What room is AULA located in?", JLabel.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 36));
        mainPanel.add(questionLabel, BorderLayout.NORTH);

        JPanel answersPanel = new JPanel(new GridLayout(2,2,100,100));
        answerButtons = new JButton[4];

        char[] answerLetters = {'A', 'B', 'C', 'D'};
        for (int i = 0; i < 4; i++) {
            answerButtons[i] = new JButton(answerLetters[i] + ": Answer " + (i+1));
            answerButtons[i].setFont(new Font("Arial", Font.BOLD, 24));
            answersPanel.add(answerButtons[i]);
        }

        mainPanel.add(answersPanel, BorderLayout.CENTER);

        gameFrame.add(mainPanel);
        gameFrame.setVisible(true);
    }

    public static void main (String[] args) {
        new StudienkollegMillionaire();
    }
}
