package ua.com.vertex.proxy;

/**
 * Created by sweet_home on 11.09.16.
 */
public class ActorProxy implements Actor {

    private ActorImpl actor;

    public ActorProxy() {
        System.out.println("I'm procrastinating");
    }

    public void doMyBest() {
        System.out.println("Starting doMyBest()");
        if (actor == null) {
            actor = new ActorImpl();
        }

        actor.doMyBest();

        actor = null;
        System.out.println("doMyBest() is finished");
    }

    public void actLikeAPro() {
        if (actor == null) {
            actor = new ActorImpl();
        }
        actor.actLikeAPro();

    }
}
