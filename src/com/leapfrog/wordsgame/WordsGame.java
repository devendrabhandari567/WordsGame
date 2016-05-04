
package com.leapfrog.wordsgame;

import com.leapfrog.wordsgame.command.GameCommand;
import com.leapfrog.wordsgame.command.GameFactory;
import com.leapfrog.wordsgame.entity.Player;
import java.util.Scanner;

/**
 *
 * @author Devendra
 */
public class WordsGame {

    public static void main(String[] args) {
        
        System.out.println("===========================");
        System.out.println("Welcome to text based game.");
        System.out.println("===========================");
        
        Scanner input = new Scanner(System.in);
        Player player = new Player();
        
        System.out.println("Enter name of Player :: ");
        player.setName(input.next());
        
        while (true) {
            
            System.out.println("Enter Command :: ");
            String inputCommand = input.nextLine();
            
            String[] cmds = inputCommand.split(" ");
            
            GameCommand gameCmd = GameFactory.get(cmds[0]);
            
            if(gameCmd!=null){
                gameCmd.excute(player, cmds);
            }
            
            else{
                System.out.println("Invalid Command !!! ");
            }
            
        }
    }
    
}
