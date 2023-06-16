package br.com.bomtransporte.boaminuta.config;

import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.exception.SessaoInvalidaException;
import br.com.bomtransporte.boaminuta.exception.UsuarioExistenteException;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ErrorResponse internalServerError(Exception ex, HttpServletResponse response) {
        ex.printStackTrace();
        setStatus(ex, response);
        return ErrorResponse.create(ex, HttpStatus.resolve(response.getStatus()), ex.getMessage());
    }

    private void setStatus(Exception e, HttpServletResponse response){
        if(e instanceof BoaMinutaBusinessException
                || e instanceof ConstraintViolationException
                || e instanceof UsuarioExistenteException){
            response.setStatus(400);
        } else if(e instanceof BadCredentialsException){
            response.setStatus(401);
        } else {
            response.setStatus(500);
        }
    }
}