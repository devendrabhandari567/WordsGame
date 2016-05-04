
package com.leapfrog.wordsgame.command;

import com.leapfrog.wordsgame.entity.Player;

/**
 *
 * @author Devendra
 */
public abstract class GameCommand {
    
    public abstract void excute (Player player, String[] input);
    
}
