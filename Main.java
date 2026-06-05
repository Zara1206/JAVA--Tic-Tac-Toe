import java.awt.*;
import javax.swing.*;

public class Main {

    static boolean xturn = true;
    static JButton[] buttons = new JButton[9];
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(3, 3));

    for (int i = 0; i < 9; i++) {

        JButton btn = new JButton("");
        buttons[i] = btn;
        
        btn.setFont(new Font("Arial", Font.BOLD, 40));

        btn.addActionListener(e -> {
           if(!btn.getText().equals("")) {
               return;
              }

            btn.setText(xturn ? "X" : "O");

                if (checkWin()) {
                    JOptionPane.showMessageDialog(frame,
                            (xturn ? "X" : "O") + " wins!");
                    resetBoard();
                    return;
                }

                xturn = !xturn;
            });

        panel.add(btn);
    }
    frame.add(panel);
    frame.setVisible(true);
    }

    static boolean checkWin() {

        int[][] winPatterns = {
                {0,1,2},{3,4,5},{6,7,8},
                {0,3,6},{1,4,7},{2,5,8},
                {0,4,8},{2,4,6}
        };

        for (int[] p : winPatterns) {
            String a = buttons[p[0]].getText();
            String b = buttons[p[1]].getText();
            String c = buttons[p[2]].getText();

            if (!a.equals("") && a.equals(b) && b.equals(c)) {
                return true;
            }
        }

        return false;
    }

    static void resetBoard() {
        for (JButton btn : buttons) {
            btn.setText("");
        }
        xturn = true;
    }
}