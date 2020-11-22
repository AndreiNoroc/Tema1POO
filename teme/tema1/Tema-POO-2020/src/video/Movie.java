package video;

import java.util.ArrayList;
import java.util.List;

public class Movie extends Video {
    private final int duration;
    private List<Double> ratings;
    private List<String> userName;

    public Movie(final String title, final int year, final ArrayList<String> genres, final ArrayList<String> cast, final int duration) {
        super(title, year, genres, cast);
        this.duration = duration;
        this.ratings = new ArrayList<>();
        this.userName = new ArrayList<>();
    }

    public void setRating(double grade, String name) {
        this.ratings.add(grade);
        this.userName.add(name);
    }

    public List<String> getuserName() { return userName; }
    public List<Double> getRating() {
        return ratings;
    }
    public int getDuration() {
        return duration;
    }
}
