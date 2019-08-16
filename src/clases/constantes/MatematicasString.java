package clases.constantes;

public enum MatematicasString {
    TITULO("Menu principal");

    MatematicasString(String texto) {
        this.texto = texto;
    }

    private String texto;

    public String getTexto() {
        return texto;
    }
}
