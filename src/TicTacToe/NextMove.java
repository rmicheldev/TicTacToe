package TicTacToe;

/**
 *
 * @author Rodrigo
 * 
 * 
 * Matrix map:
 * 
 *  0,0   |  0,1   |   0,2
 *  -------------------------
 *  1,0   |  1,1   |   1,2
 *  -------------------------
 *  2,0   |  2,1   |  2,2
 * 
 */

public class NextMove {
    char vetor[][]       = new char[3][3];
    char[] toDefense     = new char[8];
    char[] toWin         = new char[8];
    char[] ifNothingElse = new char[10];
    
    public NextMove() {
        for (int x=0;x<8;x++){
            toDefense[x]     = 's';
            toWin[x]         = 's';
            ifNothingElse[x] = 's';
        }
        
        for (int x=0;x<2;x++){
            for (int y=0;y<2;y++){
                vetor[x][y] = 'V';
            }
        }
    }
    
    int generate(char[][] vetor) {
        this.vetor = vetor;
        
        int canWin  = checkPossibility('M', 'H', toWin);
        //if I can't win, I see if there's a possibility of losing
        if( canWin != 0){
            System.out.println("I can win " + canWin);
            return canWin;
        }
        
        int canLost = checkPossibility('H', 'M', toDefense);
        //if I can't win, but there's any possibility of losing
        if(canLost != 0){
            System.out.println("Break an attack " + canLost);
            return canLost;
        }
        
        //I choose any place
        int any = Anything();
        System.out.println("Any place " + any);
        return any;
    }
    
    int checkPossibility(char target, char antiTarget, char[] checkArray){
        int warningHere = 0;
        //for line
        for(int x=0; x<3; x++){
            if (checkArray[x] == 's'){
                if( vetor[x][0] == target && vetor[x][1] == target || 
                    vetor[x][0] == target && vetor[x][2] == target ||
                    vetor[x][1] == target && vetor[x][2] == target ){
                    
                    //Two pieces in the same line
                    if(vetor[x][0] == antiTarget || vetor[x][1] == antiTarget || vetor[x][2] == antiTarget){
                        //The line have a cpu piece yet
                        checkArray[x]='N';
                    } else {
                        // select a place to put a piece
                        if(vetor[x][0]=='V'){
                            warningHere = 3*x+1;
                        } else if(vetor[x][1]=='V') {
                            warningHere = 3*x+2;
                        } else if(vetor[x][2]=='V') {
                            warningHere=3*x+3;
                        }
                    }
                }
            }
        }
    
        //for columns
        for(int y=0;y<3;y++){
            if (checkArray[(y+3)] == 's'){
                if( vetor[0][y] == target && vetor[1][y]== target ||
                    vetor[0][y] == target && vetor[2][y]== target ||
                    vetor[1][y] == target && vetor[2][y]== target ){
                    
                    //Two pieces in the same column
                    if(vetor[0][y] == antiTarget || vetor[1][y] == antiTarget || vetor[2][y] == antiTarget){
                        //The line have a cpu piece yet
                        checkArray[y+3]='N';
                    } else {
                        // select a place to put a piece
                        if(vetor[0][y] == 'V'){
                            warningHere = y+1;
                        } else if(vetor[1][y] == 'V'){
                            warningHere=y+4;
                        } else if(vetor[2][y]=='V') {
                            warningHere=y+7;
                        }
                    }
                }
            }
        }
        
        //for diagonals
        if (checkArray[6]=='s'){
            if( vetor[0][0] == target && vetor[1][1] == target ||
                vetor[0][0] == target && vetor[2][2] == target || 
                vetor[2][2] == target && vetor[1][1] == target ){
                
                //Two pieces in the same diagonal
                if(vetor[0][0] == antiTarget || vetor[1][1] == antiTarget || vetor[2][2] == antiTarget){
                    //The line have a cpu piece yet
                    checkArray[6]='N';
                } else {
                    // select a place to put a piece
                    if(vetor[0][0]=='V'){
                        warningHere = 1;
                    } else if(vetor[1][1]=='V') {
                        warningHere = 5;
                    } else if(vetor[2][2]=='V') {
                        warningHere = 9;
                    }
                }
            }
        }

        if (checkArray[7] == 's'){
            if( vetor[0][2] == target && vetor[1][1] == target ||
                vetor[0][2] == target && vetor[2][0] == target ||
                vetor[2][0] == target && vetor[1][1] == target ){
                
                //Two pieces in the same diagonal
                if(vetor[0][2] == antiTarget || vetor[1][1] == antiTarget || vetor[2][0] == antiTarget){
                    //The line have a cpu piece yet
                    checkArray[7] = 'N';
                } else {
                    // select a place to put a piece
                    if(vetor[0][2]=='V') {
                        warningHere=3;
                    } else if(vetor[1][1]=='V') {
                        warningHere=5;
                    } else if(vetor[2][0]=='V'){
                        warningHere=7;
                    }
                }
            }
        }
        return warningHere;
    }
 
    int Anything(){
        int next_pos =0;
        int human = 0;
        int cpu = 0;
        
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                if(vetor[x][y] == 'H'){
                    human++;
                }
                if(vetor[x][y] == 'M'){
                    cpu++;}
            }
        }
        
        //When we can, we put the piece in the center
        if(vetor[1][1]=='V'){
             next_pos =5;
        }
        
        //If both play once, put in the corner
        if(cpu == 1 && human == 1){
            if(vetor[0][0]!='V'){
                next_pos =9;
            }
            else if(vetor[2][2]!='V'){
                next_pos =1;
            }
            else if(vetor[0][2]!='V'){
                 next_pos =7;
            }
            else if(vetor[2][0]!='V'){
                next_pos =3;
            }
            else if(vetor[1][0]!='V' || vetor[0][1]!='V'){
                next_pos =1;
            }
            else{
                next_pos =9;
            }
        // if human play once in the center   
        } else if(vetor[1][1]=='H' && human == 1) {
            //if CPU don't have played
            if(cpu == 0){
                next_pos  = 1;
            } else {
                //else find a place
                if(vetor[0][0]=='M'){
                    next_pos =9;
                } else if(vetor[2][2]=='M') {
                    next_pos =1;
                } else if(vetor[0][2]=='M') {
                    next_pos =7;
                } else if(vetor[2][0]=='M') {
                    next_pos =3;
                }
            }
        } else if(vetor[0][0]=='H' && vetor[2][2]=='H' && vetor[1][1]=='M'){
            if(vetor[0][1]!='v' && vetor[1][0]!='v' && vetor[1][2]!='v' && vetor[2][1]!='v'){
                next_pos  = 4;
            }
        } else if(vetor[0][2]=='H' && vetor[2][0]=='H' && vetor[1][1]=='M'){
            if(vetor[0][1]!='v' && vetor[1][0]!='v' && vetor[1][2]!='v' && vetor[2][1]!='v'){
                next_pos =4;
            }
        } else if(vetor[1][1]=='H' && vetor[0][0]=='H' && vetor[2][2]=='M'||vetor[1][1]=='H' && vetor[0][2]=='H'&& vetor[2][0]=='M'||vetor[1][1]=='H' && vetor[2][0]=='H'&& vetor[0][2]=='M'||vetor[1][1]=='H' && vetor[2][2]=='H'&& vetor[0][0]=='M'){
            if(vetor[0][0]=='V'){
                next_pos =1;
            } else if(vetor[0][2]=='V'){
                next_pos =3;
            } else if(vetor[2][0]=='V'){
                next_pos =7;
            }
            if(vetor[2][2]=='V'){
                next_pos =9;
            } else if(vetor[0][2]=='V' || vetor[2][0]=='V'){
                if(vetor[2][0]=='V'){
                    next_pos =7;
                } else {
                    next_pos =3;
                }
            } else if(vetor[0][1]=='V'){
                next_pos =2;
            } else if(vetor[1][0]=='V'){
                next_pos =4;
            } else if(vetor[1][2]=='V'){
                next_pos =6;
            } else if(vetor[1][2]=='V'){
                next_pos =8;
            } else {
                for (int x=0;x<3;x++){
                    for (int y=0;y<3;y++){
                        if(vetor[x][y]=='V'){
                            next_pos =y*3+x+1;
                            break;
                        }
                    }
                }
            }
        }
        if(next_pos ==0){
            if(vetor[0][0]=='V'){
                next_pos =1;
            } else if(vetor[2][0]=='V'){
                next_pos =7;
            } else if(vetor[0][2]=='V'){
                next_pos =3;
            } else if(vetor[2][2]=='V'){
                next_pos =9;
            } else if(vetor[0][1]=='V'){
                next_pos =2;
            } else if(vetor[1][0]=='V'){
                next_pos =4;
            } else if(vetor[1][2]=='V'){
                next_pos =6;
            } else if(vetor[2][1]=='V'){
                next_pos =8;
            }
        }
        return next_pos ;
    }
}