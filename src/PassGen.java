import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.security.SecureRandom;

public class PassGen {
    private char[] charList = {'q', 'w', 'e','r','t', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'ç', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
    private char[] charListUp = {'Q', 'W', 'E','R','T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Ç', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'};
    private char[] symList = {'@','!' ,'#' , '$', '%', '&'};
    private int[] numList = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private List<Object> Password = new ArrayList<>();
    private SecureRandom sr = new SecureRandom();
    
    public PassGen(int charN, int charUpN, int symN, int numN) {
        genChar(charN);
        genCharUp(charUpN);
        genSym(symN);
        genNum(numN);
    }
    private void genChar(int size){
        if(size==0) return;
        for(int x =0; x< size; x++){
            Password.add(charList[sr.nextInt(charList.length)]);
        }
    }
    private void genCharUp(int size){
        for(int x =0; x< size; x++){
            Password.add(charListUp[sr.nextInt(charListUp.length)]);
        }
    }

    private void genSym(int size){
        for(int x =0; x< size; x++){
            Password.add(symList[sr.nextInt(symList.length)]);
        }
    }

    private void genNum(int size){
        for(int x =0; x< size; x++){
            Password.add(numList[sr.nextInt(numList.length)]);
        }
    }

    public void print(){
        Collections.shuffle(Password);
        Password.forEach(y -> System.out.print(y));
    }
    
}
