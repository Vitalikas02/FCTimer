import org.json.simple.parser.ParseException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class FrameCreator {
    JFrame frame = new JFrame("Test");
    JPanel gridD = new JPanel(new GridLayout(10, 1, 20, 20) );
    JPanel gridQ1 = new JPanel(new GridLayout(10, 1, 20, 20) );
    JPanel gridQ2 = new JPanel(new GridLayout(10, 1, 20, 20) );
    JPanel flow = new JPanel(new FlowLayout(FlowLayout.LEFT));
    JButton butD1 = new JButton("Данж акры");
    JButton butD2 = new JButton("Секретка");
    JButton butD3 = new JButton("Карьер");
    JButton butD4 = new JButton("Данж бт");
    JButton butD5 = new JButton("Форт Хаген");
    JButton butD6 = new JButton("Гараж");
    JButton butD7 = new JButton("dungeon");
    JButton butD8 = new JButton("dungeon");
    JButton butD9 = new JButton("dungeon");
    JButton butD10 = new JButton("dungeon");


    JButton butQ1 = new JButton("quest");
    JButton butQ2 = new JButton("quest");
    JButton butQ3 = new JButton("quest");
    JButton butQ4 = new JButton("quest");
    JButton butQ5 = new JButton("quest");
    JButton butQ6 = new JButton("quest");
    JButton butQ7 = new JButton("quest");
    JButton butQ8 = new JButton("quest");
    JButton butQ9 = new JButton("quest");
    JButton butQ10 = new JButton("quest");
    JButton butQ11 = new JButton("quest");
    JButton butQ12 = new JButton("quest");
    JButton butQ13 = new JButton("quest");
    JButton butQ14 = new JButton("quest");
    JButton butQ15 = new JButton("quest");
    JButton butQ16 = new JButton("quest");
    JButton butQ17 = new JButton("quest");
    JButton butQ18 = new JButton("quest");
    JButton butQ19 = new JButton("quest");
    JButton butQ20 = new JButton("quest");


    Container container = frame.getContentPane();
    void frameCreator(){
        frame.setSize(new Dimension(1024, 768));
        frame.setMinimumSize(new Dimension(1024, 768));
        frame.setMaximumSize(new Dimension(1024, 768));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        butD1.setFocusPainted(false);
        butD2.setFocusPainted(false);
        butD3.setFocusPainted(false);
        butD4.setFocusPainted(false);
        butD5.setFocusPainted(false);
        butD6.setFocusPainted(false);
        butD7.setFocusPainted(false);
        butD8.setFocusPainted(false);
        butD9.setFocusPainted(false);
        butD10.setFocusPainted(false);

        butQ1.setFocusPainted(false);
        butQ2.setFocusPainted(false);
        butQ3.setFocusPainted(false);
        butQ4.setFocusPainted(false);
        butQ5.setFocusPainted(false);
        butQ6.setFocusPainted(false);
        butQ7.setFocusPainted(false);
        butQ8.setFocusPainted(false);
        butQ9.setFocusPainted(false);
        butQ10.setFocusPainted(false);

        butQ11.setFocusPainted(false);
        butQ12.setFocusPainted(false);
        butQ13.setFocusPainted(false);
        butQ14.setFocusPainted(false);
        butQ15.setFocusPainted(false);
        butQ16.setFocusPainted(false);
        butQ17.setFocusPainted(false);
        butQ18.setFocusPainted(false);
        butQ19.setFocusPainted(false);
        butQ20.setFocusPainted(false);

        gridD.add(butD1);
        gridD.add(butD2);
        gridD.add(butD3);
        gridD.add(butD4);
        gridD.add(butD5);
        gridD.add(butD6);
        gridD.add(butD7);
        gridD.add(butD8);
        gridD.add(butD9);
        gridD.add(butD10);

        gridQ1.add(butQ1);
        gridQ1.add(butQ2);
        gridQ1.add(butQ3);
        gridQ1.add(butQ4);
        gridQ1.add(butQ5);
        gridQ1.add(butQ6);
        gridQ1.add(butQ7);
        gridQ1.add(butQ8);
        gridQ1.add(butQ9);
        gridQ1.add(butQ10);

        gridQ2.add(butQ11);
        gridQ2.add(butQ12);
        gridQ2.add(butQ13);
        gridQ2.add(butQ14);
        gridQ2.add(butQ15);
        gridQ2.add(butQ16);
        gridQ2.add(butQ17);
        gridQ2.add(butQ18);
        gridQ2.add(butQ19);
        gridQ2.add(butQ20);

        butD1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new JsonReader().jsonReader();
                } catch (IOException | ParseException e) {
                    throw new RuntimeException(e);
                }

                JsonReader.setDungeonMassiveNumber(0);
                JOptionPane.showMessageDialog(
                        butD1, "test1");
            }
        });

        butD2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new JsonReader().jsonReader();
                } catch (IOException | ParseException e) {
                    throw new RuntimeException(e);
                }
                JsonReader.setDungeonMassiveNumber(1);
                JOptionPane.showMessageDialog(
                        butD2, "test2");
            }
        });

        butD3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new JsonReader().jsonReader();
                } catch (IOException | ParseException e) {
                    throw new RuntimeException(e);
                }
                JsonReader.setDungeonMassiveNumber(2);
                JOptionPane.showMessageDialog(
                        butD3, "test3");
            }
        });

        frame.setVisible(true);
        flow.add(gridD);
        flow.add(gridQ1);
        flow.add(gridQ2);
        container.add(flow, BorderLayout.WEST);

    }
}





//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowListener;
//import java.io.IOException;
//
//public class FrameCreator implements ActionListener {
//    JFrame frame = new JFrame("FC Timer");
//    JLabel dungeonAkr = new JLabel("Данж Акры");
//    JButton b1 = new JButton("В откате");
//    JButton b2 = new JButton("Refresh");
//
//    public void buttonProperties() {
//        b1.setBounds(35, 50, 150, 30);
//        b1.addActionListener(this);
//        b1.setFocusPainted(false);
//        b1.setBackground(Color.GREEN);
//        b1.setForeground(Color.BLACK);
//        frame.add(b1);
//
//        b2.setBounds(35, 750, 150, 30);
//        b2.setFocusPainted(false);
//        b2.setBackground(Color.ORANGE);
//        b2.setForeground(Color.BLACK);
//        frame.add(b2);
//
//    }
//
//    public void mainGui() {
//        WindowListener winListener = new EventListener();
//        frame.addWindowListener(winListener);
//        frame.setLayout(null);
//        frame.setVisible(true);
//        frame.setMinimumSize(new Dimension(235, 830));
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
//        frame.add(dungeonAkr);
//        dungeonAkr.setBounds(75, 27, 100, 20);
//        frame.pack();
//
//    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        try {
//            new TimeMath().timeMath();
//        } catch (IOException ex) {
//            throw new RuntimeException(ex);
//        }
//        b1.setForeground(Color.BLACK);
//        b1.setBackground(Color.RED);
//        b1.setText(TimeMath.rollbackStr);
//
//    }
//    FrameCreator() {
//        mainGui();
//        buttonProperties();
//    }
//}
