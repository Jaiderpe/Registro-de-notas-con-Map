import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> notasEstudiantes = new HashMap<>();

        // 1. Pedir la cantidad de estudiantes
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        // 2. Solicitar nombres y notas
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la nota de " + nombre + ": ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); // Limpiar buffer
            notasEstudiantes.put(nombre, nota);
        }

        // 3. Mostrar la lista completa
        System.out.println("\nLista de estudiantes y sus notas:");
        for (Map.Entry<String, Double> entry : notasEstudiantes.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // 4. Buscar la nota de un estudiante
        System.out.print("\nIngrese el nombre del estudiante para buscar su nota: ");
        String nombreBuscar = scanner.nextLine();
        if (notasEstudiantes.containsKey(nombreBuscar)) {
            System.out.println("La nota de " + nombreBuscar + " es: " + notasEstudiantes.get(nombreBuscar));
        } else {
            System.out.println("Estudiante no encontrado.");
        }

        // 5. Encontrar la nota más alta y el mejor estudiante
        String mejorEstudiante = "";
        double mejorNota = 0;
        for (Map.Entry<String, Double> entry : notasEstudiantes.entrySet()) {
            if (entry.getValue() > mejorNota) {
                mejorNota = entry.getValue();
                mejorEstudiante = entry.getKey();
            }
        }

        System.out.println("\nEl estudiante con mejor rendimiento es " + mejorEstudiante + " con una nota de " + mejorNota);

        scanner.close();
    }
}
