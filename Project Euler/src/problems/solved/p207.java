/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problems.solved;

import util.Problem;

/**
 * 
 * @author Sam <willsc8forwings@gmail.com>
 */
public class p207 implements Problem{
    
    public static void main(String[] args) {
        System.out.println( new p207().run() );
    }
    
    @Override
    public int getID() {
        return 207;
    }

    @Override
    public String getTitle() {
        return "Integer partition equations";
    }

    @Override
    public String run() {
        long perfect = 1; // Partitions where t is also an integer
        long total = 2;
        while (total <= 12345 * perfect) {
            if (((total & (++total)) == 0)) {
                perfect++;
            }
        }
        long finalAnswer = (total * (total + 1));
        
        return String.valueOf(finalAnswer);
    }

}
