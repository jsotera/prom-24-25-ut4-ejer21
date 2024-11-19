package es.masanz.ut4.ajedrez.app;

import es.masanz.ut4.ajedrez.util.Configuracion;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AjedrezApp extends Application {

    public static void main(String[] args) {
        // Este metodo existe porque extendemos Application, pero no se ve
        // Basicamente, acaba llamando al metodo start() de abajo
        // NO TOCAR
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Pane root = crearGUI();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Dibujando un tablero de ajedrez");
        stage.setResizable(false);
        stage.show();
    }

    private Pane crearGUI() {
        Pane panel = new Pane();
        Canvas canvas = new Canvas(Configuracion.ANCHO_CANVAS, Configuracion.ALTO_CANVAS);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Configuracion.NEGRO);
        gc.fillRect(0, 0, Configuracion.ANCHO_CANVAS, Configuracion.ALTO_CANVAS);
        dibujarAjedrez(gc);
        panel.getChildren().add(canvas);
        return panel;
    }

    private void dibujarAjedrez(GraphicsContext gc) {
        int coorX = 0;
        int coorY = 0;
        for (int fila = 1; fila <= 8; fila++) {
            coorX = 0;
            for (int columna = 1; columna <= 8; columna++) {
                if( ( fila + columna ) % 2 == 0 ){
                    gc.setFill(Configuracion.AZUL);
                } else {
                    gc.setFill(Configuracion.BLANCO);
                }
                gc.fillRect(coorX, coorY, Configuracion.ANCHO_CASILLA, Configuracion.ANCHO_CASILLA);
                coorX = coorX + 50;
            }
            coorY = coorY + 50;
        }




    }
}
