
import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                GameGUI gamegui = new GameGUI();
                gamegui.setVisible(true);
            }
        });
    }
}