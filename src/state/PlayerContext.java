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
public class PlayerContext {

    private State state;

    public PlayerContext(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
