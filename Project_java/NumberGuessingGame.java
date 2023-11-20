import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NumberGuessingGame extends JFrame {
    private int number;
    private int nGuesses;
    private JTextField guessField;
    private JTextArea resultArea;
    private JButton guessButton;
    private JLabel lastGuessLabel;

    public NumberGuessingGame() {
        super("Number Guessing Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 370);
        setLocationRelativeTo(null);

        number = new Random().nextInt(100) + 1;
        nGuesses = 0;

        JLabel label = new JLabel("Guess the number between 1 to 100:");
        guessField = new JTextField(10);
        guessButton = new JButton("Guess");
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        lastGuessLabel = new JLabel("Last Guessed: ");

        Font font = new Font("Arial", Font.PLAIN, 20);
        Color backgroundColor = new Color(151, 219, 169);

        label.setFont(font);
        label.setForeground(Color.BLUE);

        guessField.setFont(font);
        guessField.setBackground(backgroundColor);

        guessButton.setFont(font);
        guessButton.setBackground(Color.CYAN);
        guessButton.setForeground(Color.BLACK);

        resultArea.setFont(font);
        resultArea.setBackground(backgroundColor);

        lastGuessLabel.setFont(font);

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });

        JPanel panel = new JPanel(new GridLayout(5, 1, 5, 5));
        panel.setBackground(backgroundColor);
        panel.add(label);
        panel.add(guessField);
        panel.add(guessButton);
        panel.add(lastGuessLabel);

        add(panel, BorderLayout.NORTH);
        add(resultArea, BorderLayout.CENTER);
    }

    private void checkGuess() {
        try {
            int guess = Integer.parseInt(guessField.getText());
            nGuesses++;

            lastGuessLabel.setText("Last Guessed: " + guess);

            if (guess > number) {
                resultArea.setForeground(new Color(128, 0, 128));
                resultArea.setBackground(Color.ORANGE);
                resultArea.setText("Lower number please!");
            } else if (guess < number) {
                resultArea.setForeground(new Color(222, 53, 87));
                resultArea.setBackground(new Color(212, 186, 191));
                resultArea.setText("Higher number please!");
            } else {
                guessButton.setBackground(Color.GRAY);
                resultArea.setText("You guessed it in " + nGuesses + " attempts");
                guessField.setEnabled(false);
            }

        } catch (NumberFormatException e) {
            resultArea.setText("Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                NumberGuessingGame game = new NumberGuessingGame();
                game.setVisible(true);
            }
        });
    }
}
