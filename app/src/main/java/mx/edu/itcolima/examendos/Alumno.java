package mx.edu.itcolima.examendos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Alumno {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("numero_control")
    @Expose
    private String numeroControl;
    @SerializedName("telefono")
    @Expose
    private String telefono;
    @SerializedName("direccion")
    @Expose
    private String direccion;

    /**
     * No args constructor for use in serialization
     *
     */
    public Alumno() {
    }

    /**
     *
     * @param nombre
     * @param id
     * @param direccion
     * @param numeroControl
     * @param email
     * @param telefono
     */
    public Alumno(String id, String nombre, String email, String numeroControl, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.numeroControl = numeroControl;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     * The nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     * The email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     * The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     * The numeroControl
     */
    public String getNumeroControl() {
        return numeroControl;
    }

    /**
     *
     * @param numeroControl
     * The numero_control
     */
    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    /**
     *
     * @return
     * The telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     * The telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     *
     * @return
     * The direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     *
     * @param direccion
     * The direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


}