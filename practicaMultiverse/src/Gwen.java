public class Gwen extends Spiderman implements Skills{
    public Gwen(int tierra,String nom,String traje,String armaP,String desc){
        super(tierra,nom,traje,armaP,desc);
    }
    public void presenta(Screen s){
        s.setVisible(true);
        s.showImage("presesntaGwen.gif");
        s.setBounds(200,25,1100,700);
    }
    public void balance(Screen s){
        s.cls();
        s.repaint();
        s.out(show(),"Helvetica",20,Colors.LighterPurple);
        s.out("\n¡Me balanceo con mi traje!\n");
        s.showImage("ataqueGwen.gif");
        s.setBounds(200,25,1100,700);
    }
    public void ataqueArmaP(Screen s) {
        s.cls();
        s.repaint();
        s.out(show(), "Helvetica", 20, Colors.LighterPurple);
        s.out("\n¡Ataque multiple telaraña\n");
        s.showImage("telaGwen.gif");
        s.setBounds(200,25,1100,700);
    }
    public void telarana(Screen s) {
        s.cls();
        s.repaint();
        s.out(show(), "Helvetica", 20, Colors.LighterPurple);
        s.out("\n¡Alto ahí!\n");
        s.showImage("telaGwen2.gif");
        s.setBounds(200,25,1100,700);
    }
}
