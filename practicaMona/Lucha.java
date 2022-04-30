package practicaMona;

public class Lucha extends Mona {
    public String instrumento = "Máscara";

    public Lucha(String nombre, String instrumento, String descripcion) {
        super(nombre, instrumento, descripcion);
    }

    @Override
    public String accion() {
        return
                "Me estoy poniendo la " + instrumento;
    }

    public String showMessage() {
        return
                "\nnombre: " + nombre + "\ndescripcion: " + descripcion + "\n";
    }
}