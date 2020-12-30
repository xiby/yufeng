package tech.xiby.yufeng.domain;

/**
 * the model of the world, containing the information about players, balls
 *
 * @author xiby
 */
public class WorldModel {
    /**
     * message received from the server directly
     */
    private MessageInfo messageInfo;

    private static class WorldModelHolder{
        private static WorldModel INSTANCE = new WorldModel();

    }

    public static WorldModel getInstance(){
        return WorldModelHolder.INSTANCE;
    }

    /**
     * refresh the world using message information parsed by the parser
     *
     * @param messageInfo the message
     */
    public void refresh(MessageInfo messageInfo) {
        this.messageInfo = messageInfo;
    }
}
