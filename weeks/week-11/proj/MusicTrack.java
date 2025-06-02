/**
 * @author Anna Scribner
 * @version March 21, 2025
 * <p>
 * A class that maintains three pieces of data: an artist, a title, and an integer for track order
 */

public class MusicTrack implements Comparable<MusicTrack> {
    private String artist;
    private String title;
    private int trackOrder;

    /**
     * Constructor that creates the MusicTrack with an artist and a title of a music
     */
    public MusicTrack(String artist, String title) {
        setArtist(artist);
        setTitle(title);
        this.trackOrder = 0;
    }

    /**
     * Method to set the artist
     *
     * @param artist
     *
     * @throw new IllegalArgumentException if the artist parameter is empty or null
     */
    public void setArtist(String artist) {
        if (artist == null || artist.isEmpty()) {
            throw new IllegalArgumentException("Artist cannot be empty/null");
        }
        this.artist = artist;
    }

    /**
     * Method to set the title
     *
     * @param title
     *
     * @throw new IllegalArgumentException if the title parameter is empty or null
     */
    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty/null");
        }
        this.title = title;
    }

    /**
     * method to set track order
     *
     * @param trackOrder
     *
     * @throw new IllegalArgumentException if the trackOrder parameter is less than 0 or bigger than 100
     */
    public void setTrackOrder(int trackOrder) {
        if (trackOrder < 0 || trackOrder > 100) {
            throw new IllegalArgumentException("Track Order out of bound (0-100)");

        }
        this.trackOrder = trackOrder;
    }

    /**
     * Method to get the artist
     *
     * @return artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Method to get the title
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Method to get the trackOrder
     *
     * @return trackOrder
     */
    public int getTrackOrder() {
        return trackOrder;
    }

    /**
     * Method to compare two objects
     *
     * @param other the object to be compared.
     *
     * @return the TrackOrder in ascending order
     */
    @Override
    public int compareTo(MusicTrack other) {
        return this.trackOrder - other.trackOrder;
    }

    /**
     * @return a formated string
     */
    @Override
    public String toString() {
        return String.format("%2d.  %s  --  %s", trackOrder, title, artist);
    }
}
