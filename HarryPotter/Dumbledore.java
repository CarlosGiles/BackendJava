package HarryPotter;

public class Dumbledore {
    public static void main(String[] args) {

        Mago mago=new Mago();
        mago.setGenero("el mago");
        mago.setNombre("Albus Dumbledore");
        mago.setCasa("Gryffindor");
        mago.setBoggart("el cuerpo de Ariana");
        mago.setPatrnus("Fenix");
        String msg="Soy "+mago.getGenero()+" "+mago.getNombre()+" con estas caracteristicas: ";
        msg+="\nSoy de la casa "+mago.getCasa()+", mi boggart es "+mago.getBoggart()+" y mi patronus es "+mago.getPatrnus();
        System.out.println(msg);
    }
}
