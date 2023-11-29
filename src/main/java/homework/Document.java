package homework;

public class Document {
    private long id;
    private String text;

    public Document(long id, String text) {
        this.id = id;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }


}
