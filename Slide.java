import java.util.LinkedList;

public class Slide {
    boolean alignment;   //H or V
    int numTags;    //Number of Tags

    public Slide(boolean alignment, int numtags){
        this.alignment = alignment;
        this.numTags = numtags;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public int getNumTags() {
        return numTags;
    }

    public void setNumTags(int numTags) {
        this.numTags = numTags;
    }
}
