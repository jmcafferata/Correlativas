
package com.jmcafferata.correlativas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import android.widget.TextView;


import java.util.Arrays;


public class UBA_FIUBA_INFORMATICA extends Carrera {

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


        Materia _6103 = new Materia(1, 0);
        Materia _6201 = new Materia(2, 0);
        Materia _7540 = new Materia(3, 0);
        Materia _6108 = new Materia(4, 0);
        Materia _6203 = new Materia(5, 0, _6103, _6201);
        Materia _6301 = new Materia(6, 0);
        Materia _7541 = new Materia(7, 0, _7540);
        Materia _6215 = new Materia(8, 0, _6108, _6203, _6301);
        Materia _6602 = new Materia(9, 0, _6203);
        Materia _6670 = new Materia(10, 0, _6108, _6203, _6301);
        Materia _7507 = new Materia(11, 0, _7541);
        Materia _7512 = new Materia(12, 0, _6103, _6108, _7541);
        Materia _6109 = new Materia(13, 0, _6103, _6108);
        Materia _6110 = new Materia(14, 0, _6103, _6108);
        Materia _6620 = new Materia(15, 0, _6602, _6670);
        Materia _7506 = new Materia(16, 0, _6670, _7541);
        Materia _7542 = new Materia(17, 0, _6670, _7512, _7541);
        Materia _7112 = new Materia(18, 0, _7506);
        Materia _7114 = new Materia(19, 0, _6110, _6203, _6301, _7542);
        Materia _7508 = new Materia(20, 0, _7506);
        Materia _7509 = new Materia(21, 0, _7507, _7542);
        Materia _7510 = new Materia(22, 0, _7508, _7509);
        Materia _7515 = new Materia(23, 0, _7506, _7509);
        Materia _7543 = new Materia(24, 0, _6620, _6215, _7508);
        Materia _7552 = new Materia(25, 0, _7114, _7507, _7542);
        Materia _7140 = new Materia(26, 22);
        Materia _7500 = new Materia(27, 22);
        Materia _e1 = new Materia(28, 22);
        Materia _e2 = new Materia(29, 25);
        Materia _e3 = new Materia(30, 25);
        Materia _e4 = new Materia(31, 26);

        Orientacion _oo1 = new Orientacion(1, 26);
        Materia _7113_1 = new Materia(32, 0, _7112);
        Materia _7544_1 = new Materia(33, 0, _7112, _7510);
        Materia _7545_1 = new Materia(34, 0, _7510);
        Materia _7546_1 = new Materia(35, 0, _7544_1);
        Materia _7547_1 = new Materia(36, 0, _7544_1, _7545_1);
        Materia _7548_1 = new Materia(37, 0, _7545_1);

        Orientacion _oo2 = new Orientacion(2, 26);
        Materia _6606_2 = new Materia(38, 0, _6110, _6203);
        Materia _6674_2 = new Materia(39, 0, _6109, _6606_2);
        Materia _7559_2 = new Materia(40, 0, _7508);
        Materia _7574_2 = new Materia(41, 0, _6110, _7543, _7559_2);
        Materia _7561_2 = new Materia(42, 0, _6674_2, _7574_2);

        Orientacion _oo3 = new Orientacion(3, 26);
        Materia _6405_3 = new Materia(43, 0, _6103, _6108);
        Materia _7201_3 = new Materia(44, 0, _6301, _6405_3);
        Materia _7565_3 = new Materia(45, 0, _7515, _7552);
        Materia _7566_3 = new Materia(46, 0, _7565_3);
        Materia _7567_3 = new Materia(47, 0, _6108);
        Materia _7568_3 = new Materia(48, 0, _7565_3, _7567_3);

        public UBA_FIUBA_INFORMATICA(String nombre) {
            materias = new Materia[]{
                    _6103, _6201, _7540, _6108, _6203, _6301, _7541, _6215, _6602, _6670, _7507, _7512, _6109, _6110, _6620, _7506, _7542, _7112, _7114, _7508, _7509, _7510, _7515, _7543, _7552, _7140, _7500, _e1, _e2, _e3, _e4
            };
            materiasTodas = new Materia[]{
                    _6103, _6201, _7540, _6108, _6203, _6301, _7541, _6215, _6602, _6670, _7507, _7512, _6109, _6110, _6620, _7506, _7542, _7112, _7114, _7508, _7509, _7510, _7515, _7543, _7552, _7140, _7500, _e1, _e2, _e3, _e4, _7113_1, _7544_1, _7545_1, _7546_1, _7547_1, _7548_1, _6606_2, _6674_2, _7559_2, _7574_2, _7561_2, _6405_3, _7201_3, _7565_3, _7566_3, _7567_3, _7568_3
            };
            orientaciones = new Orientacion[]{
                    _oo1,_oo2,_oo3
            };
            _oo1.materiasO = new Materia[] {
                    _7113_1, _7544_1, _7545_1, _7546_1, _7547_1, _7548_1
            };
            _oo1.addToArrays();
            _oo2.materiasO = new Materia[] {
                    _6606_2, _6674_2, _7559_2, _7574_2, _7561_2
            };
            _oo2.addToArrays();
            _oo3.materiasO = new Materia[] {
                    _6405_3, _7201_3, _7565_3, _7566_3, _7567_3, _7568_3
            };
            _oo3.addToArrays();
            addToArrays();
            this.nombre = nombre;
        }

}







