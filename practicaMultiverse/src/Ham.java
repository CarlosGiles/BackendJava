public class Ham extends Spiderman implements Skills{
    public Ham(int tierra,String nom,String traje,String armaP,String desc){
        super(tierra,nom,traje,armaP,desc);
    }
    public void presenta(Screen s){
        s.setVisible(true);
        s.showImage("presentaHam.gif");
        s.setBounds(200,25,1100,700);
    }
    public void balance(Screen s){
        s.cls();
        s.repaint();
        s.out(show(),"Helvetica",20,Colors.LighterPurple);
        s.out("\n¡Me balanceo con mi telapuercoaraña!\n");
        s.showImage("balanceHam.gif");
        s.setBounds(200,25,1100,700);
    }
    public void ataqueArmaP(Screen s) {
        s.cls();
        s.repaint();
        s.out(show(), "Helvetica", 20, Colors.LighterPurple);
        s.out("\n¡Te ataco con mazo\n");
        s.showImage("ataqueHam.gif");
        s.setBounds(200,25,1100,700);
    }
    public void telarana(Screen s) {
        s.cls();
        s.repaint();
        s.out(show(), "Helvetica", 20, Colors.LighterPurple);
        s.out("\n¡Prueba la telarana de Spider-Ham\n");
        s.showImage("telaHam.gif");
        s.setBounds(200,25,1100,700);
    }
}
