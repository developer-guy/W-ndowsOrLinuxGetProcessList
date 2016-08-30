package org.bthnapaydin.process.linux;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bapaydin on 30.08.2016.
 */
public class GetLinuxProcessList {
    public static void main(String[] args) throws IOException {
        Process process = Runtime.getRuntime().exec("ps -few");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String processLine;

        while((processLine = bufferedReader.readLine()) != null){
            System.out.println("Process : " + processLine);
        }
    }
}
