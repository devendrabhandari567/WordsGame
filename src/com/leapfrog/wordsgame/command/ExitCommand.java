
package com.leapfrog.wordsgame.command;

import com.leapfrog.wordsgame.entity.Player;

/**
 *
 * @author Devendra
 */
public class ExitCommand extends GameCommand{

    @Override
    public void excute(Player player, String[] input) {
        
        System.out.println("Program is Closing.");
        
        System.exit(0);
    }
    
}
