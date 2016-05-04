
package com.leapfrog.wordsgame.command;

import com.leapfrog.wordsgame.entity.Player;

/**
 *
 * @author Devendra
 */
public class RunCommand extends GameCommand{

    @Override
    public void excute(Player player, String[] input) {
        System.out.println(player.getName()+" "+ "is running.");
    }
    
}
