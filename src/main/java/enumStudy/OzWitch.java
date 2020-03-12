package enumStudy;

public enum OzWitch {
    WEST("1"), NORTH("2"), EAST("3"), SOUTH("4");
    private String description;

    private OzWitch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        for (OzWitch s :
                OzWitch.values()) {
            System.out.println(s + " description : " + s.getDescription());
        }
    }
}
