package vs;
 
import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;
 
@Path("/Multiplicacao/{op}/{op1}")
public class Multiplicacao {
   
    @GET
    public double calcula(@PathParam("op") String opStr, @PathParam("op1") String oqStr) {
        try {
            double op = Double.parseDouble(opStr);
            double op1 = Double.parseDouble(opStr);
        
            return op * op1;
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Operador inválido.");
        }
    }
}
