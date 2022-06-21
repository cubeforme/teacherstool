/*
 * TeacherstoolApp.java
 */

package teacherstool;

import org.jdesktop.application.Action;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;

/**
 * The main class of the application.
 */
public class TeacherstoolApp extends SingleFrameApplication {

       
    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new TeacherstoolView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of TeacherstoolApp
     */
    public static TeacherstoolApp getApplication() {
        return Application.getInstance(TeacherstoolApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(TeacherstoolApp.class, args);
    }

    @Action
    public void openfirefox() {
        //Runtime.getRuntime().exec("start firefox");
    Runtime runtime = Runtime.getRuntime();
    try{
        runtime.exec("S:\\Firefox.exe");
    }
    catch (IOException e){
        e.printStackTrace();
    }
    
    }

    @Action
    public void ausfragegenerator() {
        //Randomizer
        //Generator.setText("5");
        
    }
}
