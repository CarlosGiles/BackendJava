package practicaMona;

public class Mona {
    public String nombre, instrumento, descripcion;
    public Mona(String nombre, String instrumento, String descripcion){
        this.nombre=nombre;
        this.instrumento=instrumento;
        this.descripcion=descripcion;
    }

    public String getNombre() {return nombre;}
    public String getInstrumento(){return instrumento;}
    public String getDescripcion(){return descripcion;}

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else
            return false;
    }
    public boolean setInstrumento(String instrumento){
        if(!instrumento.isEmpty()){
            this.instrumento=instrumento;
            return true;
        }else
            return false;
    }
    public boolean setDescripcion(String descripcion){
        if(!descripcion.isEmpty()){
            this.descripcion=descripcion;
            return true;
        }else
            return false;
    }
    public String accion(){
        return "Yo no uso "+instrumento;
    }
    public String showMessage(){
        return
                "\nnombre: "+nombre+"\ndescripcion: "+descripcion+"\n";
    }
}
