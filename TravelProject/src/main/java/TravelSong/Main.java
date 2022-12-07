package TravelSong;

import song.Playlist;

public class Main {
    public static void main(String[] args) {
        //create subject
        Playlist sharedPlaylist = new Playlist();

        //create observers
        ClientFriend client1 = new ClientFriend("Client 1");
        ClientFriend client2 = new ClientFriend("Client 2");
        ClientFriend client3 = new ClientFriend("Client 3");
        
        //register observers to the subject
        sharedPlaylist.register(client1);
        sharedPlaylist.register(client2);
        sharedPlaylist.register(client3);

        //attach observer to subject
        client1.setPlaylist(sharedPlaylist);
        client2.setPlaylist(sharedPlaylist);
        client3.setPlaylist(sharedPlaylist);

        //now send message to subject
        sharedPlaylist.broadcastSong("Song 3", 1);
        sharedPlaylist.broadcastSong("Song 4", 1);

    }
}
