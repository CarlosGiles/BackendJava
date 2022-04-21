package HarryPotter;

public class Malfoy {
    public static void main(String[] args) {

        Mago mago=new Mago();
        mago.setGenero("el mago");
        mago.setNombre("Draco Malfoy");
        mago.setCasa("Slytherin");
        mago.setBoggart("Lord Voldemort");
        mago.setPatrnus("desconocido");
        String msg="Soy "+mago.getGenero()+" "+mago.getNombre()+" con estas caracteristicas: ";
        msg+="\nSoy de la casa "+mago.getCasa()+", mi boggart es "+mago.getBoggart()+" y mi patronus es "+mago.getPatrnus();
        System.out.println(msg);
    }
}
