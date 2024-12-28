package comportamentais.state.At1;

public class InitialState extends State{

    public InitialState(Chat chat) {
        super(chat);
        setMessage("Initial State");
        if (isValidMensageDownload()) nextStage(new DownloadState(chat));
    }


    private Boolean isValidMensageDownload() {
        String result = getChat().getMessage().toUpperCase();
        return result == "DOWNLOAD";
    }

}
