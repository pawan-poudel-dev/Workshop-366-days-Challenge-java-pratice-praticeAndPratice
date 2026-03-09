public class CollegeInfo {

    private String name;
    private String location;
    private String programmes;
    private String affiliation;

    public CollegeInfo(String name, String location, String programmes, String affiliation){
        this.name = name;
        this.location = location;
        this.programmes = programmes;
        this.affiliation = affiliation;
    }
    public String getName(){
        return name;
    }

    public String toHTML() {
        return "<html><div style=’text-align:center;’>"
                + "<h2>" + name + "</h2>"
                + "<p>Location: " + location + "</p>"
                + "<p>Programmes: " + programmes + "</p>"
                + "<p>Affiliated to: " + affiliation + "</p>"
                + "</div></html>";
    }
}