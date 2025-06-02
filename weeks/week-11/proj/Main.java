/**
 * @author Anna Scribner
 * @version March 12, 2025
 * <p>
 * The Main class to create the MusicTrack object and store in ArrayList, handle the data in the ArrayList, and display results
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<MusicTrack> musicsILike = new ArrayList<>();
        musicsILike.add(new MusicTrack("Olivia Rodrigo", "Deja Vu"));
        musicsILike.add(new MusicTrack("Olivia Rodrigo", "Good 4 u"));
        musicsILike.add(new MusicTrack("Olivia Rodrigo", "Drivers License"));
        musicsILike.add(new MusicTrack("Legião Urbana", "Faroeste Caboclo"));
        musicsILike.add(new MusicTrack("Nickelback", "How You Remind Me"));

        ArrayList<MusicTrack> musicsMyFriendsLike = new ArrayList<>();
        musicsMyFriendsLike.add(new MusicTrack("Bruno Mars", "Talking To The Moon"));
        musicsMyFriendsLike.add(new MusicTrack("ColdPlay", "Paradise"));
        musicsMyFriendsLike.add(new MusicTrack("NF", "If You Want Love"));
        musicsMyFriendsLike.add(new MusicTrack("Henrique & Juliano", "Aquela Pessoa"));
        musicsMyFriendsLike.add(new MusicTrack("Eminem", "My Darling"));
        musicsMyFriendsLike.add(new MusicTrack("Train", "Drops Of Jupiter"));

        musicsMyFriendsLike.remove(1);

        ArrayList<MusicTrack> partyList = new ArrayList<>();
        partyList.addAll(musicsILike);
        partyList.addAll(musicsMyFriendsLike);

        Random random = new Random();
        for (MusicTrack musicTrack : partyList) {
            int randomNumberWithBound = random.nextInt(101);
            musicTrack.setTrackOrder(randomNumberWithBound);
            System.out.println(musicTrack);
        }

        Collections.sort(partyList);

//        // display party list
//        System.out.println("""
//                ----------------
//                Party PlayList
//                ----------------""");
//
//        for (int i = 0; i < partyList.size(); i++) {
//            System.out.println(partyList.get(i));
//        }

    }
}
