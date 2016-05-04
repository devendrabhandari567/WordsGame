
package com.leapfrog.wordsgame.command;

import com.leapfrog.wordsgame.entity.Player;

/**
 *
 * @author Devendra
 */
public class MoveCommmand extends GameCommand{

    @Override
    public void excute(Player player, String[] input) {
        
        if (input.length==1){
            System.out.println("Where do you want to move :: ");
            
        }
        
        else if (input.length>1){
            switch(input[1].toLowerCase()){
                case "left":
                    System.out.println("You are moving left.");
                    break;
                    
                case "right":
                    System.out.println("You are moving right.");
                    break;
                    
                default:
                    System.out.println("I am confuse where to move.");
                    
            }
        }
    }
    
}
