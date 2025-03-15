package hm3;

import java.io.IOException;

public class HelpExtended {
    public static void main(String[] args) throws IOException{
        char choice, ignore;

        for(;;) {
            do {
                System.out.println("\nСправка:");
                System.out.println("1. if");
                System.out.println("2. switch");
                System.out.println("3. for");
                System.out.println("4. while");
                System.out.println("5. do-while");
                System.out.println("6. break");
                System.out.println("7. continue\n");
                System.out.print("Выберите (q - выхо): ");

                choice =(char) System.in.read();

                do{
                    ignore=(char) System.in.read();
                } while(ignore!='\n');
            } while(choice <'1'| choice >'7' & choice !='q');

            if(choice=='q') break;

            System.out.println("\n");

            switch(choice){
                case '1' -> {
                    System.out.println("Оператор if:\n");
                    System.out.println("if(условие) оператор");
                    System.out.println("else оператор");
                }
                case '2' -> {
                    System.out.println("Оператор switch:\n");
                    System.out.println("switch(выражение) {");
                    System.out.println("\tcase константа:");
                    System.out.println("\tпоследовательность операторов");
                    System.out.println("\tbreak;");
                    System.out.println("\t// ...");
                    System.out.println("}");
                }
                case '3' -> {
                    System.out.println("Оперетор for:\n");
                    System.out.println("for (инициализация; условие; итерация)");
                    System.out.println("\t оператор");
                }
                case '4' -> {
                    System.out.println("Оператор while:\n");
                    System.out.println("while(условие) оператор");
                }
                case '5' -> {
                    System.out.println("Оператор do-while:\n");
                    System.out.println("do {");
                    System.out.println("\tоператор;");
                    System.out.println("} while(условие);");
                }
                case '6' -> {
                    System.out.println("Оператор break:\n");
                    System.out.println("break; или break метка;");
                }
                case '7' -> {
                    System.out.println("Оператор continue:\n");
                    System.out.println("continue; или continue метка;");
                }
                default -> System.out.println("Запрос не найден.");
            }
        }
    }
}
