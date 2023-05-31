import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolver;
/**
 * Write a description of class ParameterResolver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class EtapaParameterResolver implements ParameterResolver {

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
        return parameterContext.getParameter().getType().equals(Etapa.class);
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
        return new Etapa("Etapa 1", Dificultad.SENCILLA, Distancia.CORTA);
    }
}
