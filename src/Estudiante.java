public class Estudiante {
    private Integer codigo_es;
    private String nombre_es;
    private String apellido_es;
    private String cedula_es;

    public Estudiante() {

    }
    public Estudiante(Integer codigo_es) {
        this.codigo_es = codigo_es;
    }

    public Estudiante(Integer codigo_es, String nombre_es) {
        this(codigo_es);
        this.nombre_es = nombre_es;
    }

    public Estudiante(Integer codigo_es, String nombre_es, String apellido_es) {
        this(codigo_es, nombre_es);
        this.apellido_es = apellido_es;
    }

    public Estudiante(Integer codigo_es, String nombre_es, String apellido_es, String cedula_es) {
        this(codigo_es, nombre_es, apellido_es);
        this.cedula_es = cedula_es;
    }

    // getter y setters


    public Integer getCodigo_es() {
        return codigo_es;
    }

    public void setCodigo_es(Integer codigo_es) {
        this.codigo_es = codigo_es;
    }

    public String getNombre_es() {
        return nombre_es;
    }

    public void setNombre_es(String nombre_es) {
        this.nombre_es = nombre_es;
    }

    public String getApellido_es() {
        return apellido_es;
    }

    public void setApellido_es(String apellido_es) {
        this.apellido_es = apellido_es;
    }

    public String getCedula_es() {
        return cedula_es;
    }

    public void setCedula_es(String cedula_es) {
        this.cedula_es = cedula_es;
    }
}
