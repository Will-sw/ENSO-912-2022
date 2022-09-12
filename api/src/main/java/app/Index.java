package app;

import io.jooby.annotations.*;

@Path("/index")
public class Index {

  @GET
  @Path("/")
  public String index() {
    return "Bem-vindos/as a melhor API de  calculadora já feita. Aqui, teremos opções de soma, subtração, multiplicação e divisão, as 4 operações básicas pra melhorar seu dia a dia.";
  }
}
