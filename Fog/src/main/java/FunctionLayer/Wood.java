package FunctionLayer;

/**
 * Klassen bruges til at holde navn og id for træ så det kan sendes vider sammen
 */
public class Wood {

    private int id;
    private String name;

    public Wood(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
