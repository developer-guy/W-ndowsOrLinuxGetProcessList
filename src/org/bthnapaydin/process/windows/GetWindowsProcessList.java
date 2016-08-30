package org.bthnapaydin.process.windows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bapaydin on 30.08.2016.
 */
public class GetWindowsProcessList {
    public static void main(String[] args) throws IOException {
        String processTaskExe = System.getenv("windir")+"\\system32\\"+"tasklist.exe";
        Process process = Runtime.getRuntime().exec(processTaskExe);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String processLine;

        while((processLine = bufferedReader.readLine()) != null){
            System.out.println("Process : " + processLine);
        }
    }
}
