package datos_academicos;

import datos_persoais.DatosPersoais;

public class Alumno {
    public static int referencia;
    private float notTeorica,notPractica,boletins;
    private  DatosPersoais persoal;

    public Alumno() {
    }

    public Alumno(float notTeorica, float notPractica, float boletins, DatosPersoais persoal) {
        this.notTeorica = notTeorica;
        this.notPractica = notPractica;
        this.boletins = boletins;
        this.persoal = persoal;
    }


    public float getNotTeorica() {
        return notTeorica;
    }

    public float getNotPractica() {
        return notPractica;
    }

    public float getBoletins() {
        return boletins;
    }

    public DatosPersoais getPersoal() {
        return persoal;
    }


    public void setNotTeorica(float notTeorica) {
        this.notTeorica = notTeorica;
    }

    public void setNotPractica(float notPractica) {
        this.notPractica = notPractica;
    }

    public void setBoletins(float boletins) {
        this.boletins = boletins;
    }

    public void setPersoal(DatosPersoais persoal) {
        this.persoal = persoal;
    }

    @Override
    public String toString() {
        return "Alumno{" + "notTeorica=" + notTeorica + ", notPractica=" + notPractica + ", boletins=" + boletins + ", persoal=" + persoal +"nota media:"+acharNotaMedia()+'}';
    }
    public float acharNotaMedia(){
        return ( notTeorica*0.40f + notPractica * 0.40f + boletins*0.2f);
        
    }
  
    
}
