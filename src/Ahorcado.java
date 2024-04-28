import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        // Clase scaner para escribir
        Scanner scanner = new Scanner(System.in);

        //Cambiar las palabras para agregar nuevas
        String[] gameWords = { "bicicleta", "manzana", "avión", "computadora", "silla", "libro", "futbol", "musica",
                "perro", "montaña" };

        // Creo un objeto Random
        Random rand = new Random();
        // Genero umero entero aleatorio
        int randomNumber = rand.nextInt(gameWords.length) + 1;


        // Asignaciones
        //Utilizo el random para generar la palabra
        String secretWord = gameWords[randomNumber];
        int maxTries = 7;
        int currentTry = 0;
        boolean isGuest = false;

        // Arreglos
        char[] wordsGuest = new char[secretWord.length()];

        // Estructura de control: Iterativo
        for (int i = 0; i < wordsGuest.length; i++) {
            wordsGuest[i] = '_';
        }

        while (!isGuest && currentTry < maxTries) {
            System.out.println("Palabra a adivinar: " + String.valueOf(wordsGuest));

            System.out.println("Introduce una letra:");

            char letra = Character.toLowerCase(scanner.next().charAt(0));

            // Chek if is correct the assigned word
            boolean isCorrectWord = false;
            for (int i = 0; i < secretWord.length(); i++) {
                // Estructura de control condicional
                if (secretWord.charAt(i) == letra) {
                    wordsGuest[i] = letra;
                    isCorrectWord = true;
                }
            }

            if (!isCorrectWord) {
                currentTry++;
                System.err.println("!Incorrecto! Te quedan " + (maxTries - currentTry) + " intentos.");
            }

            if (String.valueOf(wordsGuest).equals(secretWord)) {
                isGuest = true;
                System.out.println("¡Felicidades has adivinado la palabra secreta: " + secretWord);
            }
        }

        if (!isGuest) {
            System.err.println("Game Over - Te has quedado sin intentos.");
        }

        scanner.close();
    }
}
