import javax.print.attribute.standard.Media;

public class Media extends javax.print.attribute.standard.Media {
    private String name;

    public Media(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Media{" +
                "name='" + name + '\'' +
                '}';
    }
}
