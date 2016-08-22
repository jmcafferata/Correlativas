
package com.jmcafferata.correlativas;

import android.os.Parcel;

public class UBA_FADU_IMG extends Carrera{
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

    Materia _dav1 = new Materia(1,0);
    Materia _ig = new Materia(2,0);
    Materia _ena = new Materia(3,0);
    Materia _dym = new Materia(4,0);
    Materia _ta = new Materia(5,0);
    Materia _ic1 = new Materia(6,0);
    Materia _s1 = new Materia(7,0);
    Materia _m1 = new Materia(8,0);
    Materia _lac1 = new Materia(9,0);
    Materia _hamint = new Materia(10,0);
    Materia _dav2 = new Materia(11,0,_dav1,_ig,_ic1,_s1);
    Materia _g1 = new Materia(12,0,_dav1,_ig,_ena);
    Materia _pyp = new Materia(13,0,_dav1);
    Materia _est = new Materia(14,0,_lac1);
    Materia _hamarg = new Materia(15,0,_hamint);
    Materia _tem = new Materia(16,0);
    Materia _lac2 = new Materia(17,0,_lac1);
    Materia _me1 = new Materia(18,0,_dav1,_ic1,_s1,_m1);
    Materia _me2 = new Materia(19,0,_dav1,_ic1,_s1,_m1);
    Materia _dav3 = new Materia(20,0,_dav2,_g1,_m1,_dym,_me1,_me2,_ena,_ta,_lac1,_hamint);
    Materia _g2 = new Materia(21,0,_dav2,_g1,_ena,_m1,_dym,_ena,_lac1,_hamint);
    Materia _dycm = new Materia(22,0,_dav2,_m1,_dym,_pyp,_ena,_ta,_lac1,_hamint);
    Materia _soc = new Materia(23,0,_dav1,_ig,_ic1,_s1,_m1,_dym,_ena,_ta,_lac1,_hamint);
    Materia _ectc = new Materia(24,0,_dav1,_ig,_ic1,_s1,_m1,_dym,_ena,_ta,_lac1,_hamint,_est,_tem);
    Materia _mo = new Materia(25,0,_dav1,_ig,_ic1,_s1,_m1,_dym,_me1,_me2,_ena,_ta,_lac1,_hamint);
    public UBA_FADU_IMG(String nombre){
        materias = new Materia[] {
                _dav1, _ig, _ena, _dym, _ta, _ic1, _s1, _m1, _lac1, _hamint, _dav2, _g1, _pyp, _est, _hamarg, _tem, _lac2, _me1, _me2, _dav3, _g2, _dycm, _soc, _ectc, _mo,
        };
        materiasTodas = new Materia[] {
                _dav1, _ig, _ena, _dym, _ta, _ic1, _s1, _m1, _lac1, _hamint, _dav2, _g1, _pyp, _est, _hamarg, _tem, _lac2, _me1, _me2, _dav3, _g2, _dycm, _soc, _ectc, _mo,
        };
        orientaciones = new Orientacion[]{

        };
        addToArrays();
        this.nombre = nombre;
    }


}