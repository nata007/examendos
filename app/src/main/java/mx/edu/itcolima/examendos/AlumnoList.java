package mx.edu.itcolima.examendos;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class AlumnoList {

    @SerializedName("alumno")
    @Expose
    private List<Alumno> alumno = new ArrayList<Alumno>();



    /**
     *
     * @param alumno
     */
    public AlumnoList(List<Alumno> alumno) {
        this.alumno = alumno;
    }

    /**
     *
     * @return
     * The alumno
     */
    public List<Alumno> getAlumno() {
        return alumno;
    }

    /**
     *
     * @param alumno
     * The alumno
     */
    public void setAlumno(List<Alumno> alumno) {
        this.alumno = alumno;
    }


}



