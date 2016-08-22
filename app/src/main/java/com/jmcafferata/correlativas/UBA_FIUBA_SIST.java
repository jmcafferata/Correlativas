
package com.jmcafferata.correlativas;

import android.os.Parcel;

public class UBA_FIUBA_SIST extends Carrera{
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

    Materia _8101 = new Materia(1,0);
    Materia _8102 = new Materia(2,0);
    Materia _9514 = new Materia(3,0);
    Materia _8111 = new Materia(4,0);
    Materia _9557 = new Materia(5,0,_9514);
    Materia _9515 = new Materia(6,0,_9514);
    Materia _8104 = new Materia(7,0,_8101,_8102);
    Materia _9139 = new Materia(8,4);
    Materia _9558 = new Materia(9,0,_9557,_9515);
    Materia _9502 = new Materia(10,0,_9515);
    Materia _9141 = new Materia(11,0,_8104,_9139);
    Materia _9503 = new Materia(12,0,_9558);
    Materia _9520 = new Materia(13,0,_9502,_9558);
    Materia _9508 = new Materia(14,0,_9502,_9557);
    Materia _e1 = new Materia(15,11);
    Materia _9104 = new Materia(16,0,_8101,_8102,_8111,_9515);
    Materia _9521 = new Materia(17,0,_9520);
    Materia _9505 = new Materia(18,0,_9520);
    Materia _9142 = new Materia(19,0,_9141,_9520);
    Materia _e2 = new Materia(20,16);
    Materia _9105 = new Materia(21,0,_8104,_9104);
    Materia _9524 = new Materia(22,0,_9142,_9521);
    Materia _9559 = new Materia(23,0,_9142,_9521);
    Materia _9560 = new Materia(24,0,_9505,_9503);
    Materia _e3 = new Materia(25,21);
    Materia _9561 = new Materia(26,0,_9524,_9559,_9560);
    Materia _9140 = new Materia(27,22);
    Materia _9530 = new Materia(28,0,_9524);
    Materia _e4 = new Materia(29,25);
    public UBA_FIUBA_SIST(String nombre){
        materias = new Materia[] {
                _8101, _8102, _9514, _8111, _9557, _9515, _8104, _9139, _9558, _9502, _9141, _9503, _9520, _9508, _e1, _9104, _9521, _9505, _9142, _e2, _9105, _9524, _9559, _9560, _e3, _9561, _9140, _9530, _e4,
        };
        materiasTodas = new Materia[] {
                _8101, _8102, _9514, _8111, _9557, _9515, _8104, _9139, _9558, _9502, _9141, _9503, _9520, _9508, _e1, _9104, _9521, _9505, _9142, _e2, _9105, _9524, _9559, _9560, _e3, _9561, _9140, _9530, _e4,
        };
        orientaciones = new Orientacion[]{

        };
        addToArrays();
        this.nombre = nombre;
    }

}