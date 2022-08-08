package obiektowe.functionalProgramming;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My App!");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setLocation(1000,500);

        JButton button = new JButton("Nacisnij!");
        JPanel panel = new JPanel();
        panel.add(button);

        frame.add(panel);
        JTextField numberField = new JTextField("0",10);

        panel.add(numberField);

        ActionListener action = e -> {
            System.out.println("Click!!");
            int number = Integer.parseInt(numberField.getText());
            number++;
            numberField.setText(number+"");

        };
        button.addActionListener(action);


        JButton lambdaButton = new JButton("Lambda przycisk");
        panel.add(lambdaButton);

        frame.pack();


        lambdaButton.addActionListener(e -> System.out.println("Hello!"));
    }
}
