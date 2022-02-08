package tasca8.nivell3;

public class Alumne {
    
    private String nom;
    private String curs;
    private int edad;
    private float nota;

    public Alumne(String nom, String curs, int edad, float nota) {
        this.nom = nom;
        this.curs = curs;
        this.edad = edad;
        this.nota = nota;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return String.format("Nom: %s\nEdat: %d\nCurs: %s\nNota: %.2f", this.nom, this.edad, this.curs, this.nota);
    }
    
    
}
