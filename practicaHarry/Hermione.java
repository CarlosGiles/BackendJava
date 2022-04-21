package practicaHarry;

public class Hermione {
    public static void main(String[] args) {

        Mago mago=new Mago();
        mago.setGenero("la bruja");
        mago.setNombre("Hermione Granger");
        mago.setCasa("Gryffindor");
        mago.setBoggart("McGonagall");
        mago.setPatrnus("Nutria");
        String msg="Soy "+mago.getGenero()+" "+mago.getNombre()+" con estas caracteristicas: ";
        msg+="\nSoy de la casa "+mago.getCasa()+", mi boggart es "+mago.getBoggart()+" y mi patronus es "+mago.getPatrnus();
        System.out.println(msg);
    }
}
