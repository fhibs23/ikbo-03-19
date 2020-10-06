import javax.swing.*;
import java.awt.*;

class Lab extends JFrame {
    public String number(int k) {
    if (k == 2) return "Осталось 2 попытки";
    else if (k == 1) return "Осталaсь 1 попытка";
    else if (k == 0) return "Осталось 0 попыток";
    else return "";
}
    JTextField text = new JTextField(10);
    JButton bt = new JButton(" Угадайте число от 0 до 20");

    private final int result = (int)(1+Math.random()*20);
    private int k = 0;

    Lab() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(300,200);
        add(text);
        add(bt);
        bt.addActionListener(ae -> {
            if (k < 3) {
                try {
                    k++;
                    int inp = Integer.parseInt(text.getText().trim());
                    if (inp == result)
                        JOptionPane.showMessageDialog(null, "Вы угадали!", number(3 - k), JOptionPane.INFORMATION_MESSAGE);
                    else if (inp > result)
                        JOptionPane.showMessageDialog(null, "Загаданное число меньше.", number(3 - k),JOptionPane.INFORMATION_MESSAGE);
                    else JOptionPane.showMessageDialog(null, "Загаданное число больше.", number(3 - k),JOptionPane.INFORMATION_MESSAGE);
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Error!","alert" , JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, String.format("Попытки закончились.\nЗагаданное число - %d", result),"Alert",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        setVisible(true);
    }



    public static void main(String[]args) {
        new Lab();
    }
}