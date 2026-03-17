import javax.swing.*;
import java.awt.*;

class Example3 {
    private String name;
    private String location;
    private String programmes;
    private String affilation;

    public Example3(String name, String location, String programmes, String affilation){
        this.name = name;
        this.location = location;
        this.programmes = programmes;
        this.affilation = affilation;
    }

    public String getName() { return name; }
    public String getLocation() { return location; }
    public String getProgrammes() { return programmes; }
    public String getAffilation() { return affilation; }

    public String toHTML(int studentCount){
        return "<html><div style='text-align:center;'>"
                + "<h2>" + name + "</h2>"
                + "<p>Location: " + location + "</p>"
                + "<p>Programmes: " + programmes + "</p>"
                + "<p>Affiliated to: " + affilation + "</p>"
                + "<hr>"
                + "<p style='color: green;'><b>Students:</b> " + studentCount + "</p>"
                + "</div></html>";
    }
}

