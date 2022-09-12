package app;

import io.jooby.annotations.*;

@Path("/bem-vindos")
public class Controller {

  @GET
  public String welcomeAll() {
    return "São todos/as Bem-vindos/as!";
  }

  @GET
  @Path("/912")
  public String welcome912() {
    return "Bem-vindos/as 912!";
  }

  @GET
  @Path("/922")
  public String welcome922() {
    return "Bem-vindos/as 922!";
  }
}