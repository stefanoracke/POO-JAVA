public class Major {
    String name;
    int duration;
    int start_year;
    boolean ended;

    String infoMajor(){
        if(ended) return "Es egresado de la carrera de " + name;
        return "Estudia " + name;
    }
}
