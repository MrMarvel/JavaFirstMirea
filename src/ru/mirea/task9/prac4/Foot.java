package ru.mirea.task9.prac4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Foot extends JFrame {
    private JPanel rootPanel;
    private JLabel resultLabel;
    private JLabel lastLabel;
    private JLabel winnerLabel;
    private JButton team1Button;
    private JButton team2Button;

    private int milan = 0;
    private int madrid = 0;
    private int last = 0;

    public Foot() {

        setContentPane(rootPanel);
        setSize(500, 500);
        changeInformation();
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        team1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milan++;
                last = 1;
                changeInformation();
            }
        });
        team2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madrid++;
                last = 2;
                changeInformation();
            }
        });
    }

    private void changeInformation() {
        resultLabel.setText(String.format("Result: %d X %d", milan, madrid));
        lastLabel.setText(String.format("Last scorer: %s", last == 1 ? "Милан" : last == 2 ? "Мадрид" : "N/A"));
        int dif = milan - madrid;
        winnerLabel.setText(String.format("Winner: %s", dif > 0 ? "Милан" : dif < 0 ? "Мадрид" : "DRAW"));
    }

    public static void run(String[] args) {
        new Foot();
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(6, 2, new Insets(0, 0, 0, 0), -1, -1));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel1.putClientProperty("html.disable", Boolean.FALSE);
        rootPanel.add(panel1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 6, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_SOUTH, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        team1Button = new JButton();
        team1Button.setText("Команда Милан");
        panel1.add(team1Button, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        team2Button = new JButton();
        team2Button.setText("Команда Мадрид");
        panel1.add(team2Button, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        resultLabel = new JLabel();
        resultLabel.setText("Label");
        rootPanel.add(resultLabel, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lastLabel = new JLabel();
        lastLabel.setText("Label");
        rootPanel.add(lastLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        winnerLabel = new JLabel();
        winnerLabel.setText("Label");
        rootPanel.add(winnerLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}
