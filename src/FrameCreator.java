import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.io.IOException;

public class FrameCreator implements ActionListener {
    JFrame frame = new JFrame("FC Timer");
    JLabel dungeonAkr = new JLabel("Данж Акры");
    JButton b1 = new JButton("В откате");
    JButton b2 = new JButton("Refresh");

    public void buttonProperties() {
        b1.setBounds(35, 50, 150, 30);
        b1.addActionListener(this);
        b1.setFocusPainted(false);
        b1.setBackground(Color.GREEN);
        b1.setForeground(Color.BLACK);
        frame.add(b1);

        b2.setBounds(35, 750, 150, 30);
        b2.setFocusPainted(false);
        b2.setBackground(Color.ORANGE);
        b2.setForeground(Color.BLACK);
        frame.add(b2);
    }

    public void mainGui() {
        WindowListener winListener = new EventListener();
        frame.addWindowListener(winListener);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(235, 830));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(dungeonAkr);
        dungeonAkr.setBounds(75, 27, 100, 20);
        frame.pack();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            new TimeMath().timeMath();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.RED);
        b1.setText(TimeMath.rollbackStr);

    }
    FrameCreator() {
        mainGui();
        buttonProperties();
    }
}
