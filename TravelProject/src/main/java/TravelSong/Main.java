package TravelSong;

import song.Listener;
import song.Playlist;
import song.Song;

public class Main {
    public static void main(String[] args) {
        //create subject
        Playlist sharedPlaylist = new Playlist();

        //create observers
        ClientListener client1 = new ClientListener("Client 1");
        ClientListener client2 = new ClientListener("Client 2");
        Listener listener3 = new Listener("Client 3");
        
        //register observers to the subject
        sharedPlaylist.register(client1.getListener());
        sharedPlaylist.register(client2.getListener());
        sharedPlaylist.register(listener3);
        
        //now send message to subject
        sharedPlaylist.addSong(new Song("Song 3", 1));
        sharedPlaylist.addSong(new Song("Song 4", 2));
    }
}
