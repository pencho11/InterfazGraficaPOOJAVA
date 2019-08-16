package clases.constantes;

public enum MatematicasEnteros {
    CERO(0);

    private int valor;

     MatematicasEnteros(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
