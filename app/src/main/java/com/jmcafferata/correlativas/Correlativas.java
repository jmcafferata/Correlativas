package com.jmcafferata.correlativas;
import java.util.ArrayList;


public abstract class Correlativas {
    public static void check(Carrera carrera){
        for (Materia m : carrera.noCursadasList){
            if (carrera.cursadasList.containsAll(m.correlativas)
                    && m.numReq<=carrera.cursadasList.size()
                    && !carrera.disponiblesList.contains(m)){
                carrera.disponiblesList.add(m);
                System.out.println("Se acaba de desbloquear "+m.id);
                System.out.println(m.TPcorrelativas);
            }
        }
        for (Orientacion o : carrera.orientacionesNoCursadasList){
            if (carrera.cursadasList.containsAll(o.correlativas)
                    && o.numReq<=carrera.cursadasList.size()
                    && !carrera.orientacionesDisponiblesList.contains(o)){
                carrera.orientacionesDisponiblesList.add(o);
                System.out.println("Se acaba de desbloquear Orientación "+o.id);
            }
        }
    }

    public static void checkFinal(Carrera carrera){
        for (Materia m : carrera.noCursadasList){
            if (carrera.cursadasList.containsAll(m.correlativas)
                    && carrera.TPList.containsAll(m.TPcorrelativas)
                    && m.numReq<=carrera.cursadasList.size()
                    && !carrera.disponiblesList.contains(m)){
                carrera.disponiblesList.add(m);
                System.out.println("Se acaba de desbloquear "+m.id);
                System.out.println(m.TPcorrelativas);
            }
        }
        for (Orientacion o : carrera.orientacionesNoCursadasList){
            if (carrera.cursadasList.containsAll(o.correlativas)
                    && o.numReq<=carrera.cursadasList.size()
                    && !carrera.orientacionesDisponiblesList.contains(o)){
                carrera.orientacionesDisponiblesList.add(o);
                System.out.println("Se acaba de desbloquear Orientación "+o.id);
            }
        }
    }
}
