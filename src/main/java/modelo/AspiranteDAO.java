package modelo;

import java.util.ArrayList;
import java.util.List;

public class AspiranteDAO {
	// Lista para los aspirantes que se registren
    private static List<AspiranteDTO> listaAspirantes = new ArrayList<>();
    // Lista para los programas académicos
    private static List<String> programas = new ArrayList<>();

    public AspiranteDAO() {
        if (programas.isEmpty()) {
            programas.add("Ingeniería de Sistemas");
            programas.add("Ingeniería Industrial");
            programas.add("Matemática");
            programas.add("Administración de empresas");
            programas.add("Derecho");
            programas.add("Ingeniería Temática");
        }
    }


    public void registrarAspirante(AspiranteDTO aspirante) {
        listaAspirantes.add(aspirante);
    }

    public List<AspiranteDTO> obtenerTodos() {
        return listaAspirantes;
    }

    public List<String> obtenerProgramasOfertados() {
        return programas;
    }
}
