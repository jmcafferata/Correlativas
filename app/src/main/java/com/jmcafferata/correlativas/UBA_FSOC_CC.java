package com.jmcafferata.correlativas;

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

import java.util.Arrays;

public class UBA_FSOC_CC extends Carrera {

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


    Materia _101 = new Materia(1,0);
    Materia _102 = new Materia(2,0);
    Materia _103 = new Materia(3,0);
    Materia _104 = new Materia(4,0);
    Materia _105 = new Materia(5,0);
    Materia _106 = new Materia(6,0);
    Materia _107 = new Materia(7,0);
    Materia _108 = new Materia(8,0);
    Materia _109 = new Materia(9,0,_105);
    Materia _110 = new Materia(10,0,_101,_106);
    Materia _111 = new Materia(11,0);
    Materia _112 = new Materia(12,0,_102);
    Materia _113 = new Materia(13,0);
    Materia _114 = new Materia(14,0,_105);
    Materia _115 = new Materia(15,0,_101);
    Materia _116 = new Materia(16,0,_107);
    Materia _117 = new Materia(17,0,_102,_112);
    Materia _118 = new Materia(18,0,_101,_102,_104,_106,_110,_112);
    Materia _119 = new Materia(19,0,_113,_105,_114);
    Materia _120 = new Materia(20,0,_101,_102,_112);
    Materia _121 = new Materia(21,0,_101,_106,_110);
    Materia _122 = new Materia(22,0,_101,_106,_110);
    Materia _123 = new Materia(23,0,_107,_108,_116);
    Materia _124 = new Materia(24,0,_107);
    Materia _i = new Materia(55,6);
    Orientacion _o1 = new Orientacion(1,14,_107,_124);
    Materia _127_1 = new Materia(27,0);
    Materia _128_1 = new Materia(28,0);
    Materia _129_1 = new Materia(29,0);
    Materia _130_1 = new Materia(30,0);
    Materia _131_1 = new Materia(31,0);
    Materia _132_1 = new Materia(32,0);

    Orientacion _o2 = new Orientacion(2,14,_107,_124);
    Materia _221_2 = new Materia(33,0);
    Materia _551_2 = new Materia(34,0);
    Materia _135_2 = new Materia(35,0);
    Materia _135o_2 = new Materia(36,0);
    Materia _140_2 = new Materia(37,0);

    Orientacion _o3 = new Orientacion(3,14,_107,_124);
    Materia _141_3 = new Materia(38,0);
    Materia _143_3 = new Materia(39,0);
    Materia _144_3 = new Materia(40,0);
    Materia _230_3 = new Materia(41,0);
    Materia _231o_3 = new Materia(42,0);
    Materia _145_3 = new Materia(43,0);

    Orientacion _o4 = new Orientacion(4,14,_107,_124);
    Materia _146_4 = new Materia(44,0);
    Materia _137_4 = new Materia(45,0);
    Materia _139_4 = new Materia(46,0);
    Materia _221_4 = new Materia(47,0);
    Materia _221o_4 = new Materia(48,0);
    Materia _147_4 = new Materia(49,0);

    Orientacion _o5 = new Orientacion(5,14,_107,_124);
    Materia _139_5 = new Materia(50,0);
    Materia _148_5 = new Materia(51,0);
    Materia _149_5 = new Materia(52,0);
    Materia _149o_5 = new Materia(53,0);
    Materia _154_5 = new Materia(54,0);

    public UBA_FSOC_CC(String nombre){
        materias = new Materia[] {
                _101, _102, _103, _104, _105, _106, _107, _108, _109, _110, _111, _112, _113, _114, _115, _116, _117, _118, _119, _120, _121, _122, _123, _124, _123,_i
        };

        orientaciones = new Orientacion[]{
                _o1, _o2, _o3, _o4, _o5,
        };
        _o1.materiasO = new Materia[]{
                _127_1, _128_1, _129_1, _130_1, _131_1, _132_1,
        };
        _o1.addToArrays();
        _o2.materiasO = new Materia[]{
                _221_2, _551_2, _135_2, _135o_2, _140_2,
        };
        _o2.addToArrays();
        _o3.materiasO = new Materia[]{
                _141_3, _143_3, _144_3, _230_3, _231o_3, _145_3,
        };
        _o3.addToArrays();
        _o4.materiasO = new Materia[]{
                _146_4, _137_4, _139_4, _221_4, _221o_4, _147_4,
        };
        _o4.addToArrays();
        _o5.materiasO = new Materia[]{
                _139_5, _148_5, _149_5, _149o_5, _154_5,
        };
        _o5.addToArrays();


        materiasTodas = new Materia[] {
                _101, _102, _103, _104, _105, _106, _107, _108, _109, _110, _111, _112, _113, _114, _115, _116, _117, _118, _119, _120, _121, _122, _123, _124, _123, _127_1, _128_1, _129_1, _130_1, _131_1, _132_1, _221_2, _551_2, _135_2, _135o_2, _140_2, _141_3, _143_3, _144_3, _230_3, _231o_3, _145_3, _146_4, _137_4, _139_4, _221_4, _221o_4, _147_4, _139_5, _148_5, _149_5, _149o_5, _154_5,_i
        };
        addToArrays();
        this.nombre = nombre;
    }

}
