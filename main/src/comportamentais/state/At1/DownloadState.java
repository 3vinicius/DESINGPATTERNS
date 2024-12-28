package comportamentais.state.At1;

public class DownloadState extends State {
    public DownloadState(Chat chat) {
        super(chat);
        setMessage("Downalod State");
        if (isValidMenssageMenu())nextStage(new InitialState(chat));
    }

    private Boolean isValidMenssageMenu() {
        return getChat().getMessage().toUpperCase() == "MENU ";
    }

}
