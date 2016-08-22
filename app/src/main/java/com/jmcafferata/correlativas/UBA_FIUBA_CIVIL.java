
package com.jmcafferata.correlativas;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Arrays;
import java.util.ArrayList;

public class UBA_FIUBA_CIVIL extends Carrera{

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


    Materia _8101 = new Materia(1, 0);
    Materia _8201 = new Materia(2, 0);
    Materia _8711 = new Materia(3, 0);
    Materia _8401 = new Materia(4, 0);
    Materia _8102 = new Materia(5, 0);
    Materia _8202 = new Materia(6, 0, _8101, _8201);
    Materia _8402 = new Materia(7, 0, _8101, _8201);
    Materia _8103 = new Materia(8, 0, _8101, _8401);
    Materia _8301 = new Materia(9, 0);
    Materia _8403 = new Materia(10, 0, _8102, _8401, _8402);
    Materia _8901 = new Materia(11, 0, _8101, _8201);
    Materia _8809 = new Materia(12, 0, _8103);
    Materia _8411 = new Materia(13, 0, _8103, _8402);
    Materia _9109 = new Materia(14, 0, _8401);
    Materia _8406 = new Materia(15, 0, _8403);
    Materia _9510 = new Materia(16, 0, _8101, _8403);
    Materia _8404 = new Materia(17, 0, _8301, _8403);
    Materia _9403 = new Materia(18, 0, _8202, _8404, _9109);
    Materia _8407 = new Materia(19, 0, _8403, _8901);
    Materia _8909 = new Materia(20, 0, _8901);
    Materia _9401 = new Materia(21, 0, _8404, _8406);
    Materia _9410 = new Materia(22, 0, _8404, _8406, _9401);
    Materia _9409 = new Materia(23, 0, _8407, _9401);
    Materia _9001 = new Materia(24, 0, _8103, _8201, _8711);
    Materia _8905 = new Materia(25, 0, _8407, _8411, _8901, _9510);
    Materia _9412 = new Materia(26, 0, _8404);
    Materia _8810 = new Materia(27, 0, _8809, _8407, _9401);
    Materia _8910 = new Materia(28, 0, _8905, _8909, _9409);
    Materia _8911 = new Materia(29, 0, _8905, _8909);
    Materia _9404 = new Materia(30, 0, _9401, _9412);
    Materia _9405 = new Materia(31, 0, _8911, _9403);
    Materia _8811 = new Materia(32, 0, _8407, _8809, _9401);
    Materia _8812 = new Materia(33, 0, _8407, _8809, _9401);
    Materia _8813 = new Materia(34, 0, _8407, _8809, _9401);
    Materia _8814 = new Materia(35, 0, _8809, _8909, _9403);
    Materia _9102 = new Materia(36, 0, _8810, _8909, _9403);
    Materia _9402 = new Materia(37, 0, _8809, _8910, _9405);
    Materia _9703 = new Materia(38, 0, _8810, _8909, _9403);
    Materia _8912 = new Materia(39, 0, _8810, _8909, _9403);
    Materia _9116 = new Materia(40, 0, _8814, _9102);
    Materia _8499 = new Materia(41, 25);
    Materia _e1 = new Materia(42, 21);
    Materia _e2 = new Materia(43, 25);
    Materia _e3 = new Materia(44, 29);
    Materia _e4 = new Materia(45, 34);

    public UBA_FIUBA_CIVIL(String nombre) {
        materias = new Materia[]{
                _8101, _e1, _e2, _e3, _e4, _8201, _8711, _8401, _8102, _8202, _8402, _8103, _8301, _8403, _8901, _8809, _8411, _9109, _8406, _9510, _8404, _9403, _8407, _8909, _9401, _9410, _9409, _9001, _8905, _9412, _8810, _8910, _8911, _9404, _9405, _8811, _8812, _8813, _8814, _9102, _9402, _9703, _8912, _9116, _8499
        };
        materiasTodas = new Materia[]{
                _8101, _e1, _e2, _e3, _e4, _8201, _8711, _8401, _8102, _8202, _8402, _8103, _8301, _8403, _8901, _8809, _8411, _9109, _8406, _9510, _8404, _9403, _8407, _8909, _9401, _9410, _9409, _9001, _8905, _9412, _8810, _8910, _8911, _9404, _9405, _8811, _8812, _8813, _8814, _9102, _9402, _9703, _8912, _9116, _8499
        };
        orientaciones = new Orientacion[]{
        };
        addToArrays();
        this.nombre = nombre;
    }


}

