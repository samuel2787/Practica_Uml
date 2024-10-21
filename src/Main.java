import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// se debe asignar un codigo a lo que creemos

        Universidad u_1 = new Universidad();
        Scanner sc = new Scanner(System.in);

        u_1.setNombre_uni(JOptionPane.showInputDialog(null,"Ingrese el nombre de la Universidad"));

        System.out.println(u_1.caracteristicas());







    }
}