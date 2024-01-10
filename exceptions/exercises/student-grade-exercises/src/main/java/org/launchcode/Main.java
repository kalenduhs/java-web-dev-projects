package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        try {
            System.out.println(Divide(5,0));
        } catch (ArithmeticException e) {
            System.out.println(e.getLocalizedMessage());
        }

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for(Map.Entry<String, String> entry : studentFiles.entrySet()) {
            try {
                System.out.println(entry.getKey() + " scored a " + CheckFileExtension(entry.getValue()));
            } catch (RuntimeException e) {
                System.out.println(entry.getKey() + " " + e.getLocalizedMessage());
            }
        }
    }

    public static int Divide(int x, int y)
    {
        if (y == 0) {
            throw new ArithmeticException("Don't divide by 0");
            }
        return  x / y;
    }



    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        //String correct = ".java";
        if (fileName.contains(".java")) {
            return 1;
        } else if (fileName.isEmpty()) {
            throw new RuntimeException("Please input a file name");
        } else {
            return 0;
        }
    }

    }
