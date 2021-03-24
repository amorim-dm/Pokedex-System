/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.system;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NewClass {
    public static void main(String[] args) {
        String text = "Hello World!";
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        for (int i = 0; i < text.length(); ++i) {
            final int index = i;
            ses.schedule(() -> System.out.print(text.charAt(index)), 500 * i, TimeUnit.MILLISECONDS);
        }
        ses.shutdown();
    }
}    

