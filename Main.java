import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(3, 3));

    JButton[] buttons = new JButton[9];
    for (int i = 0; i < 9; i++) {
        buttons[i] = new JButton("");
        panel.add(buttons[i]);  
    }

    frame.add(panel);
    frame.setVisible(true);
    }
}