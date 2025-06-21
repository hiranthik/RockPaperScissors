
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GameGUI extends JFrame implements ActionListener {
    
    JLabel yourChoiceLabel = new JLabel();
    JLabel yourScoreLabel = new JLabel();
    JLabel computerChoiceJlabel = new JLabel();
    JLabel computerScoreLabel = new JLabel();

    RockPaperScissorLizardSpock rockPaperScissorLizardSpock;

    public GameGUI(){
        setTitle("Rock-Paper-Scissor-Lizard-Spock-Game");
        setLayout(null);
        setSize(900,900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        rockPaperScissorLizardSpock = new RockPaperScissorLizardSpock();
        addGuiComponent();

    }

    public void addGuiComponent(){

        JButton rockButton = new JButton("rock");
        rockButton.addActionListener(this);
        rockButton.setBounds(80,400,100,70);
        rockButton.setHorizontalAlignment(SwingConstants.CENTER);
        rockButton.setFont(new Font("Dialog",Font.BOLD,26));
        add(rockButton);



        JButton paperButton = new JButton("paper");
        paperButton.addActionListener(this);
        paperButton.setBounds(250,400,100,70);
        paperButton.setHorizontalAlignment(SwingConstants.CENTER);
        paperButton.setFont(new Font("Dialog",Font.BOLD,26));
        add(paperButton);



        JButton scissorsButton = new JButton("scissors");
        scissorsButton.addActionListener(this);
        scissorsButton.setBounds(400,400,150,70);
        scissorsButton.setHorizontalAlignment(SwingConstants.CENTER);
        scissorsButton.setFont(new Font("Dialog",Font.BOLD,26));
        add(scissorsButton);



        JButton lizardButton = new JButton("lizard");
        lizardButton.addActionListener(this);
        lizardButton.setBounds(600,400,100,70);
        lizardButton.setHorizontalAlignment(SwingConstants.CENTER);
        lizardButton.setFont(new Font("Dialog",Font.BOLD,26));
        add(lizardButton);




        JButton spockButton = new JButton("spock");
        spockButton.addActionListener(this);
        spockButton.setBounds(750,400,100,70);
        spockButton.setHorizontalAlignment(SwingConstants.CENTER);
        spockButton.setFont(new Font("Dialog",Font.BOLD,26));
        add(spockButton);


        //labels 

        yourScoreLabel = new JLabel("Player: ");
        yourScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        yourScoreLabel.setFont(new Font("Dialog",Font.BOLD,26));
        yourScoreLabel.setBounds(100,200,650,100);
        add(yourScoreLabel);
        
        computerScoreLabel = new JLabel("Player: ");
        computerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        computerScoreLabel.setFont(new Font("Dialog",Font.BOLD,26));
        computerScoreLabel.setBounds(100,600,650,100);
        add(computerScoreLabel);


        yourChoiceLabel = new JLabel();
        yourChoiceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        yourChoiceLabel.setFont(new Font("Dialog",Font.BOLD,26));
        yourChoiceLabel.setBounds(100,250,650,100);
        add(yourChoiceLabel);


        computerChoiceJlabel = new JLabel("?");
         computerChoiceJlabel.setHorizontalAlignment(SwingConstants.CENTER);
        computerChoiceJlabel.setFont(new Font("Dialog",Font.BOLD,26));
        computerChoiceJlabel.setBounds(100,650,650,100); 
        add(computerChoiceJlabel);

    }

    public void showDialog(String message){
        JDialog resultDialog = new JDialog(this,"result",true);
        resultDialog.setSize(227,124);
        resultDialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JLabel resultLabel = new JLabel(message);
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        resultLabel.setFont(new Font("Dialog",Font.BOLD,26));
        resultDialog.add(resultLabel,BorderLayout.CENTER);

        JButton tryAgainButton = new JButton("Try Again? ");

        tryAgainButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event){
                computerChoiceJlabel.setText("?");
                yourChoiceLabel.setText("?");
                resultDialog.dispose();
            }
        });

        resultDialog.add(tryAgainButton,BorderLayout.SOUTH);
        resultDialog.setLocationRelativeTo(this);
        resultDialog.setVisible(true);

    }

    public void actionPerformed(ActionEvent event){
        String playerChoice = event.getActionCommand();
        String result = rockPaperScissorLizardSpock.playGame(playerChoice);

        computerChoiceJlabel.setText("computer chose: " + rockPaperScissorLizardSpock.getComputerChoice());
        yourChoiceLabel.setText("you chose: "+ playerChoice);

        computerScoreLabel.setText("computer's score:  " + rockPaperScissorLizardSpock.getComputerScore());
        yourScoreLabel.setText("your score: " + rockPaperScissorLizardSpock.getYourScore());

        showDialog(result);

    }

}
