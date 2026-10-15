// Ex 9(a): FlowLayout - a row that wraps
import javax.swing.*;
import java.awt.*;

class FlowDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("FlowLayout");
        f.setLayout(new FlowLayout());
        String[] buttons = { "New", "Open", "Save", "Print", "Exit" };
        for (String s : buttons)
            f.add(new JButton(s));
        f.setSize(300, 120);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
