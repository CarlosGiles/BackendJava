package practicaMona;

public class TopGun extends Mona{
    public String instrumento="avión";
    public TopGun(String nombre, String instrumento, String descripcion) {
        super(nombre, instrumento, descripcion);
    }
    @Override
    public String accion(){
        return
                "Me estoy subiendo al "+instrumento;
    }
    public String showMessage(){
        return
                "\nnombre: "+nombre+"\ndescripcion: "+descripcion+"\n";
    }
}
