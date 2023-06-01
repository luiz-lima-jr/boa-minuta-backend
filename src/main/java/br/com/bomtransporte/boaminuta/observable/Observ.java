package br.com.bomtransporte.boaminuta.observable;

import java.util.Observable;
import java.util.Observer;

public class Observ implements Observer {

    private Observable observable;

    public Observ(Observable observable){
        this.observable = observable;
    }

    @Override
    public void update(Observable o, Object arg) {
        arg.toString();
    }
}