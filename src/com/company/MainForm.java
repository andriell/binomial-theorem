package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Андрей on 24.01.2016.
 */
public class MainForm {
    private JFrame frame;
    private JPanel panel1;
    private JTextField sizeTextField;
    private JTextField modTextField;
    private JButton repaintButton;
    private JPanel drawPanel;

    private Binom binom;


    private void createUIComponents() {
        binom = new Binom(10, 2);
        DrawPanel drawPanel = new DrawPanel();
        drawPanel.setBinom(binom);
        this.drawPanel = drawPanel;

    }

    public void repaint() {
        binom.setSize(Integer.parseInt(sizeTextField.getText()));
        binom.setMod(Integer.parseInt(modTextField.getText()));
        binom.rebuild();
        frame.repaint();
        int borderH = frame.getHeight() - drawPanel.getHeight();
        int borderV = frame.getWidth() - drawPanel.getWidth();

        System.out.println(borderH);
        System.out.println(borderV);

        frame.setSize(binom.getSize() + borderV, binom.getSize() + borderH);
    }

    public MainForm() {
        frame = new JFrame("Drawing Graphics in Frames");
        System.out.print(panel1);
        frame.setContentPane(panel1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        repaintButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        repaint();
    }
}
