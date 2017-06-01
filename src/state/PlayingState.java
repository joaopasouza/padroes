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
public class PlayingState implements State {

    @Override
    public void pressPlay(PlayerContext context) {
        context.setState(new StandbyState());
        System.out.println("Standby...");
    }

}
