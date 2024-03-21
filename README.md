import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "María", "Carlos", "Ana", "Luis"};
        String[] cursos = {"Matemáticas", "Física", "Química", "Biología", "Historia"};
        double[] notas = {95, 90, 85, 92, 88};

        double notaMayor = notas[0];
        double notaMenor = notas[0];
        String nombreMayor = nombres[0];
        String nombreMenor = nombres[0];
        double sumaNotas = 0;

        for (int i = 0; i < nombres.length; i++) {
            if (notas[i] > notaMayor) {
                notaMayor = notas[i];
                nombreMayor = nombres[i];
            }

            if (notas[i] < notaMenor) {
                notaMenor = notas[i];
                nombreMenor = nombres[i];
            }

            sumaNotas += notas[i];
        }

        double promedio = sumaNotas / nombres.length;

        JOptionPane.showMessageDialog(null,
            "Estudiante con la nota más alta:\n" +
            "Nombre: " + nombreMayor + "\n" +
            "Curso: " + cursos[0] + "\n" + // Suponiendo que todos los estudiantes están en el mismo curso
            "Nota: " + notaMayor + "\n\n" +

            "Estudiante con la nota más baja:\n" +
            "Nombre: " + nombreMenor + "\n" +
            "Curso: " + cursos[0] + "\n" + // Suponiendo
