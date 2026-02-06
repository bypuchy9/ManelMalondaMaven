import com.github.lalyos.jfiglet.FigletFont;

public class Main {

    public static void main(String[] args) throws Exception {

        String texto = "Manel Malonda";
        String banner = FigletFont.convertOneLine(texto);

        System.out.println(banner);
    }
}