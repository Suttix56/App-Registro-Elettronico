package gui;

import Controllore.Controllore;

public class Gui {
    private final Controllore controllore;

    public Gui(Controllore controllore){
        this.controllore = controllore;
    }

    public void start(){
        
    }

    public static void main(String[] args) {
        new Gui(new Controllore()).start();
    }
}
