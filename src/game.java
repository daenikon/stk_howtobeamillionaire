import javax.swing.*;

class game {
    public static void main (String[] args) {
        JFrame screen = new JFrame();

        JButton button = new JButton("test");
        button.setBounds(0, 0, 100, 40);
        screen.add(button);

        screen.setSize(500, 500);
        screen.setLayout(null);
        screen.setVisible(true);
    }
}
