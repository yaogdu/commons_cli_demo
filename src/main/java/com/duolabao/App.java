package com.duolabao;

import org.apache.commons.cli.*;

/**
 * Hello world!
 */
public class App {


    static final Options options = new Options();

    static {
        options.addOption("h", "help", false, "show help info");
        options.addOption("a", "app_id", true, "wechat public app id");
        options.addOption("m", "msg_id", true, "media id");
        options.addOption("d", "date", true, "media push date");
        options.addOption("r", "record_num", true, "record num");
    }


    public static void main(String[] args) {


//        options.addOption("help", false, "demo param t");


//        formatter.printHelp("help", options);


        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmdLine = parser.parse(options, args);


            if (cmdLine.hasOption("h")) {
                HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp("help", options, true);
                return;
            }

            if (cmdLine.hasOption("m")) {
                System.out.println(cmdLine.getOptionValue("m"));
            }

        } catch (ParseException e) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("help", options, true);
        }

//        System.out.println(args[0]);
//        System.out.println(args[1]);


        System.out.println("Hello World2!");
    }
}
