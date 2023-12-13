/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectojoseequipo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProyectoJoseEquipo {

    public static void main(String[] args) {
        // Preguntas
        String[] preguntas = {
            "¿Cuál es tu  favorita?",
            "¿Cuál es tu deporte favorito?",
            "¿Cuál es tu videojuego favorito?",
            "¿Cuál es tu cómic favorito?",
            "¿Cuál es tu serie favorita?"
        };

        // Mezclación de preguntas con el random
        Mezclas(preguntas);

        // Arrai de las respuestas
        String[] respuestas = new String[preguntas.length];

        
        Scanner scanner = new Scanner(System.in);

        // Aqui ponemos para que responda a las preguntas
        for (int i = 0; i < preguntas.length; i++) {
            System.out.print(preguntas[i] + " ");
            respuestas[i] = scanner.nextLine();
        }

        // Enseña las respuestas al usuario
        System.out.println("Tus respuestas:");
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println(preguntas[i] + " " + respuestas[i]);
        }
    }

    // Método para mezclar las preguntas de forma aleatoria
    private static void Mezclas(String[] preguntas) {
        Random random = new Random();
        for (int i = preguntas.length - 1; i > 0; i--) {
            int aleatorio = random.nextInt(i + 1);
            //Esto es para intercambiar preguntas
            String preguntiñas = preguntas[aleatorio];
            preguntas[aleatorio] = preguntas[i];
            preguntas[i] = preguntiñas;
        }
    }
}
    

