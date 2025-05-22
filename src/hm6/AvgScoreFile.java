package hm6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class AvgScoreFile {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        double avg;
        try (Scanner scanner = new Scanner(new File("C:\\projects\\JavaQA\\JavaS_HM\\src\\hm6\\input.txt"))) {

            if (scanner.hasNextInt()) {
                count = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid student number");
                return;
            }

            int studentLinesRead = 0;
            while (scanner.hasNextLine() && studentLinesRead < count) {
                String line = scanner.nextLine();
                try (Scanner lineScanner = new Scanner(line)) {
                    while (lineScanner.hasNextInt()) {
                        sum += lineScanner.nextInt();
                    }
                }
                studentLinesRead++;
            }

            if (count == 0) {
                System.out.println("No students to calculate avg score");
                return;
            }

            avg = (double) sum / count;
            try (FileWriter outputWriter = new FileWriter("src\\hm6\\output.txt", false)) {

                outputWriter.write(String.format("avg: %.2f", avg));

            } catch (IOException e) {
                System.out.println("Output file error");
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.out.println("Input file not found or reading error");
            e.printStackTrace();
        }
    }
}
