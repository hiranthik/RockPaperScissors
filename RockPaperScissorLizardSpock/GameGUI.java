
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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
        setSize(700,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        rockPaperScissorLizardSpock = new RockPaperScissorLizardSpock();

    }

    public void addGuiComponent(){

        JButton rockButton = new JButton("rock");
        rockButton.addActionListener(this);
        rockButton.setHorizontalAlignment(SwingConstants.CENTER);
        rockButton.setFont(new Font("Dialog",Font.BOLD,26));
        add(rockButton);



        JButton paperButton = new JButton("paper");
        paperButton.addActionListener(this);
        paperButton.setHorizontalAlignment(SwingConstants.CENTER);
        paperButton.setFont(new Font("Dialog",Font.BOLD,26));
        add(paperButton);



        JButton scissorsButton = new JButton("scissors");
        scissorsButton.addActionListener(this);
        scissorsButton.setHorizontalAlignment(SwingConstants.CENTER);
        scissorsButton.setFont(new Font("Dialog",Font.BOLD,26));
        add(scissorsButton);



        JButton lizardButton = new JButton("lizard");
        lizardButton.addActionListener(this);
        lizardButton.setHorizontalAlignment(SwingConstants.CENTER);
        lizardButton.setFont(new Font("Dialog",Font.BOLD,26));
        add(lizardButton);




        JButton spockButton = new JButton("spock");
        spockButton.addActionListener(this);
        spockButton.setHorizontalAlignment(SwingConstants.CENTER);
        spockButton.setFont(new Font("Dialog",Font.BOLD,26));
        add(spockButton);





    }

}
