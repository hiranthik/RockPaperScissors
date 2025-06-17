import java.util.Random;

public class RockPaperScissorLizardSpock{
    String computerChoice;
    String yourChoice;

    int computerScore;
    int yourScore;
    
    String[] choices ={"rock","paper","scissors","lizard","spock"};
    Random random;

    public RockPaperScissorLizardSpock(){
        random=new Random();
    }

    public String playGame(String yourChoice){
        computerChoice = choices[random.nextInt(choices.length)];
        String result;
        if(yourChoice.equals(computerChoice)){
            result = "It's a draw!!! ";
        }
        else if(yourChoice.equals("rock")&&computerChoice.equals("scissors")||yourChoice.equals("rock")&&computerChoice.equals("lizard")||
        yourChoice.equals("paper")&&computerChoice.equals("rock")||yourChoice.equals("paper")&&computerChoice.equals("spock")||
        yourChoice.equals("scissors")&&computerChoice.equals("paper")||yourChoice.equals("scissors")&&computerChoice.equals("lizard")||
        yourChoice.equals("lizard")&&computerChoice.equals("spock")||yourChoice.equals("lizard")&&computerChoice.equals("paper")||
        yourChoice.equals("spock")&&computerChoice.equals("rock")||yourChoice.equals("spock")&&computerChoice.equals("scissors")){
          result = "You win!!!" ; 
          yourScore++;
        }
        else{
            result = "you lose!! ";
            computerScore++;
        }
        return result;
    }

    
    public int getYourScore(){
        return yourScore;
    }

    public int getComputerScore(){
        return computerScore;
    }

    public String getYourChoice(){
        return yourChoice;
    }

    public String getComputerChoice(){
        return computerChoice;
    }



   }
       
    

