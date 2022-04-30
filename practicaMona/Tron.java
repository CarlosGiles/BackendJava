package practicaMona;

public class Tron extends Mona{
    public String instrumento="Máquina";
    public Tron(String nombre, String instrumento, String descripcion) {
        super(nombre, instrumento, descripcion);
    }
    @Override
    public String accion(){
        return
                "Me estoy prendiendo"+instrumento;
    }
    public String showMessage(){
        return
                "\nnombre: "+nombre+"\ndescripcion: "+descripcion+"\n";
    }
}
