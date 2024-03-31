package br.com.bomtransporte.boaminuta.exception;


public class BoaMinutaBusinessException extends Exception {
    public BoaMinutaBusinessException(String msg){
        super(msg);
    }
    public BoaMinutaBusinessException(String msg, Exception e ){
        super(msg, e);
    }
}
