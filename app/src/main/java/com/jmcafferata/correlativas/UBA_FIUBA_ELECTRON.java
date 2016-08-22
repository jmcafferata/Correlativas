
package com.jmcafferata.correlativas;

import android.os.Parcel;

public class UBA_FIUBA_ELECTRON extends Carrera {

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
    Materia _8201 = new Materia(3,0);
    Materia _8710 = new Materia(4,0);
    Materia _8105 = new Materia(5,0,_8101,_8102);
    Materia _8202 = new Materia(6,0,_8101,_8201);
    Materia _8601 = new Materia(7,0);
    Materia _8602 = new Materia(8,0,_8101,_8201,_8202);
    Materia _8104 = new Materia(9,0,_8101,_8102);
    Materia _9511 = new Materia(10,0);
    Materia _8604 = new Materia(12,0,_8105,_8202,_8602);
    Materia _8603 = new Materia(11,0,_8202,_8602,_8604);
    Materia _8301 = new Materia(13,0);
    Materia _9504 = new Materia(14,0,_8101,_8102,_9511);
    Materia _8605 = new Materia(15,0,_8104,_8604);
    Materia _8606 = new Materia(16,0,_8603,_8604);
    Materia _8203 = new Materia(17,0,_8202,_8301);
    Materia _8607 = new Materia(18,0,_8601,_8603,_8604,_9504);
    Materia _8608 = new Materia(19,0,_8605,_9504);
    Materia _8609 = new Materia(20,0,_8104,_8604,_8605);
    Materia _8206 = new Materia(21,0,_8105,_8203);
    Materia _9119 = new Materia(22,18);
    Materia _8610 = new Materia(23,0,_8606,_8607,_8710);
    Materia _8611 = new Materia(24,0,_8605,_8609);
    Materia _8612 = new Materia(25,0,_8611);
    Materia _8613 = new Materia(26,0,_8206,_8610);
    Materia _8614 = new Materia(27,0,_8610);
    Materia _9704 = new Materia(28,18);
    Materia _9111 = new Materia(29,18);
    Materia _8600 = new Materia(30,0,_8612,_8613,_8614,_8610,_8606,_8609,_8608,_8607);    public UBA_FIUBA_ELECTRON(String nombre){
        materias = new Materia[] {
                _8101, _8102, _8201, _8710, _8105, _8202, _8601, _8602, _8104, _9511, _8603, _8604, _8301, _9504, _8605, _8606, _8203, _8607, _8608, _8609, _8206, _9119, _8610, _8611, _8612, _8613, _8614, _9704, _9111,_8600
        };
        materiasTodas = new Materia[] {
                _8101, _8102, _8201, _8710, _8105, _8202, _8601, _8602, _8104, _9511, _8603, _8604, _8301, _9504, _8605, _8606, _8203, _8607, _8608, _8609, _8206, _9119, _8610, _8611, _8612, _8613, _8614, _9704, _9111,_8600
        };
        orientaciones = new Orientacion[]{

        };
        addToArrays();
        this.nombre = nombre;
    }




}
