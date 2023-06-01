package br.com.bomtransporte.boaminuta.exception;

public class UsuarioExistenteException extends BoaMinutaBusinessException {
    public UsuarioExistenteException(String msg){
        super(msg);
    }
}
