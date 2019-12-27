package TicTacToe;

/**
 *
 * @author Rodrigo Michel
 */
public class TicTacToe {
    
    public static void main(String args[]){
        char vetor[][] = new char[3][3];
        MainFrame mFrame = new MainFrame(vetor);
        mFrame.setVisible(true);
        mFrame.startGame();
    }
}
