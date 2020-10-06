package ru.mirea.Lab5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test extends JPanel{

    JFrame jf = new JFrame("Image");
    JPanel jp1 = new JPanel(new BorderLayout());
    WorkPanel wp1 = new WorkPanel();
    JOptionPane jop1 = new JOptionPane();
    BufferedImage bufferedImage = null;

    public Test(String path){
        jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(jp1, BorderLayout.WEST);
        jf.add(wp1, BorderLayout.CENTER);
        jp1.setSize(1200, 1000);
        try {
            File file = new File(path);
            bufferedImage = ImageIO.read(file);
            wp1.setImage(bufferedImage);
            wp1.repaint();
        } catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(jop1, "Такого файла не существует");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(jop1, "Исключение ввода-вывода");
        }
    }

    public static void main(String[] args) {
        new Test(args[0]);
    }
}