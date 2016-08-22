package com.jmcafferata.correlativas;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class Carrera implements Parcelable{
    public Materia[] materias;
    public Materia[] materiasTodas;
    public Orientacion[] orientaciones;
    public String nombre;
    public ArrayList<Materia> materiasList = new ArrayList<>();
    public ArrayList<Materia> cursadasList = new ArrayList<>(0);
    public ArrayList<Materia> noCursadasList = new ArrayList<>();
    public ArrayList<Materia> disponiblesList = new ArrayList<>();
    public ArrayList<Orientacion> orientacionesList = new ArrayList<>();
    public ArrayList<Orientacion> orientacionesCursadasList = new ArrayList<>(0);
    public ArrayList<Orientacion> orientacionesNoCursadasList = new ArrayList<>();
    public ArrayList<Orientacion> orientacionesDisponiblesList = new ArrayList<>();
    public ArrayList<Materia> todasMaterias = new ArrayList<>();
    public ArrayList<Materia>TPList = new ArrayList<>();
    public boolean TP = false;


    // Métodos



    public void setDisponibilidadInicial(){
        for (Materia m : materiasList){
            if (m.numReq==0 && m.correlativas.isEmpty() && m.TPcorrelativas.isEmpty()) disponiblesList.add(m);
            System.out.println("TPCO "+m.TPcorrelativas);
        }
        for (Orientacion o : orientacionesList){
            if (o.numReq==0 && o.correlativas.isEmpty()) orientacionesDisponiblesList.add(o);
        }
    }

    public void materiasAdd(Materia[] materias){
        materiasList.addAll(Arrays.asList(materias));
    }

    public void reset(){
        for (Orientacion o : orientacionesList){
            materiasList.removeAll(o.materias);
        }
        cursadasList.clear();
        noCursadasList.clear();
        noCursadasList.addAll(materiasList);
        disponiblesList.clear();
        TPList.clear();
        orientacionesCursadasList.clear();
        orientacionesNoCursadasList.clear();
        orientacionesNoCursadasList.addAll(orientacionesList);
        orientacionesDisponiblesList.clear();
        setDisponibilidadInicial();
    }


    public void printMaterias(){
        System.out.println("Materias: " + materiasList.size());
        for (Materia m : materiasList) System.out.println(""+m.id);
    }

    public void printDisponibles() {
        System.out.println("Disponibles: " + disponiblesList.size());
        for (Materia m : disponiblesList) System.out.println("" + m.id);
    }
    public void printTP(){
        System.out.println("TP: " + TPList.size());
        for (Materia m : TPList) System.out.println(""+m.id);
    }

    public void printCursadas(){
        System.out.println("Cursadas: " + cursadasList.size());
        for (Materia m : cursadasList) System.out.println(""+m.id);
    }

    public void printNoCursadas(){
        System.out.println("No Cursadas: " + noCursadasList.size());
        for (Materia m : noCursadasList) System.out.println(""+m.id);
    }

    public void printOrientaciones(){
        System.out.println("Orientaciones: " + orientacionesList.size());
        for (Orientacion o : orientacionesList) System.out.println(""+o.id);
    }

    public void printOrientacionesDisponibles(){
        System.out.println("Orientaciones disponibles: " + orientacionesDisponiblesList.size());
        for (Orientacion o : orientacionesDisponiblesList) System.out.println(""+o.id);
    }

    public void printOrientacionesCursadas(){
        System.out.println("Orientaciones cursadas: " + orientacionesCursadasList.size());
        for (Orientacion o : orientacionesCursadasList) System.out.println(""+o.id);
    }

    public void printTPCorrelativas(){
        System.out.println("TP Correlativas: " + TPList.size());
        for (Materia m : TPList) System.out.println(""+m.id);
    }

    public Carrera(String nombre){
        this.nombre = nombre;
    }

    public Carrera(){

    }

    public void addToArrays() {
        materiasList.addAll(Arrays.asList(materias));
        noCursadasList.addAll(materiasList);
        todasMaterias.addAll(Arrays.asList(materiasTodas));
        orientacionesList.addAll(Arrays.asList(orientaciones));
        orientacionesNoCursadasList.addAll(orientacionesList);
    }

    // PARCELABLE IMPLEMENTATION

    public Carrera(Parcel in) {
        materias = in.createTypedArray(Materia.CREATOR);
        materiasTodas = in.createTypedArray(Materia.CREATOR);
        orientaciones = in.createTypedArray(Orientacion.CREATOR);
        nombre = in.readString();
        materiasList = in.createTypedArrayList(Materia.CREATOR);
        cursadasList = in.createTypedArrayList(Materia.CREATOR);
        noCursadasList = in.createTypedArrayList(Materia.CREATOR);
        disponiblesList = in.createTypedArrayList(Materia.CREATOR);
        orientacionesList = in.createTypedArrayList(Orientacion.CREATOR);
        orientacionesCursadasList = in.createTypedArrayList(Orientacion.CREATOR);
        orientacionesNoCursadasList = in.createTypedArrayList(Orientacion.CREATOR);
        orientacionesDisponiblesList = in.createTypedArrayList(Orientacion.CREATOR);
        todasMaterias = in.createTypedArrayList(Materia.CREATOR);
        TP = in.readByte() != 0;     //myBoolean == true if byte != 0
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedArray(materias, flags);
        dest.writeTypedArray(materiasTodas, flags);
        dest.writeTypedArray(orientaciones, flags);
        dest.writeString(nombre);
        dest.writeTypedList(materiasList);
        dest.writeTypedList(cursadasList);
        dest.writeTypedList(noCursadasList);
        dest.writeTypedList(disponiblesList);
        dest.writeTypedList(orientacionesList);
        dest.writeTypedList(orientacionesCursadasList);
        dest.writeTypedList(orientacionesNoCursadasList);
        dest.writeTypedList(orientacionesDisponiblesList);
        dest.writeTypedList(todasMaterias);
        dest.writeByte((byte) (TP ? 1 : 0));     //if myBoolean == true, byte == 1
    }

    @Override
    public int describeContents() {
        return 0;
    }

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


}// Fin de class Carrera

