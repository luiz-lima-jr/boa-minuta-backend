package br.com.bomtransporte.boaminuta.config;

import br.com.bomtransporte.boaminuta.exception.BoaMinutaBusinessException;
import br.com.bomtransporte.boaminuta.exception.SessaoInvalidaException;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse invalidArguments(MethodArgumentNotValidException ex) {
        var erros = ex.getBindingResult().getFieldErrors().stream().map(err -> err.getField() + " " + err.getDefaultMessage()).collect(Collectors.toList());
        return ErrorResponse.create(ex, HttpStatus.BAD_REQUEST, erros.toString());
    }

    @ExceptionHandler(value = {SessaoInvalidaException.class})
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ErrorResponse sessaoInvalida(SessaoInvalidaException ex) {
        return ErrorResponse.create(ex, HttpStatus.UNAUTHORIZED, ex.getMessage());
    }


    @ExceptionHandler(value = {BoaMinutaBusinessException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse erroNegocio(BoaMinutaBusinessException ex) {
        return ErrorResponse.create(ex, HttpStatus.BAD_REQUEST, ex.getMessage());
    }

    @ExceptionHandler(value = {BadCredentialsException.class})
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ErrorResponse deniedPermissionException(BadCredentialsException ex) {
        ex.printStackTrace();
        return ErrorResponse.create(ex, HttpStatus.FORBIDDEN, "Usuário ou senha inválidos");
    }


    @ExceptionHandler(value = {ConstraintViolationException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse constraintViolationException(ConstraintViolationException ex) {
        ex.printStackTrace();
        return ErrorResponse.create(ex, HttpStatus.BAD_REQUEST, ex.getMessage());
    }

    @ExceptionHandler(value = {Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse internalServerError(Exception ex) {
        ex.printStackTrace();
        return ErrorResponse.create(ex, HttpStatus.INTERNAL_SERVER_ERROR, "Ocorreu um erro interno no servidor");
    }
}