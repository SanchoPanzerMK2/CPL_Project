import java.util.StringTokenizer;
//import java.util.Scanner;
import java.io.*;
public class CPL_Project {
    public static void main(String args[]) {
        //Scanner scnr = new Scanner(System.in);
        String str = new String();
        String[] keywords = {"specifications","symbol","forward","references","function", "pointer", "array","type", "struct","integer", "enum","global","declarations","implementations","main","parameters","constant","begin","endfun","if","then","else","endif","repeat","until","endrepeat","display","set","return"};
        String[] identifiers={"mvoid","integer","short","real","float","double","tbool","char","tstring","tbyte"};
        //System.out.println("Enter String: ");
        //str = scnr.nextLine();
        try{
            // Open the file that is the first
            // command line parameter
            FileInputStream fstream = new FileInputStream("src/sclex1.scl");
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int linum=0;
            //Read File Line By Line
            while ((str = br.readLine()) != null)   {
                linum++;
                // Print the content on the console
                System.out.println (str);
                StringTokenizer token = new StringTokenizer(str);
                System.out.println("\nLine number "+linum);
                System.out.println("\nThe  list of tokens is:");
                String tok = "";
                String tok1 = "";
                while (token.hasMoreTokens()) {
                    tok1=token.toString();
                    tok = token.nextToken();
                    for (int i=0; i<=keywords.length; i++){
                        if (tok.equals(keywords[i])) {
                            System.out.println(i + 1);
                            for (int j=0; j<=identifiers.length; j++){
                                if (tok.equals(identifiers[j])) {
                                    System.out.println(j + 1);
                                    break;
                                }
                                else if(tok1.equals("constant")){
                                    System.out.println(identifiers.length+j+1);
                            }
                        }

                            break;
                        }
                        else{
                            System.out.println(tok);
                            break;
                        }
                    }


                }
            }
            //Close the input stream
            in.close();
        }catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

    }
}