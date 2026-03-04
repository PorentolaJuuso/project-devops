package tictactoe;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;

public class Menu extends JPanel {
    public Menu() {
        initialize();
    }

    private void initialize() {
        setLayout(new BoxLayout(BoxLayout.Y_AXIS, 10, 5));
        JLabel titleLabel = new JLabel("Tic-Tac-Toe");
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);


        JButton startButton = new JButton("Start");
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        startButton.addActionListener(ActionEvent e) {
        }

        JButton quitButton = new JButton("Quit");
        quitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        quitButton.addActionListener(ActionEvent e) {

        }

        add(titleLabel);
        add(startButton);
        add(quitButton);
    }
}