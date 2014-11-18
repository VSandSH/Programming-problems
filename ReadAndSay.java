import java.io.*;
public class ReadAndSay {
    public static void main(String args[] ) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String strNew = buff.readLine();
        char[] arrChar = strNew.toCharArray();
        int[] arrInt = new int[strNew.length()+1];
        int counter;
        
        for (int i = 0; i< strNew.length(); i++){
            arrInt[i] = Character.getNumericValue(arrChar[i]);
        }
        
        counter = 1;
        for (int i = 1; i <= strNew.length(); i++){
            if (arrInt[i] != arrInt[i-1]){
                System.out.print(counter + "" + arrInt[i-1]);
                counter = 1;
            }
            else
                if(arrInt[i] == arrInt[i-1]){
                    counter++;
            }
        }
        System.out.println("\n"+Character.getNumericValue(' '));
    }
}
