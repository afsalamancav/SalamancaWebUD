package controlador;

import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import modelo.AspiranteDAO;
import modelo.AspiranteDTO;

@Named("aspiranteBean")
@SessionScoped
public class AspiranteBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private AspiranteDTO aspirante;
    private AspiranteDAO dao;
    private List<AspiranteDTO> listaAspirantes;

    public AspiranteBean() {
        System.out.println("=== ASPIRANTE BEAN CREADO ===");
        this.dao = new AspiranteDAO();
        this.aspirante = new AspiranteDTO();
        this.listaAspirantes = new ArrayList<>();
        try {
            this.listaAspirantes = dao.obtenerTodos();
        } catch (Exception e) {
            System.out.println("=== ERROR EN DAO: " + e.getMessage());
        }
    }

    public String registrar() {
        dao.registrarAspirante(aspirante);
        listaAspirantes = dao.obtenerTodos();
        aspirante = new AspiranteDTO();
        return null;
    }

    public AspiranteDTO getAspirante() { return aspirante; }
    public void setAspirante(AspiranteDTO aspirante) { this.aspirante = aspirante; }
    public List<AspiranteDTO> getListaAspirantes() { return listaAspirantes; }
    public List<String> getProgramas() { return dao.obtenerProgramasOfertados(); }
}