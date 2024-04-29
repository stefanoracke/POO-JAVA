public class Major {
    String name;
    int duration;
    int start_year;
    boolean ended;

    public Major(String name, int duration, int start_year, boolean ended) {
        this.name = name;
        this.duration = duration;
        this.start_year = start_year;
        this.ended = ended;
    }

    String infoMajor() {
        if (ended)
            return "Es egresado de la carrera de " + name;
        return "Estudia " + name;
    }
}
