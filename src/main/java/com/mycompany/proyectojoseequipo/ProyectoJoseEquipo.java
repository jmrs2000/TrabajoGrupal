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
            "¿Cuál es tu comida favorita?",
            "¿Cuál es tu deporte favorito?",
            "¿Cuál es tu videojuego favorito?",
            "¿Cuál es tu cómic favorito?",
            "¿Cuál es tu serie favorita?"
        };

        // Mezclar las preguntas de forma aleatoria antes de presentarlas
        mezclarPreguntas(preguntas);

        // Declaración de un array para almacenar las respuestas del usuario
        String[] respuestas = new String[preguntas.length];

        // Scanner para obtener las respuestas del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que responda cada pregunta
        for (int i = 0; i < preguntas.length; i++) {
            System.out.print(preguntas[i] + " ");
            respuestas[i] = scanner.nextLine();
        }

        // Imprimir las respuestas del usuario
        System.out.println("Tus respuestas:");
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println(preguntas[i] + " " + respuestas[i]);
        }
    }

    // Método para mezclar las preguntas de forma aleatoria
    private static void mezclarPreguntas(String[] preguntas) {
        Random random = new Random();
        for (int i = preguntas.length - 1; i > 0; i--) {
            int aleatorio = random.nextInt(i + 1);
            // Intercambiar preguntas[index] con preguntas[i]
            String preguntiñas = preguntas[aleatorio];
            preguntas[aleatorio] = preguntas[i];
            preguntas[i] = preguntiñas;
        }
    }
}
    

