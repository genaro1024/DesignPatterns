package com.genaro1024;

import com.genaro1024.behaviorpatterns.RunBehaviorPatterns;
import com.genaro1024.creationpatterns.RunCreationPatterns;
import java.util.HashMap;
import java.util.Scanner;

public class RunGlobal {
    public static void Run(){

        Scanner scanner = new Scanner(System.in);
        boolean running =true;

        while(running){

            StringBuilder sbMenu =new StringBuilder();
            sbMenu.append("0.All ");
            sbMenu.append("\n");
            sbMenu.append(RunCreationPatterns.generateMenu(1));
            sbMenu.append("\n");
            sbMenu.append(RunBehaviorPatterns.generateMenu(4));
            sbMenu.append("\n");
            sbMenu.append("99.Exit ");

            System.out.println(sbMenu.toString());

            HashMap<Integer,Runnable> options = new HashMap<>();
            options.put(0,()->{RunCreationPatterns.Run();RunBehaviorPatterns.Run();});
            options.putAll(RunCreationPatterns.getRunnable(1));
            options.putAll(RunBehaviorPatterns.getRunnable(4));
            options.put(99,()->{System.exit(0);});        

            System.out.println("Enter an option");
            int number = scanner.nextInt();

            if (options.containsKey(number)){
                options.get(number).run();
            }
            else{
                System.out.println("Not Found");
            }            

        }
        scanner.close();


    }
}
