
package com.leapfrog.wordsgame.command;

/**
 *
 * @author Devendra
 */
public class GameFactory {
    
    public static GameCommand get(String cmd){
        
        if (cmd.equalsIgnoreCase("move")){
            return new MoveCommmand();
        }
        
        else if(cmd.equalsIgnoreCase("walk")){
            return new WalkCommand();
        }
        
        else if(cmd.equalsIgnoreCase("run")){
            return new RunCommand();
        }
        
        else if(cmd.equalsIgnoreCase("down")){
            return new DownCommand();
        }
        
        else if(cmd.equalsIgnoreCase("shoot")){
            return new ShootCommand();
        }
        
        else if(cmd.equalsIgnoreCase("exit")){
            return new ExitCommand();
        }
        
        return null;
    }
    
}
