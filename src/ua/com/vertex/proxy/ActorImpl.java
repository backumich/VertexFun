package ua.com.vertex.proxy;

/**
 * Created by sweet_home on 11.09.16.
 */
public class ActorImpl implements Actor {

    public ActorImpl(){
        System.out.println("I'm realy acting");
    }


    @Override
    public void doMyBest() {
        System.out.println("Ready but not yet");
    }

    @Override
    public void actLikeAPro() {
        System.out.println("Already on UAT");
    }
}
