

// public class RockPaperScissor{

//     public static void main (String[]args){
//         Scanner scanner = new Scanner(System.in);
//         Random random = new Random();

//         String [] choices = {"rock","paper","scissors"};

//         while(true){
//             System.out.println("Enter 'rock', 'paper', 'scissors' or 'quit'");
//             String userChoice = scanner.nextLine().toLowerCase();

//             if(userChoice.equals("quit")){
//                 System.out.println("Thanks for playing. Goodbye!");
//                 break;
//             }

//             if(!userChoice.equals("rock")&& !userChoice.equals("paper")&& !userChoice.equals("scissors")&&!userChoice.equals("quit")){
//                 System.out.println("Input invalid. Please try again.");
//                 continue;
//             }

//             int index = random.nextInt(3);
//             String computerChoice = choices[index];

//             System.out.println("computer chose " + computerChoice);

//             if(userChoice.equals(computerChoice)){
//                 System.out.println("it's a tie");
//             }

//             else if(userChoice.equals("rock")&& computerChoice.equals("scissors")|| userChoice.equals("paper")&&computerChoice.equals("rock")||userChoice.equals("scissors")&&computerChoice.equals("paper")){
//                 System.out.println("Congratulations!! you win!!");
//             }

//             else{
//                 System.out.println("Computer wins!");
//             }

//         }
//         scanner.close();
//     }
// }




// import java.util.Random;
// import java.util.Scanner;

// public class RockPaperScissor{

   

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         Random random = new Random();
        
//         String[] choices ={"rock","paper","scissors"};

//         System.out.println("Please enter 'rock','paper' or 'scissors' or 'quit' to exit the game");
        

//         while(true){
//             String userChoice = scanner.nextLine().toLowerCase();
//         if(userChoice.equals("quit")){
//             System.out.println("Goodbye!");
//             break;
//         }
        
//         if(!userChoice.equals("rock")&&!userChoice.equals("paper")&&!userChoice.equals("scissors")){
//             System.out.println("invalid input. Please enter the correct input.");
//             continue;
//         }


//         int index = random.nextInt(3);
//         String computerChoice = choices[index];

//         System.out.println("computer chose "+ computerChoice);

//         if(userChoice.equals("rock")&& computerChoice.equals("paper")||userChoice.equals("paper")&&userChoice.equals("scissor")||userChoice.equals("scissors")&&computerChoice.equals("rock")){
//             System.out.println("you lose :<( computer wins! Enter an input to redo.");
//         }
//          if(userChoice.equals(computerChoice)){
//             System.out.println("you are tied with the computer. Enter an input to redo");
//         }
//         else{
//             System.out.println("computer lose! YOU WIN!! Enter an input to replay");
//         }
//     }
//     scanner.close();
//     }
    
// }




// public class RockPaperScissors extends JFrame implements ActionListener{
//     private JButton rockButton;
//     private JButton paperButton;
//     private JButton scissorButton;

//     private JLabel resultLabel;
//     private JLabel computerChoiceJLabel;

//     private ImageIcon rockImage = new ImageIcon("rock.avif");
//     private ImageIcon paperImage = new ImageIcon("paper.avif");
//     private ImageIcon scissorImage = new ImageIcon("scissors.avif");

//     Scanner scanner = new Scanner(System.in);
//     Random random = new Random();
//     String[] choices = {"rock","paper","scissors"};


//     public RockPaperScissors(){
//         setTitle("Rock-Paper-Scissors");
//         setSize(500,500);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLocationRelativeTo(null);
        


//         rockButton.addActionListener(this);
//         paperButton.addActionListener(this);
//         scissorButton.addActionListener(this);
        
//         JPanel panel = new JPanel();

//         panel.add(rockButton);
//         panel.add(paperButton);
//         panel.add(scissorButton);


//         rockButton.setActionCommand("rock");
//         rockButton.setActionCommand("paper");
//         rockButton.setActionCommand("scissors");

//     }



//     public void actionPerformed(ActionEvent event){
//         String userChoice = event.getActionCommand();
//         String computerChoice = choices[random.nextInt(3)];
//     }

//     public static void main(String[] args) {
        
        


//     }



// }

import java.util.Random;

public class RockPaperScissor{


    static final String[] computerChoices ={"rock","paper","scissors"};

    String playerChoice;
    String computerChoice;
    int computerScore;
    int playerScore;
    Random random;

   public RockPaperScissor(){
     random = new Random();
   }
  
    public String playRockPaperScissors(String playerChoice){
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];
        String result;

        if(computerChoice.equals(playerChoice)){
            result = "draw";
        }
        else if(computerChoice.equals("rock")&&playerChoice.equals("paper")||computerChoice.equals("paper")&&playerChoice.equals("scissors")||computerChoice.equals("scissors")&&playerChoice.equals("rock")){
            result = "you win!!";
        }
        else{
            result = "computer wins!! you lose :<";
        }
        return result;

    }

    public String getComputerChoice(){
        return computerChoice;
    }
    public int getComputerScore(){
        return computerScore;
    }

    public int getPlayerScore(){
        return playerScore;
    }

}