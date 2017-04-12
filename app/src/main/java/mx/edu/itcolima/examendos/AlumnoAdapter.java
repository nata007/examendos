package mx.edu.itcolima.examendos;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

/**
 * Created by macbookprolate2011 on 03/06/16.
 */
public class AlumnoAdapter extends RecyclerView.Adapter<AlumnoAdapter.AlumnosViewHolder>{

    private List<Alumno> modeloalumnolist;

    public AlumnoAdapter(List<Alumno> modeloalumnolist) {
        this.modeloalumnolist = modeloalumnolist;
    }

    @Override
    public AlumnosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext())
                                .inflate(R.layout.item_row,parent,false);

        return new AlumnosViewHolder(view);
    }




    @Override
    public void onBindViewHolder(AlumnosViewHolder holder, int position) {
        holder.id.setText(modeloalumnolist.get(position).getId());
        holder.nombre.setText(modeloalumnolist.get(position).getNombre());
        holder.email.setText(modeloalumnolist.get(position).getEmail());
        holder.num_control.setText(modeloalumnolist.get(position).getNumeroControl());
        holder.telefono.setText(modeloalumnolist.get(position).getTelefono());
        holder.direccion.setText(modeloalumnolist.get(position).getDireccion());


    }

    @Override
    public int getItemCount() {
        return modeloalumnolist.size();
    }

    public static class AlumnosViewHolder extends RecyclerView.ViewHolder {

        public TextView nombre;
        public TextView id;
        public TextView email;
        public TextView num_control;
        public TextView telefono;
        public TextView direccion;

        public AlumnosViewHolder(View itemView) {
            super(itemView);
            id=(TextView) itemView.findViewById(R.id.id);
            nombre=(TextView) itemView.findViewById(R.id.nombre);
            email=(TextView) itemView.findViewById(R.id.email);
            num_control=(TextView) itemView.findViewById(R.id.num_control);
            telefono=(TextView) itemView.findViewById(R.id.telefono);
            direccion=(TextView) itemView.findViewById(R.id.direccion);


        }
    }


}
