package practicaMona;

public class Sake extends Mona{
    public String instrumento="Sake";
    public Sake(String nombre, String instrumento, String descripcion) {
        super(nombre, instrumento, descripcion);
    }
    @Override
    public String accion(){
        return
                "Me estoy sirviendo el "+instrumento;
    }
    public String showMessage(){
        return
                "\nnombre: "+nombre+"\ndescripcion: "+descripcion+"\n";
    }
}
