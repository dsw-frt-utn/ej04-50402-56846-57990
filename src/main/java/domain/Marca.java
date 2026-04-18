
package domain;


public class Marca {
    protected String Nombre;
    protected String Pais;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public Marca(String Nombre, String Pais) {
        this.Nombre = Nombre;
        this.Pais = Pais;
    }

    public Marca() {
    }
    
}
