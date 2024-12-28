package comportamentais.state.At1;

public class NewUserState extends State {
    public NewUserState(Chat chat) {
        super(chat);
        setMessage("New User");
        nextStage(new InitialState(chat));
    }
}
