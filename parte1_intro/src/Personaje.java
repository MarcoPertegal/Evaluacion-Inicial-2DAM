import java.util.Arrays;
import java.util.Objects;

public class Personaje {
    String nombre;
    int puntosDeVida = 100;
    int puntosConseguidos = 0;
    int numHerramientas = 10;
    String []mochila = new String [numHerramientas];
    public Personaje(){

    }
    public Personaje(String nombre){
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return puntosDeVida == personaje.puntosDeVida && puntosConseguidos == personaje.puntosConseguidos && numHerramientas == personaje.numHerramientas && Objects.equals(nombre, personaje.nombre) && Arrays.equals(mochila, personaje.mochila);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre, puntosDeVida, puntosConseguidos, numHerramientas);
        result = 31 * result + Arrays.hashCode(mochila);
        return result;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", puntosDeVida=" + puntosDeVida +
                ", puntosConseguidos=" + puntosConseguidos +
                ", numHerramientas=" + numHerramientas +
                ", mochila=" + Arrays.toString(mochila) +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getPuntosConseguidos() {
        return puntosConseguidos;
    }

    public void setPuntosConseguidos(int puntosConseguidos) {
        this.puntosConseguidos = puntosConseguidos;
    }

    public int getNumHerramientas() {
        return numHerramientas;
    }

    public void setNumHerramientas(int numHerramientas) {
        this.numHerramientas = numHerramientas;
    }

    public String[] getMochila() {
        return mochila;
    }

    public void agregarHerramienta (String herramienta){
        herramienta = mochila[mochila.length+1];
    }

    public int recibirGolpe (int golpe){
        if (golpe > puntosDeVida){
            puntosDeVida -= golpe;
        }
        return puntosDeVida;
    }
    public int buscarPosicion(String botiquin){
        for (int i = 0; i < mochila.length; i++) {
            if ((mochila[i] == botiquin) && (puntosDeVida <= 100))
                puntosDeVida +=10;
        }
        return puntosDeVida;
    }
}
