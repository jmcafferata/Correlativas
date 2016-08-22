package com.jmcafferata.correlativas;

import android.os.Parcel;

public class UBA_PSICO_PSICO extends Carrera {

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
    Materia _3 = new Materia(3,0);
    Materia _4 = new Materia(4,0);
    Materia _5 = new Materia(5,0);
    Materia _6 = new Materia(6,0);
    Materia _7 = new Materia(7,0,_1);
    Materia _8 = new Materia(8,0,_1,_2);
    Materia _9 = new Materia(9,0,_3,_8);
    Materia _10 = new Materia(10,0,_3,_4);
    Materia _11 = new Materia(11,0,_4,_5);
    Materia _12 = new Materia(12,0,_11);
    Materia _13 = new Materia(13,0,_6,_11);
    Materia _i = new Materia(14,0,_1,_4);
    Materia _15 = new Materia(15,0,_8,_13);
    Materia _16 = new Materia(16,0,_15);
    Materia _17 = new Materia(17,0);
    Materia _18 = new Materia(18,0);
    Materia _19 = new Materia(19,0,_7,_3);
    Materia _20 = new Materia(20,0,_12);
    Materia _21 = new Materia(21,0,_12,_9,_10);
    Materia _22 = new Materia(22,0,_12,_9,_10);
    Materia _23 = new Materia(23,0,_16);
    Materia _24 = new Materia(24,0,_16);
    Materia _25 = new Materia(25,0,_16);
    Materia _26 = new Materia(26,18);
    Materia _e1 = new Materia(27,18);
    Materia _e2 = new Materia(28,18);
    Materia _e3 = new Materia(29,18);
    public UBA_PSICO_PSICO(String nombre){
        materias = new Materia[] {
                _1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _i, _15, _16, _17, _18, _19, _20, _21, _22, _23, _24, _25, _26, _e1, _e2, _e3,
        };
        materiasTodas = new Materia[] {
                _1, _2, _3, _4, _5, _6, _7, _8, _9, _10, _11, _12, _13, _i, _15, _16, _17, _18, _19, _20, _21, _22, _23, _24, _25, _26, _e1, _e2, _e3,
        };
        orientaciones = new Orientacion[]{

        };
        addToArrays();
        this.nombre = nombre;
    }

}
