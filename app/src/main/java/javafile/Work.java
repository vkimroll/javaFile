package javafile;
// Add your package declaration here, eg. package com.mycompany;

import static com.rollbar.notifier.config.ConfigBuilder.withAccessToken;
import com.rollbar.notifier.Rollbar;


public class Work {
    private String jobName;
   private Rollbar rollbar;
    public Work() {
       jobName = "job";
       this.initRollbar();
    }
    public void initRollbar(){
       rollbar = Rollbar.init(withAccessToken("ADD-PROJECT-ACCESS-TOKEN")
                .environment("prod")
                .codeVersion("1.0.0")
                .build());
        rollbar.log("Hello, items dashboard.");
    }
    public void printJobName() {
//        jobName = "bob";
        System.out.println("It is responsive!");
        System.out.println(jobName);
    }

    public void Tests() throws Exception {
        rollbar.log("Inside tests folder.");
        System.out.println(jobName);
        rollbar.close(true);
    }
}
