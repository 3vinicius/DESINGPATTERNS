package comportamentais.state.At1;

import java.security.MessageDigest;

public abstract class State {
    private final Chat chat;

    private String message;

    public State(Chat chat) {
        this.chat = chat;
    }


    public void setMessage(String message) {
        this.message = message;
        this.setOldMessageInChat(message);
        System.out.println(this.message);
    };

    public void setOldMessageInChat(String message) {
        this.chat.setOldMessage(message);
    }

    public void nextStage(State newState){
        this.chat.setState(newState);
    };

    public Chat getChat() {
        return chat;
    }
}
