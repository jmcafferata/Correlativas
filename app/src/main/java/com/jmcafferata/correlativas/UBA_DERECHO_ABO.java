
package com.jmcafferata.correlativas;

import android.os.Parcel;

import java.util.Arrays;

public class UBA_DERECHO_ABO extends Carrera {
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

    Materia _131 = new Materia(1, 0);
    Materia _144 = new Materia(2, 0);
    Materia _132 = new Materia(3, 0);
    Materia _135 = new Materia(4, 0);
    Materia _134 = new Materia(5, 0, _132);
    Materia _136 = new Materia(6, 0, _135);
    Materia _133 = new Materia(10, 0);
    Materia _138 = new Materia(7, 0, _136);
    Materia _145 = new Materia(14, 0, _135);
    Materia _139 = new Materia(8, 0, _131, _133);
    Materia _141 = new Materia(9, 0, _134, _136, _133);
    Materia _137 = new Materia(11, 0, _136);
    Materia _142 = new Materia(12, 0, _137, _134);
    Materia _162 = new Materia(13, 0, _145, _137);
    Materia _140 = new Materia(15, 0, _136);
    Materia _167 = new Materia(16, 0, _140, _137);
    Materia _163 = new Materia(17, 0, _133, _137, _134);
    Materia _168 = new Materia(18, 0, _139, _141, _162);
    Materia _169 = new Materia(19, 0, _145, _167);
    Orientacion _o1 = new Orientacion(1, 12);
    Orientacion _o2 = new Orientacion(2, 12);
    Orientacion _o3 = new Orientacion(3, 12);
    Orientacion _o4 = new Orientacion(4, 12);
    Orientacion _o5 = new Orientacion(5, 12);
    Materia _1_1 = new Materia(20, 0);
    Materia _2_1 = new Materia(21, 0);
    Materia _3_1 = new Materia(22, 0);
    Materia _4_1 = new Materia(23, 0);
    Materia _5_1 = new Materia(24, 0);
    Materia _6_1 = new Materia(53, 0);
    Materia _d_1 = new Materia(25, 0);

    Materia _1_2 = new Materia(26, 0);
    Materia _2_2 = new Materia(27, 0);
    Materia _3_2 = new Materia(28, 0);
    Materia _d_2 = new Materia(29, 0);

    Materia _1_3 = new Materia(30, 0);
    Materia _2_3 = new Materia(31, 0);
    Materia _3_3 = new Materia(32, 0);
    Materia _d_3 = new Materia(33, 0);

    Materia _1_4 = new Materia(34, 0);
    Materia _2_4 = new Materia(35, 0);
    Materia _3_4 = new Materia(36, 0);
    Materia _d_4 = new Materia(54, 0);

    Materia _1_5 = new Materia(37, 0);
    Materia _2_5 = new Materia(38, 0);
    Materia _op_5 = new Materia(39, 0);
    Materia _d_5 = new Materia(40, 0);

    Orientacion _o6 = new Orientacion(6, 12);
    Materia _1_6 = new Materia(41, 0);
    Materia _2_6 = new Materia(42, 0);
    Materia _3_6 = new Materia(43, 0);
    Materia _d_6 = new Materia(44, 0);

    Orientacion _o7 = new Orientacion(7, 12);
    Materia _1_7 = new Materia(45, 0);
    Materia _2_7 = new Materia(46, 0);
    Materia _op_7 = new Materia(47, 0);
    Materia _d_7 = new Materia(48, 0);

    Orientacion _o8 = new Orientacion(8, 12);
    Materia _1_8 = new Materia(49, 0);
    Materia _2_8 = new Materia(50, 0);
    Materia _3_8 = new Materia(51, 0);
    Materia _d_8 = new Materia(52, 0);

    public UBA_DERECHO_ABO(String nombre) {

        materias = new Materia[]{
                _131, _144, _132, _135, _134, _136, _138, _139, _141, _133, _137, _142, _162, _145, _140, _167, _163, _168, _169,
        };
        materiasTodas = new Materia[]{
                _131, _144, _132, _135, _134, _136, _138, _139, _141, _133, _137, _142, _162, _145, _140, _167, _163, _168, _169, _1_1, _2_1, _3_1, _4_1, _5_1, _6_1,_d_1, _1_2, _2_2, _3_2, _d_2, _1_3, _2_3, _3_3, _d_3, _1_4, _2_4, _3_4,_d_4, _1_5, _2_5, _op_5, _d_5, _1_6, _2_6, _3_6, _d_6, _1_7, _2_7, _op_7, _d_7, _1_8, _2_8, _3_8, _d_8
        };
        orientaciones = new Orientacion[]{
                _o1, _o2,_o3,_o4,_o5,_o6, _o7, _o8,
        };
        _o1.materiasO = new Materia[]{
                _1_1, _2_1, _3_1, _4_1, _5_1, _d_1,_6_1
        };
        _o1.addToArrays();
        _o2.materiasO = new Materia[]{
                _1_2, _2_2, _3_2, _d_2};
        _o2.addToArrays();
        _o3.materiasO = new Materia[]{
                _1_3, _2_3, _3_3, _d_3};
        _o3.addToArrays();
        _o4.materiasO = new Materia[]{
                _1_4, _2_4, _3_4,_d_4};
        _o4.addToArrays();
        _o5.materiasO = new Materia[]{
                _1_5, _2_5, _op_5, _d_5};
        _o5.addToArrays();
        _o6.materiasO = new Materia[]{
                _1_6, _2_6, _3_6, _d_6};
        _o6.addToArrays();
        _o7.materiasO = new Materia[]{
                _1_7, _2_7, _op_7, _d_7};
        _o7.addToArrays();
        _o8.materiasO = new Materia[]{
                _1_8, _2_8, _3_8, _d_8};
        _o8.addToArrays();

        addToArrays();
        this.nombre = nombre;
    }

}