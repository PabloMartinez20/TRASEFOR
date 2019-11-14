
package clases;


public class Clientes {
    int Rut;
        String RazonSocial;
        String Direccion;
        String Ciudad;
        String Comuna;

    public Clientes() {
        this.Rut = (0);
        this.RazonSocial = ("");
        this.Direccion = ("");
        this.Ciudad = ("");
        this.Comuna = ("");
    }
        
        
        

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getComuna() {
        return Comuna;
    }

    public void setComuna(String Comuna) {
        this.Comuna = Comuna;
    }
    
    
}
