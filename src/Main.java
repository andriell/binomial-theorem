import com.company.Binom;
import com.company.DrawPanel;
import com.company.MainForm;

import javax.swing.*;
/**
 * Created by Андрей on 22.01.2016.
 *      0 1 2 3 j
 * 0    1
 * 1    1 1
 * 2    1 2 1
 * 3    1 3 3 1
 * i
 */
public class Main {
    public static void main(String[] args) {
        //Main main = new Main();
        //JFrame f = new JFrame();
        new MainForm();
    }

    public Main() {
        int size = 900;
        Binom binom = new Binom(size, 2);
        //System.out.print(binom);

        JFrame f = new JFrame();
        f.setTitle("Drawing Graphics in Frames");

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawPanel drawPanel = new DrawPanel();
        drawPanel.setBinom(binom);
        f.getContentPane().add(drawPanel);
        f.setVisible(true);
        int borderH = f.getHeight() - f.getContentPane().getHeight();
        int borderV = f.getWidth() - f.getContentPane().getWidth();

        System.out.println(borderH);
        System.out.println(borderV);

        f.setBounds(10, 10, size + borderV, size + borderH );
    }




}
