import com.github.lalyos.jfiglet.FigletFont;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception, InterruptedIOException {

        String texto = "Manel Malonda";
        String banner = FigletFont.convertOneLine(texto);
        List<String> lines = new ArrayList<>();
        for (String line : banner.split("\n")) {
            lines.add(line);
        }
        lines.add("========== CURRICULUM VITAE: MANEL ==========");
        lines.add("--- DATOS PERSONALES Y CONTACTO ---");
        lines.add(" Edad:       18 años");
        lines.add(" Dirección:  Carrer Sinia N31, Grao de Gandia");
        lines.add(" Teléfono:   697412710");
        lines.add(" Vehículo:   Moto propia y coche");
        lines.add("--- PERFIL ---");
        lines.add(" Estudiante de Desarrollo de Aplicaciones Web.");
        lines.add(" Tengo ganas de trabajar ya que tengo mucho potencial");
        lines.add(" y quiero sacarlo.");
        lines.add("--- FORMACIÓN ACADÉMICA ---");
        lines.add(" * ESO");
        lines.add(" * Grado Medio SMX (Sistemas Microinformáticos y Redes)");
        lines.add("--- EXPERIENCIA LABORAL ---");
        lines.add(" * Mahico (Empresa de informática): 2 meses");
        lines.add(" * Instituto de Perugia (Erasmus): 1 mes");
        lines.add("--- IDIOMAS Y HABILIDADES ---");
        lines.add(" * Español: Nativo");
        lines.add(" * Inglés:  Nivel B1");
        lines.add(" * Fortalezas: Trabajo en equipo y comunicación.");
        lines.add("=============================================");
        lines.forEach(System.out::println);
        //punto 6
        Screen screen = new DefaultTerminalFactory().createScreen();
        screen.startScreen();
        screen.setCursorPosition(null);
    }

    //punto 7
    private static void drawFrame(Screen screen, List<String> lines, int yOffset) throws IOException {
        TerminalSize size = screen.getTerminalSize();
        int width = size.getColumns();
        int height = size.getRows();
        screen.clear();
        TextGraphics tg = screen.newTextGraphics();
        for (int i = 0; i < lines.size(); i++) {
            int y = yOffset + i;
            if (y < 0 || y >= height) continue;
            String line = lines.get(i);
            // Centrado horizontal (opcional, pero queda mejor)
            int x = Math.max(0, (width - line.length()) / 2);
            if (x >= width) continue;
            // Recorte simple si se sale por la derecha
            String visible = (line.length() > width) ? line.substring(0, width) :
                    line;
            tg.putString(x, y, visible);
        }
        screen.refresh();
    }

}