package ua.com.vertex.proxy;

/**
 * Created by sweet_home on 11.09.16.
 */
public class ActorUser {

    private Actor actor;

    public ActorUser(Actor actor){
        this.actor = actor;
    }

    public void doAct(){
        actor.doMyBest();
        actor.actLikeAPro();
    }

    public static void main(String[] args) {
        ActorUser actorUser = new ActorUser(new ActorProxy());

        actorUser.doAct();
    }
}
