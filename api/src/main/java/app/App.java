package vs;
 
import io.jooby.Jooby;
 
public class App extends Jooby {
 
  {
    mvc(new Index());
    mvc(new Multiplicacao());
  }
 
  public static void main(final String[] args) {
    runApp(args, App::new);
  }
 
}