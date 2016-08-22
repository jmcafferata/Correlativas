package com.jmcafferata.correlativas;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class UBA_FSOC_CP extends Carrera {

    public static final Parcelable.Creator<Carrera> CREATOR = new Parcelable.Creator<Carrera>() {
        @Override
        public Carrera createFromParcel(Parcel in) {
            return new Carrera(in);
        }

        @Override
        public Carrera[] newArray(int size) {
            return new Carrera[size];
        }
    };





    public UBA_FSOC_CP(String nombre) {
        Materia _551 = new Materia(1,0);
        Materia _552 = new Materia(2,0);
        Materia _554 = new Materia(4,0);
        Materia _553 = new Materia(3,0,_554);
        Materia _566 = new Materia(15,0);
        Materia _556 = new Materia(5,0);
        Materia _564 = new Materia(13,0,_552,_566);
        Materia _557 = new Materia(6,0,_552,_566);
        Materia _558 = new Materia(7,0,_552,_554,_557);
        Materia _559 = new Materia(8,0);
        Materia _560 = new Materia(9,0);
        Materia _561 = new Materia(10,0);
        Materia _562 = new Materia(11,0,_557,_564,_566);
        Materia _563 = new Materia(12,0,_557,_564,_566);
        Materia _565 = new Materia(14,0,_553,_556,_557,_563,_564,_566);
        Materia _580 = new Materia(16,0,_553,_554,_563,_564);
        Materia _583 = new Materia(17,0,_562,_566,_563,_564);
        Materia _584 = new Materia(18,0,_564,_566);
        Materia _e1 = new Materia(19,10);
        Materia _e2 = new Materia(20,10);
        Materia _e3 = new Materia(21,10);
        Materia _e4 = new Materia(22,10);
        Materia _e5 = new Materia(23,10);
        Materia _e6 = new Materia(24,10);
        Materia _i1 = new Materia(25,6);
        Materia _i2 = new Materia(26,6);
        materias = new Materia[]{
                _551, _552, _553, _554, _556, _557, _558, _559, _560, _561, _562, _563, _564, _565, _566, _580, _583, _584, _e1, _e2, _e3, _e4, _e5, _e6, _i1, _i2,
        };
        materiasTodas = new Materia[]{
                _551, _552, _553, _554, _556, _557, _558, _559, _560, _561, _562, _563, _564, _565, _566, _580, _583, _584, _e1, _e2, _e3, _e4, _e5, _e6, _i1, _i2,
        };
        orientaciones = new Orientacion[]{

        };
        addToArrays();
        this.nombre = nombre;


    }
}