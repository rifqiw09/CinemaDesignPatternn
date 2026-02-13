package cinema.model;

public class Movie implements Cloneable {

    private String title;
    private int duration;

    public Movie(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public Movie clone() {
        try {
            return (Movie) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
