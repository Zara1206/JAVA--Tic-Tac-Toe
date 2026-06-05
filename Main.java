import java.awt.*;
import javax.swing.*;

public class Main {

    static boolean xturn = true;
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(3, 3));

    JButton[] buttons = new JButton[9];

    for (int i = 0; i < 9; i++) {

        JButton btn = new JButton("");
        buttons[i] = btn;
        
        btn.addActionListener(e -> {
           if(!btn.getText().equals("")) {
               return;
            
              }
            if (xturn) {
                btn.setText("X");
            } else {
                btn.setText("O");
            }
            xturn = !xturn;
        });
        panel.add(btn);
    }
    frame.add(panel);
    frame.setVisible(true);
    }
}