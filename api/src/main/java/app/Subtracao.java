package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/subtracao/{op}/{oq}")
public class Subtracao {
    
    @GET
    public double calcula(@PathParam("op") String opStr, @PathParam("oq") String oqStr) {
        try {
            double op = Double.parseDouble(opStr);
            double oq = Double.parseDouble(oqStr);
            return op - oq;
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Operador inválido.");
        }
    }
}