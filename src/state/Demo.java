/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author joaopaulo
 */
public class Demo {

    public static void main(String[] args) {
        StandbyState standbyState = new StandbyState();
        standbyState.pressPlay(new PlayerContext(new PlayingState()));
    }

}
