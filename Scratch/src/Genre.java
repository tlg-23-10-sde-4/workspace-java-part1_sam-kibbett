enum Genre {
    HORROR          ("Horror"),
    HISTORICAL      ("Historical"),
    ACTION          ("Action"),
    COMEDY          ("Comedy"),
    SPORTS_ROMANCE  ("Sports r\"omance"),
    WESTERN         ("Western");

    private final String display;

    Genre(String display) {
        this.display = display;
        System.out.println("Genre ctor called");
    }

    public String display() {
        return display;
    }

    @Override
    public String toString() {
        return display();
    }
}
