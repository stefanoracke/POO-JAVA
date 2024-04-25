public class App {
    public static void main(String[] args) throws Exception {
        String texto = "Esto es un texto asignado a una variable String";
        System.out.println(texto);

        int longitud = texto.length();
        System.out.println("La longitud de la cadena es: " + longitud);

        char caracter = texto.charAt(8);
        System.out.println("Caracter con charAt: " + caracter);

        String subString = texto.substring(6, longitud);
        System.out.println("Esto es una cadena acortada: " + subString);

        String minusculo = texto.toLowerCase();
        System.out.println("Texto pasado a minusculo: " + minusculo);

        String mayuscula = texto.toUpperCase();
        System.out.println("Texto pasado a mayuscula: " + mayuscula);

        int indice = texto.indexOf("variable");
        System.out.println(indice);

        String remplazo = texto.replace("texto", "hola mundo");
        System.out.println(remplazo);

        boolean contain = texto.contains("asignado");
        System.out.println("Has this text the word 'asignado'?: " + contain);

        String textoConEspacio = "   Hola   ";
        String textoSinEspacio = textoConEspacio.trim();
        System.out.println(textoConEspacio);
        System.out.println(textoSinEspacio);
    }
}
