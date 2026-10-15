// Case Study 9: form with validation
import javax.swing.*;
import java.awt.*;

class RegisterForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Registration");
        f.setLayout(new FlowLayout());

        JTextField name = new JTextField(14);
        JComboBox<String> branch =
            new JComboBox<>(new String[] { "CSE", "IT", "ECE" });
        JRadioButton male = new JRadioButton("Male", true);
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);
        JButton submit = new JButton("Submit");
        JLabel output = new JLabel(" ");

        f.add(new JLabel("Name"));
        f.add(name);
        f.add(new JLabel("Branch"));
        f.add(branch);
        f.add(male);
        f.add(female);
        f.add(submit);
        f.add(output);

        submit.addActionListener(e -> {
            if (name.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(f, "Name cannot be empty");
            } else {
                output.setText(name.getText() + " | " + branch.getSelectedItem()
                    + " | " + (male.isSelected() ? "Male" : "Female"));
            }
        });

        f.setSize(300, 220);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
