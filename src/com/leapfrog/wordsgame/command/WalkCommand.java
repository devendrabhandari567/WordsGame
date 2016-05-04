
package com.leapfrog.wordsgame.command;

import com.leapfrog.wordsgame.entity.Player;

/**
 *
 * @author Devendra
 */
public class WalkCommand extends GameCommand{

    @Override
    public void excute(Player player, String[] input) {
        System.out.println(player.getName()+" "+ "is walking.");
    }
    
}
