package practicaMona;

public class Miner extends Mona{
    public String instrumento="filtro";
    public Miner(String nombre, String instrumento, String descripcion) {
        super(nombre, instrumento, descripcion);
    }
    @Override
    public String accion(){
        return
                "Me estoy preparando el "+instrumento;
    }
    public String showMessage(){
        return
                "\nnombre: "+nombre+"\ndescripcion: "+descripcion+"\n";
    }
}
