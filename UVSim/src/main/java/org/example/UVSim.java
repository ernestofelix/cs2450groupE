package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UVSim {
    public int[] memory = new int[100];
    public int accumulator = 0;

    public static void main(String[] args) throws FileNotFoundException {
        UVSim uvSim = new UVSim();
        int instruction;

        File file = new File("src/main/java/Test1.txt");
        Scanner scannerFile = new Scanner(file);

        while (scannerFile.hasNextLine()) {
            instruction = scannerFile.nextInt();
            int operation = instruction / 100;
            int operand = instruction % 100;

            switch(operation) {
                case 10:
                    // code block
                    break;
                case 11:
                    // code block
                    break;
                case 20:
                    uvSim.load(operand);
                    break;
                case 21:
                    uvSim.store(operand);
                    break;
                case 30:
                    // code block
                    break;
                case 31:
                    // code block
                    break;
                case 32:
                    // code block
                    break;
                case 33:
                    // code block
                    break;
                case 40:
                    // code block
                    break;
                case 41:
                    // code block
                    break;
                case 42:
                    // code block
                    break;
                case 43:
                    // code block
                    break;
                default:
                    // code block
            }
        }
    }
    public void load(int operand) {
        accumulator = memory[operand];
    }

    public void store(int operand) {
        memory[operand] = accumulator;
    }


}

