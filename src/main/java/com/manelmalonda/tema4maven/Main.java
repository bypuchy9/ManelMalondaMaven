import com.github.lalyos.jfiglet.FigletFont;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;

import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) throws Exception {

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
}