// Try This 1: add a Clear button and hostel checkbox to the registration form
import javax.swing.*;
import java.awt.*;

class CaseStudy9_TryThis1 {
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
        JCheckBox hostel = new JCheckBox("Hostel required");
        JButton submit = new JButton("Submit");
        JButton clear = new JButton("Clear");
        JLabel output = new JLabel(" ");

        f.add(new JLabel("Name"));
        f.add(name);
        f.add(new JLabel("Branch"));
        f.add(branch);
        f.add(male);
        f.add(female);
        f.add(hostel);
        f.add(submit);
        f.add(clear);
        f.add(output);

        submit.addActionListener(e -> {
            if (name.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(f, "Name cannot be empty");
            } else {
                output.setText(name.getText() + " | " + branch.getSelectedItem()
                    + " | " + (male.isSelected() ? "Male" : "Female")
                    + " | Hostel: " + (hostel.isSelected() ? "Yes" : "No"));
            }
        });

        clear.addActionListener(e -> {
            name.setText("");
            branch.setSelectedIndex(0);
            male.setSelected(true);
            hostel.setSelected(false);
            output.setText(" ");
        });

        f.setSize(360, 260);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
