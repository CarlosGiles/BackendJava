package practicaHarry;

class Persona{

    public String genero, nombre;

    public String getGenero(){  return genero;  }
    public String getNombre(){  return nombre;  }

    public void setGenero(String genero){  this.genero=genero;  }
    public void setNombre(String nombre){  this.nombre=nombre;  }

}

class Mago extends Persona{
    public String casa, boggart, patrnus;

    public String getCasa(){  return casa;  }
    public String getBoggart(){  return  boggart;  }
    public String getPatrnus(){  return patrnus;  }

    public void setCasa(String casa){  this.casa=casa;  }
    public void setBoggart(String boggart){  this.boggart=boggart;  }
    public void setPatrnus(String patrnus){  this.patrnus=patrnus;  }

}

public class Harry extends Mago {
    public static void main(String[] args) {

        Mago mago=new Mago();
        mago.setGenero("el mago");
        mago.setNombre("Harry James Potter");
        mago.setCasa("Gryffindor");
        mago.setBoggart("Dementorn");
        mago.setPatrnus("Ciervon");
        String msg="Soy "+mago.getGenero()+" "+mago.getNombre()+" con estas caracteristicas: ";
        msg+="\nSoy de la casa "+mago.getCasa()+", mi boggart es "+mago.getBoggart()+" y mi patronus es "+mago.getPatrnus();
        System.out.println(msg);
    }
}
