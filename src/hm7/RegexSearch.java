package hm7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.*;

public class RegexSearch {
    private  static void writeFile(FileWriter writer, int lineCounter, String result){
        try {
            writer.append("Match found on line "+lineCounter+":\n");
            writer.append(result).append("\n");
        } catch (IOException e) {
            System.out.println("Error occurred when writing output file!");
        }
    }

    private static void finder(Pattern pattern){
        File inputFile = new File("src\\hm7\\input.txt");
        File outputFile = new File("src\\hm7\\output.txt");

        try (
            Scanner input = new Scanner(inputFile);
            FileWriter writer = new FileWriter(outputFile, false); // Change true -> false if you want to rewrite output file
        ) {
            int lineCounter=0;
            while(input.hasNext()){
                String line = input.nextLine();
                lineCounter++;
                Matcher matcher = pattern.matcher(line);

                while(matcher.find()){
                    writeFile(writer, lineCounter, matcher.group()); //To return whole line use 'line' instead of 'matcher.group()'
                }
            }

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        final String[] patterns = {
                "\\+[0-9]{1,3}-[0-9]{3}-[0-9]{3}-[0-9]{4}", //For phone number
                "\\w+@\\w+\\.\\w+",                         //Email
                "[A-Z]\\w+(\\s|-)[A-Z]\\w+"                 //Full name
        }; //Prepared patterns

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any regex pattern manually or choose from options: ");
        System.out.println("\n1.Phone\n2.Email\n3.Name");
        System.out.println("Your input: ");
        String inputPattern = scanner.nextLine();
        Pattern pattern = null;

        if(inputPattern.matches("[1-3]")) {
            int choice = Integer.parseInt(inputPattern)-1;
            pattern = Pattern.compile(patterns[choice]);
        }  else {
            try{
               pattern = Pattern.compile(inputPattern);
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid regex pattern");
                return;
            }
        }

        finder(pattern);
        System.out.println("Search completed!");
    }
}
