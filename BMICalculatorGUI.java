import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculatorGUI {

    public static void main(String[] args) {
        // Call the method to create and show the GUI
        createAndShowGUI();
    }

    private static void createAndShowGUI() {
        // Create the window using JFrame
        JFrame frame = new JFrame("BMI Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null); // We use null layout for simplicity, but it's not recommended for real applications

        // Create and set up the height label and text field
        JLabel heightLabel = new JLabel("Height (m):");
        heightLabel.setBounds(10, 20, 80, 25);
        final JTextField heightText = new JTextField();
        heightText.setBounds(100, 20, 165, 25);

        // Create and set up the weight label and text field
        JLabel weightLabel = new JLabel("Weight (kg):");
        weightLabel.setBounds(10, 50, 80, 25);
        final JTextField weightText = new JTextField();
        weightText.setBounds(100, 50, 165, 25);

        // Create the button to calculate BMI
        JButton calculateButton = new JButton("Calculate BMI");
        calculateButton.setBounds(10, 80, 150, 25);

        // Create the label to display the result
        final JLabel resultLabel = new JLabel("Your BMI: ");
        resultLabel.setBounds(10, 110, 250, 25);

        // Add components to the frame
        frame.add(heightLabel);
        frame.add(heightText);
        frame.add(weightLabel);
        frame.add(weightText);
        frame.add(calculateButton);
        frame.add(resultLabel);

        // Add an action listener to the button for calculating BMI
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Try to read the user input, calculate BMI, and display the result
                try {
                    double height = Double.parseDouble(heightText.getText());
                    double weight = Double.parseDouble(weightText.getText());
                    double bmi = calculateBMI(height, weight);
                    resultLabel.setText("Your BMI: " + String.format("%.2f", bmi));
                } catch (NumberFormatException ex) {
                    // If the input is not a valid number, display an error message
                    resultLabel.setText("Please enter valid numbers.");
                }
            }
        });

        // Make the window visible
        frame.setVisible(true);
    }

    // The method to calculate BMI, kept simple and separate
    private static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }
}
