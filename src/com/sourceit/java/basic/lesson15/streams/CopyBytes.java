package com.sourceit.java.basic.lesson15.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("xanadu.txt");
            out = new FileOutputStream("outgoin.txt");
            int c;

            while ((c = in.read()) != -1) {
    				System.out.println(c);
                out.write(c);
//                out.write(100);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        
        System.out.println(new File("outgoin.txt").getAbsolutePath() + " created.");
    }
}