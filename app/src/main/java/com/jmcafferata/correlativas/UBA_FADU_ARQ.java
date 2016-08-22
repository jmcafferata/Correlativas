
package com.jmcafferata.correlativas;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;

public class UBA_FADU_ARQ extends Carrera{
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
    Materia _7 = new Materia(7,0);
    Materia _8 = new Materia(8,0,_1,_3,_4);
    Materia _9 = new Materia(9,0,_3);
    Materia _10 = new Materia(10,0,_2);
    Materia _11 = new Materia(11,0,_3);
    Materia _12 = new Materia(12,0,_4,_5,_7);
    Materia _13 = new Materia(13,0,_4,_5,_7);
    Materia _14 = new Materia(14,0,_4,_6,_7);
    Materia _15 = new Materia(15,0,_8,_11,_9,_2,_4,_5,_6,_7,_13,_14,_12);
    Materia _16 = new Materia(16,0,_8,_11,_9,_2,_4,_5,_6,_7,_13,_14,_12);
    Materia _17 = new Materia(17,0,_1,_11,_9);
    Materia _18 = new Materia(18,0,_1,_3,_2,_10);
    Materia _19 = new Materia(19,0,_1,_3,_4,_5,_7,_12);
    Materia _20 = new Materia(20,0,_1,_3,_4,_5,_7,_13,_12);
    Materia _21 = new Materia(21,0,_1,_3,_4,_5,_7,_6,_12,_14);
    Materia _22 = new Materia(22,0,_8,_11,_9,_2,_4,_5,_7,_6,_14,_12);
    Materia _23 = new Materia(23,0,_8,_11,_9,_2,_4,_5,_7,_6,_14,_12);
    Materia _24 = new Materia(24,0,_2,_4,_5,_6,_7,_15,_17,_16,_10,_13,_12,_14,_19,_21);
    Materia _25 = new Materia(25,0,_2,_4,_5,_6,_7,_15,_17,_16,_10,_13,_14,_12);
    Materia _26 = new Materia(26,0,_2,_4,_5,_6,_7,_8,_11,_9,_10,_18);
    Materia _27 = new Materia(27,0,_2,_4,_5,_6,_7,_8,_11,_9,_12,_19);
    Materia _28 = new Materia(28,0,_2,_4,_5,_6,_7,_8,_11,_9,_13,_12,_20);
    Materia _29 = new Materia(29,0,_2,_4,_5,_6,_7,_8,_11,_9,_12,_14,_19,_21);
    Materia _30 = new Materia(30,0,_2,_4,_5,_6,_7,_15,_11,_9,_10,_13,_14,_12);
    Materia _31 = new Materia(31,0,_2,_4,_5,_6,_7,_15,_11,_9,_10,_13,_14,_12);
    Materia _32 = new Materia(32,0,_24,_10,_12,_13,_14,_25,_18,_19,_20,_21,_26,_27,_28,_29);
    Materia _33 = new Materia(33,0,_32,_24,_10,_12,_13,_14,_18,_19,_20,_21,_26,_27,_28,_29,_25);
    Materia _34 = new Materia(34,0,_24,_10,_12,_13,_14,_18,_19,_20,_21);
    public UBA_FADU_ARQ(String nombre){
        materias = new Materia[] {
                _1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22, _23, _24, _25, _26, _27, _28, _29, _30, _31, _32, _33, _34,
        };
        materiasTodas = new Materia[] {
                _1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17, _18, _19, _20, _21, _22, _23, _24, _25, _26, _27, _28, _29, _30, _31, _32, _33, _34,
        };
        orientaciones = new Orientacion[]{

        };
        addToArrays();
        this.nombre = nombre;
    }


}