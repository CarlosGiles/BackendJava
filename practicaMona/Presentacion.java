package practicaMona;

public class Presentacion {
    public static void main(String[] args) {
        Mona octomod[]=new Mona[7];
        octomod[0]=new Mona("Octocat","instrumento","Soy la mascota de GitHub");
        octomod[1]=new Jetpack("Jacpacktocat","jackpack","Estoy volando con mi jackpack");
        octomod[2]=new Lucha("Luchadortocat","máscara","Vivo en el ring");
        octomod[3]=new Sake("Saketocat","botella","Me encanta beber");
        octomod[4]=new Tron("Gobble-o-tron","máquina","Machines on!");
        octomod[5]=new Miner("Minertocat","filtro","Amo el oro");
        octomod[6]=new TopGun("Topguntocat","avión","Soy el rey de los cielos");

        for (Mona octocats: octomod){
            System.out.println(octocats.accion());
            System.out.print(octocats.showMessage());
            System.out.println("------------------------------------------------");
        }
    }
}
