package com.smurygin.ocjp.nio2;


import com.smurygin.ocjp.nio2.visitor.PrintMessageWhileVisit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WalkerAFileTree {

    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Usage: WalkerAFileTree <source-path>");
            System.exit(-1);
        }

        Path pathSource = Paths.get(args[0]);

        try {
            Files.walkFileTree(pathSource, new PrintMessageWhileVisit());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
