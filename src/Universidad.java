public class Universidad {
    //declaracion de atributos
    private Integer codigo_uni;
    private String nombre_uni;

    public Universidad() {

    }
    public Universidad(Integer codigo_uni) {
        this.codigo_uni = codigo_uni;
    }

    public Universidad(Integer codigo_uni, String nombre_uni) {
        this(codigo_uni);
        this.nombre_uni = nombre_uni;
    }
    // getter y setters

    public Integer getCodigo_uni() {
        return codigo_uni;
    }

    public void setCodigo_uni(Integer codigo_uni) {
        this.codigo_uni = codigo_uni;
    }

    public String getNombre_uni() {
        return nombre_uni;
    }

    public void setNombre_uni(String nombre_uni) {
        this.nombre_uni = nombre_uni;
    }

    public String caracteristicas() {
        StringBuilder sb = new StringBuilder();
        sb.append("Universidad: " + this.nombre_uni + " \n");
        //sb.append("Su codigo: " + this.codigo_uni + "\n");

        return sb.toString();
    }
}
