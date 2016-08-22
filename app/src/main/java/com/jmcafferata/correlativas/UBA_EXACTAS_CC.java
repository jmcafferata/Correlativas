
package com.jmcafferata.correlativas;

import android.os.Parcel;

public class UBA_EXACTAS_CC extends Carrera{
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

    Materia _algebra1 = new Materia(1,0);
    Materia _analisis2 = new Materia(2,0);
    Materia _probyest = new Materia(3,0,_analisis2);
    Materia _algo1 = new Materia(5,0,_algebra1);
    Materia _metodos = new Materia(4,0,_probyest,_algo1);
    Materia _algo2 = new Materia(6,0,_algo1);
    Materia _algo3 = new Materia(7,0,_algo2);
    Materia _org1 = new Materia(9,0,_algo1);
    Materia _org2 = new Materia(10,0,_org1);
    Materia _sist = new Materia(11,0,_org2,_algo2);
    Materia _com = new Materia(12,0,_probyest,_sist);
    Materia _logica = new Materia(13,0,_algo2);
    Materia _leguajes = new Materia(14,0,_logica);
    Materia _para = new Materia(8,0,_algo2,_logica);
    Materia _soft1 = new Materia(15,0,_algo3);
    Materia _soft2 = new Materia(16,0,_para,_sist,_soft1);
    Materia _base = new Materia(17,0,_soft1,_sist);
    public UBA_EXACTAS_CC(String nombre){
        materias = new Materia[] {
                _algebra1, _analisis2, _probyest, _metodos, _algo1, _algo2, _algo3, _para, _org1, _org2, _sist, _com, _logica, _leguajes, _soft1, _soft2, _base,
        };
        materiasTodas = new Materia[] {
                _algebra1, _analisis2, _probyest, _metodos, _algo1, _algo2, _algo3, _para, _org1, _org2, _sist, _com, _logica, _leguajes, _soft1, _soft2, _base,
        };
        orientaciones = new Orientacion[]{

        };
        addToArrays();
        this.nombre = nombre;
    }

}