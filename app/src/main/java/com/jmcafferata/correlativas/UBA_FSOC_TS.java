package com.jmcafferata.correlativas;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class UBA_FSOC_TS extends Carrera {


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
    Materia _5 = new Materia(5,0);
    Materia _6 = new Materia(6,0);
    Materia _7 = new Materia(7,0,_2);
    Materia _8 = new Materia(8,0,_2);

    Materia _10 = new Materia(10,0,_4);
    Materia _9 = new Materia(9,0,_2,_3,_10);
    Materia _11 = new Materia(11,0,_6);
    Materia _12 = new Materia(12,0,_5,_11);
    Materia _13 = new Materia(13,0,_1,_12);
    Materia _14 = new Materia(14,0,_1,_8);
    Materia _15 = new Materia(15,0,_1,_8);
    Materia _16 = new Materia(16,0,_10);
    Materia _17 = new Materia(17,0,_8,_10);
    Materia _18 = new Materia(18,0,_6,_12);
    Materia _19 = new Materia(19,0,_1,_16);
    Materia _20 = new Materia(20,0,_9,_14,_15);
    Materia _21 = new Materia(21,0,_8);
    Materia _22 = new Materia(22,0);
    Materia _23 = new Materia(23,0,_2,_9);
    Materia _24 = new Materia(24,0,_14,_19);
    Materia _28 = new Materia(28,0);
    Materia _26 = new Materia(26,0,_8,_28);
    Materia _25 = new Materia(25,0,_13,_20,_21,_26);
    Materia _27 = new Materia(27,0,_22);
    Materia _29 = new Materia(29,0,_19,_20);
    Materia _30 = new Materia(30,0,_9,_12);
    Materia _31 = new Materia(31,0,_9,_12);
    Materia _32 = new Materia(32,0,_9,_12);
    Materia _33 = new Materia(33,0,_28);
    Materia _i = new Materia(34,0);
    public UBA_FSOC_TS(String nombre){
        materias = new Materia[] {
                _1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22, _23, _24, _25, _26, _27, _28, _29, _30, _31, _32,_33, _i,
        };
        materiasTodas = new Materia[] {
                _1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22, _23, _24, _25, _26, _27, _28, _29, _30, _31, _32,_33, _i,
        };
        orientaciones = new Orientacion[]{

        };
        addToArrays();
        this.nombre = nombre;
    }


}