import java.util.StringTokenizer;
//import java.util.Scanner;
import java.io.*;
public class CPL_Project {
    public static void main(String args[]) {
        //Scanner scnr = new Scanner(System.in);
        String str = new String();
        //System.out.println("Enter String: ");
        //str = scnr.nextLine();
        try{
            // Open the file that is the first
            // command line parameter
            FileInputStream fstream = new FileInputStream("src/sclex1.scl");
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            //Read File Line By Line
            while ((str = br.readLine()) != null)   {
                // Print the content on the console
                System.out.println (str);
                StringTokenizer token = new StringTokenizer(str);
                System.out.println("\nThe  list of tokens is:");
                String tok = "";
                while (token.hasMoreTokens()) {
                    tok = token.nextToken();
                    switch (tok) {
                        case "specifications":
                            System.out.println("1");
                            break;

                        case "symbol":
                            System.out.println("2");
                            break;

                        case "forward":
                            System.out.println("3");
                            break;

                        case "references":
                            System.out.println("4");
                            break;

                        case "function":
                            System.out.println("5");
                            break;

                        case "pointer":
                            System.out.println("6");
                            break;

                        case "array":
                            System.out.println("7");
                            break;

                        case "type":
                            System.out.println("8");
                            break;

                        case "struct":
                            System.out.println("9");
                            break;

                        case "integer":
                            System.out.println("10");
                            break;

                        case "enum":
                            System.out.println("11");
                            break;

                        case "global":
                            System.out.println("12");
                            break;

                        case "declarations":
                            System.out.println("13");
                            break;

                        case "implementations":
                            System.out.println("14");
                            break;

                        case "main":
                            System.out.println("15");
                            break;

                        case "parameters":
                            System.out.println("16");
                            break;

                        case "constant":
                            System.out.println("17");
                            break;

                        case "begin":
                            System.out.println("18");
                            break;

                        case "endfun":
                            System.out.println("19");
                            break;

                        case "if":
                            System.out.println("20");
                            break;

                        case "then":
                            System.out.println("21");
                            break;

                        case "else":
                            System.out.println("22");
                            break;

                        case "endif":
                            System.out.println("23");
                            break;

                        case "repeat":
                            System.out.println("24");
                            break;

                        case "until":
                            System.out.println("25");
                            break;

                        case "endrepeat":
                            System.out.println("26");
                            break;

                        case "display":
                            System.out.println("27");
                            break;

                        case "set":
                            System.out.println("28");
                            break;

                        case "return":
                            System.out.println("29");
                            break;

                        default: System.out.println(tok);
                            break;
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