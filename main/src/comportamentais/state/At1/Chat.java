package comportamentais.state.At1;

public class Chat {
    private String name;
    private String message;
    private String number;
    private String oldMessage;

    private State state;

    public Chat(String message, String name, String number) {
        this.message = message;
        this.name = name;
        this.number = number;
        this.state = new NewUserState(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void chageState(State state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public String getOldMessage() {
        return oldMessage;
    }

    public void setOldMessage(String oldMessage) {
        this.oldMessage = oldMessage;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
