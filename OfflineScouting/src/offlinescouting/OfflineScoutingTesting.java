/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package offlinescouting;

/**
 *
 * @author Robotics SE
 */

public class OfflineScoutingTesting {
    static String[] tester;
    public static void init(){
        ScoutingWindowTest mainWindow = new ScoutingWindowTest();
        mainWindow.setVisible(true);
        tester[0] = "hue";
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        init();
    }
    
    
    
    public void run(String[] hue){
        main(hue);
    }
    
}
