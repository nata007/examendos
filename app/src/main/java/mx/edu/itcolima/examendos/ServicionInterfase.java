package mx.edu.itcolima.examendos;

import retrofit.Call;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;

/**
 * Created by macbookprolate2011 on 03/06/16.
 */
public interface ServicionInterfase  {

    @GET("consultar")
    Call<AlumnoList>consultar();

    @FormUrlEncoded
    @POST("insertar")
    Call<AlumnoList> insertar(@Field("nombre") String nombre,
                             @Field("email") String email,
                             @Field("numero_control") String num_control,
                             @Field("telefono") String telefono,
                             @Field("direccion") String direccion);


}
