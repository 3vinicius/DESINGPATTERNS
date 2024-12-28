package comportamentais.state;

import comportamentais.state.At1.Chat;
import comportamentais.state.At1.DownloadState;

public class Main {
    public static void main(String[] args) {
        Chat chat = new Chat("test","vinicius","82");
        System.out.println(chat.getOldMessage());
        chat.setMessage("DOWNLOAD");
        chat.setState(new DownloadState(chat));
    }

}
