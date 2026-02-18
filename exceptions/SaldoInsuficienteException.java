package banco.exceptions;

public class SaldoInsuficienteException extends BusinessException {

    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
