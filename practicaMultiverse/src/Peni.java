public class Peni extends Spiderman implements Skills{
    public Peni(int tierra,String nom,String traje,String armaP,String desc){
        super(tierra,nom,traje,armaP,desc);
    }
    public void presenta(Screen s){
        s.setVisible(true);
        s.showImage("presentaPeni.gif");
        s.setBounds(200,25,1100,700);
    }
    public void balance(Screen s){
        s.cls();
        s.repaint();
        s.out(show(),"Helvetica",20,Colors.LighterPurple);
        s.out("\n¡Vuelo dentro de SP/DR!\n");
        s.showImage("Peni.gif");
        s.setBounds(200,25,1100,700);
    }
    public void ataqueArmaP(Screen s) {
        s.cls();
        s.repaint();
        s.out(show(), "Helvetica", 20, Colors.LighterPurple);
        s.out("\n¡Te ataco con SP/DR!\n");
        s.showImage("Peni.gif");
        s.setBounds(200,25,1100,700);
    }
    public void telarana(Screen s) {
        s.cls();
        s.repaint();
        s.out(show(), "Helvetica", 20, Colors.LighterPurple);
        s.out("\n¡Prueba la telarana de SP/DR\n");
        s.showImage("Peni.gif");
        s.setBounds(200,25,1100,700);
    }
}
