package com.jmcafferata.correlativas;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class UBA_FSOC_S extends Carrera {



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

    Materia _1 = new Materia(1,0);
    Materia _2 = new Materia(2,0);
    Materia _3 = new Materia(3,0);
    Materia _4 = new Materia(4,0);
    Materia _5 = new Materia(5,0,_1,_3);
    Materia _6 = new Materia(6,0,_3);
    Materia _7 = new Materia(7,0,_2,_4);
    Materia _8 = new Materia(8,0,_5);
    Materia _9 = new Materia(9,0,_4,_5,_6);
    Materia _10 = new Materia(10,0,_7);
    Materia _11 = new Materia(11,0,_8);
    Materia _12 = new Materia(12,0,_9);
    Materia _13 = new Materia(13,0,_10,_11);
    Materia _14 = new Materia(14,0,_4);
    Materia _15 = new Materia(15,0,_11);
    Materia _16 = new Materia(16,0,_11,_12);
    Materia _17 = new Materia(17,0);
    public UBA_FSOC_S(String nombre){
        materias = new Materia[] {
                _1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17,
        };
        materiasTodas = new Materia[] {
                _1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17,
        };
        orientaciones = new Orientacion[]{

        };
        addToArrays();
        this.nombre = nombre;
    }

}