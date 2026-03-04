package tictactoe;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;


public final class MyWindow extends JFrame {

    public static final int WINDOW_WIDTH = 450;
    public static final int WINDOW_HEIGHT = 400;

    private boolean isXTurn = true;
    private JButton[] buttons = new JButton[9];

    public MyWindow() {
        super("Professional Tic-Tac-Toe");
        setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Arial", Font.BOLD, 55));
            buttons[i].setBackground(Color.DARK_GRAY);
            buttons[i].setForeground(Color.WHITE);

            final int index =i;
            button.addActionListener(e -> {
                if (buttons[index].getText().equals("")) {
                    buttons[index].setText(isXTurn ? "X" : "O");
                    isXTurn = !isXTurn;
                }
            });

            add(buttons[i]);
        }
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}