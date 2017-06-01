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
public class StandbyState implements State {

    @Override
    public void pressPlay(PlayerContext context) {
        context.setState(new PlayingState());
        System.out.println("Now Playing...");
    }

}
