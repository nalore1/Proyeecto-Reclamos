package cl.accenture.programatufuturo.proyecto.model;

public class Estado {

    private int id;
    private String nombre;

    public Estado(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

}
