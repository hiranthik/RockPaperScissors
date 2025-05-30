
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RockPaperScissorsGUI extends JFrame implements ActionListener {
    JLabel computerScore, playerScore;
    JLabel computerChoice, resultLabel;
    JButton rockButton, paperButton, scissorButton;

    RockPaperScissor rockPaperScissor;

    public RockPaperScissorsGUI(){
        setTitle("Rock-Paper-Scissor-Game");
        setSize(450,550);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        rockPaperScissor = new RockPaperScissor();
        addGUIcomponents();

    }


    private void addGUIcomponents(){
        computerScore = new JLabel("Computer: 0");
        computerScore.setBounds(0, 43, 450, 30);
        computerScore.setFont(new Font("Dialog",Font.BOLD,26));
        computerScore.setHorizontalAlignment(SwingConstants.CENTER);
        add(computerScore);

        playerScore = new JLabel("player: 0");
        playerScore.setBounds(0, 317, 450, 30);
        playerScore.setFont(new Font("Dialog",Font.BOLD,26));
        playerScore.setHorizontalAlignment(SwingConstants.CENTER);
        add(playerScore);

        computerChoice = new JLabel("?");
        computerChoice.setBounds(175, 118, 98, 81);
        computerChoice.setFont(new Font("Dialog",Font.BOLD,18));
        computerChoice.setHorizontalAlignment(SwingConstants.CENTER);
        add(computerChoice);

        rockButton = new JButton("rock");
        rockButton.setBounds(40, 387, 105, 81);
        rockButton.setFont(new Font("Dialog",Font.BOLD,18));
        rockButton.setHorizontalAlignment(SwingConstants.CENTER);
        rockButton.addActionListener(this);
        add(rockButton);


        paperButton = new JButton("paper");
        paperButton.setBounds(165, 387, 105, 81);
        paperButton.setFont(new Font("Dialog",Font.BOLD,18));
        paperButton.setHorizontalAlignment(SwingConstants.CENTER);
        paperButton.addActionListener(this);
        add(paperButton);


        scissorButton = new JButton("scissors");
        scissorButton.setBounds(290, 387, 105, 81);
        scissorButton.setFont(new Font("Dialog",Font.BOLD,18));
        scissorButton.setHorizontalAlignment(SwingConstants.CENTER);
        scissorButton.addActionListener(this);
        add(scissorButton);

    }

    public void showDialog(String message){
        JDialog resultDialog = new JDialog(this,"Result: ",true);
        resultDialog.setSize(227,124);
        resultDialog.setResizable(false);
        resultDialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        resultLabel = new JLabel(message);
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        resultLabel.setFont(new Font("Dialog",Font.BOLD,18));

        resultDialog.add(resultLabel,BorderLayout.CENTER);

        JButton tryAgainButton = new JButton("Try Again?");
        tryAgainButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                computerChoice.setText("?");
                resultDialog.dispose();
            }
        });

        resultDialog.add(tryAgainButton,BorderLayout.SOUTH);
        resultDialog.setLocationRelativeTo(this);
        resultDialog.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        String playerChoice = e.getActionCommand().toString();

        String result = rockPaperScissor.playRockPaperScissors(playerChoice);
        computerChoice.setText(rockPaperScissor.getComputerChoice());

        computerScore.setText("computer:"+rockPaperScissor.getComputerScore());

        playerScore.setText("player: "+ rockPaperScissor.getPlayerScore());

        showDialog(result);

    }

}

