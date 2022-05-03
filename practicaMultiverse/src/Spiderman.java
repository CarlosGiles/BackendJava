public class Spiderman {
    private int tierra;
    private String nom,traje,armaP,desc;
    public Spiderman(int tierra,String nom,String traje,String armaP,String desc){
        this.tierra=tierra;this.nom=nom;this.traje=traje;this.armaP=armaP;this.desc=desc;
    }
    public int getTierra(){  return tierra;  }
    public String getNom(){  return nom;  }
    public String getTraje(){  return traje;  }
    public String getArmaP(){  return armaP;  }
    public String getDesc(){  return desc;  }

    public boolean setTierra(int tierra){
        if(tierra>0){
            this.tierra=tierra;
            return true;
        }else
            return false;
    }
    public boolean setNom(String nom){
        if(!nom.isEmpty()){
            this.nom=nom;
            return true;
        }else
            return false;
    }
    public boolean setTraje(String traje){
        if(!traje.isEmpty()){
            this.traje=traje;
            return true;
        }else
            return false;
    }
    public boolean setArmaP(String armaP){
        if(!armaP.isEmpty()){
            this.armaP=armaP;
            return true;
        }else
            return false;
    }
    public boolean setDesc(String desc){
        if(!desc.isEmpty()){
            this.desc=desc;
            return true;
        }else
            return false;
    }
    public String show(){
        return
                "\nSoy "+nom+" de la Tierra # "+tierra+
                        "\nMi traje es "+traje+" y mi arma favorita "+armaP+
                        "\nAquí una breve descripción mía: "+desc;
    }
}
