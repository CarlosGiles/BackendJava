package practicaMona;

public class Jetpack extends Mona{
    public String instrumento="Jetpack";
    public Jetpack(String nombre, String instrumento, String descripcion) {
        super(nombre, instrumento, descripcion);
    }
    @Override
    public String accion(){
        return
                "Me estoy poniendo el "+instrumento;
    }
    public String showMessage(){
        return
                "\nnombre: "+nombre+"\ndescripcion: "+descripcion+"\n";
    }
}