public class Materia {
    private Integer codigo_mat;
    private String nombre_mat;

    public Materia() {

    }

    public Materia(Integer codigo_mat) {
        this.codigo_mat = codigo_mat;
    }

    public Materia(Integer codigo, String nombre_mat) {
        this(codigo);
        this.nombre_mat = nombre_mat;
    }
    // getter y setters

    public Integer getCodigo_mat() {
        return codigo_mat;
    }

    public void setCodigo_mat(Integer codigo_mat) {
        this.codigo_mat = codigo_mat;
    }

    public String getNombre_mat() {
        return nombre_mat;
    }

    public void setNombre_mat(String nombre_mat) {
        this.nombre_mat = nombre_mat;
    }
}
