package datos_persoais;

public class DatosPersoais {
    private String nome,correoE,telefono;

    public DatosPersoais() {
    }

    public DatosPersoais(String nome, String correoE, String telefono) {
        this.nome = nome;
        this.correoE = correoE;
        this.telefono = telefono;
    }

    public String getNome() {
        return nome;
    }

    public String getCorreoE() {
        return correoE;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "DatosPersoais{" + "nome=" + nome + ", correoE=" + correoE + ", telefono=" + telefono + '}';
    }
    
}
