package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 34;
        cliente.telefono = 5557894;
        cliente.nombre = "Darío Pérez";
        cliente.credito = 7000;
        System.out.println("Mi nombre es " + cliente.nombre + ". Tengo " + cliente.edad + " años. Mi teléfono es " + cliente.telefono + ", y tengo " + cliente.credito + " en mi cuenta crediticia.");
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    double credito;
}

final class Trabajador extends Persona {
    double salario;
}