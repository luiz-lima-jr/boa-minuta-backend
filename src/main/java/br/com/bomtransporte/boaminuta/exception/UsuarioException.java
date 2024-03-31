package br.com.bomtransporte.boaminuta.exception;

public class UsuarioException extends BoaMinutaBusinessException {
    public UsuarioException(String msg){
        super(msg);
    }
    public UsuarioException(String msg, Exception e){
        super(msg);
    }
}
