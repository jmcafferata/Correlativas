
package com.jmcafferata.correlativas;

import android.os.Parcel;

public class UBA_EXACTAS_CB extends Carrera{
    public static final Creator<Carrera> CREATOR = new Creator<Carrera>() {
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
    Materia _3 = new Materia(3,0,_1);
    Materia _4 = new Materia(4,0);
    Materia _5 = new Materia(5,0,_4);
    Materia _6 = new Materia(6,0,_5);
    Materia _7 = new Materia(7,0);
    Materia _8 = new Materia(8,0,_7,_1,_2);
    Materia _9 = new Materia(9,0,_7);
    Materia _10 = new Materia(10,0,_7);
    Materia _11 = new Materia(11,0,_10);
    Materia _12 = new Materia(12,0,_8,_6,_2,_3);
    Materia _13 = new Materia(13,0,_8,_2,_3);
    Materia _cp1 = new Materia(14,13);
    Materia _cp2 = new Materia(15,13);
    Materia _cp3 = new Materia(16,13);
    Materia _cp4 = new Materia(17,13);
    Materia _cp5 = new Materia(18,13);
    Materia _cp6 = new Materia(19,13);
    Materia _cp7 = new Materia(20,13);
    Materia _cp8 = new Materia(21,13);
    Materia _cp9 = new Materia(22,13);
    Materia _cp10 = new Materia(23,13);
    public UBA_EXACTAS_CB(String nombre){
        materias = new Materia[] {
                _1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _cp1, _cp2, _cp3, _cp4, _cp5, _cp6, _cp7, _cp8, _cp9, _cp10,
        };
        materiasTodas = new Materia[] {
                _1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _cp1, _cp2, _cp3, _cp4, _cp5, _cp6, _cp7, _cp8, _cp9, _cp10,
        };
        orientaciones = new Orientacion[]{

        };
        addToArrays();
        this.nombre = nombre;
    }

}