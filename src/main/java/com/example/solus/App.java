package com.example.solus;

import com.example.downcasting.A;

import java.util.Arrays;
import java.util.List;

public class App {

    class TipoDeRespuesta {

        String opcion;
        Regla regla;

        public TipoDeRespuesta(String opcion) {
            this.opcion = opcion;
        }

        public String getOpcion() {
            return opcion;
        }

        public Regla getRegla() {
            return regla;
        }

        public TipoDeRespuesta setOpcion(String opcion) {
            this.opcion = opcion;
            return this;
        }

        public TipoDeRespuesta setRegla(Regla regla) {
            this.regla = regla;
            return this;
        }
    }

    private class Regla {

        boolean esActivada = false;
        Padre padre;

        public Regla(Padre padre) {
            this.padre = padre;
        }

        public boolean isEsActivada() {
            return esActivada;
        }

        public Regla setEsActivada(boolean esActivada) {
            this.esActivada = esActivada;
            return this;
        }

        public Padre getPadre() {
            return padre;
        }

        public Regla setPadre(Padre padre) {
            this.padre = padre;
            return this;
        }
    }

    class Padre {
        String id;
        List<Regla> reglaList;

        public Padre(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

        public Padre setId(String id) {
            this.id = id;
            return this;
        }

        public List<Regla> getReglaList() {
            return reglaList;
        }

        public Padre setReglaList(List<Regla> reglaList) {
            this.reglaList = reglaList;
            return this;
        }

        public boolean estaLaReglaActivada() {
            return reglaList.stream().filter(s -> s.isEsActivada()).count() > 0;
        }

    }

    class Pregunta {
        String Id;
        List<TipoDeRespuesta> tipoDeRespuestaList;

        public Pregunta(String id, List<TipoDeRespuesta> tipoDeRespuestaList) {
            Id = id;
            this.tipoDeRespuestaList = tipoDeRespuestaList;
        }

        public String getId() {
            return Id;
        }

        public Pregunta setId(String id) {
            Id = id;
            return this;
        }

        public List<TipoDeRespuesta> getTipoDeRespuestaList() {
            return tipoDeRespuestaList;
        }

        public Pregunta setTipoDeRespuestaList(List<TipoDeRespuesta> tipoDeRespuestaList) {
            this.tipoDeRespuestaList = tipoDeRespuestaList;
            return this;
        }

        public void procesaRespuesta(String respuesta) {
            int flag = 0;
            for (TipoDeRespuesta tdr : tipoDeRespuestaList) {
                if (tdr.getOpcion().equalsIgnoreCase(respuesta)) {
                    if (tdr.getRegla() != null) {
                        tdr.getRegla().setEsActivada(true);
                        System.out.print("La regla esta activada? " + tdr.getRegla().getPadre().estaLaReglaActivada() + " --> ");
                        System.out.println(tdr.getRegla().getPadre().getId());

                        /* System.out.println(tdr.getRegla().getPadre().getReglaList());
                        List<Regla> reglaList = tdr.getRegla().getPadre().getReglaList();
                        for(Regla regla : reglaList){
                            System.out.println(regla.getPadre().getId());
                        }
                        reglaList.stream().map(s -> s.getPadre().getId()).forEach(System.out::println);*/
                        flag -= 1;
                    } else {
                       // if (null == tdr.getRegla()) {
                            try {
                                tdr.getRegla().getPadre();
                            } catch (NullPointerException e) {
                                System.out.println("La regla esta activada? False");
                            }
                            flag -= 1;
                       // }
                    }
                } flag += 1;
            }
            if(flag == tipoDeRespuestaList.size()){
                System.out.println("No esta contemplada esa respuesta!");
            }
        }
    }

    public static void main(String[] args) {

        App app = new App();

        App.Padre padre_1 = app.new Padre("101");
        App.Padre padre_2 = app.new Padre("102");
        App.Padre padre_3 = app.new Padre("103");

        App.Regla regla_1 = app.new Regla(padre_1);
        App.Regla regla_2 = app.new Regla(padre_2);
        App.Regla regla_3 = app.new Regla(padre_3);

        padre_1.setReglaList(Arrays.asList(regla_1,regla_2, regla_3));

        App.TipoDeRespuesta tipoDeRespuesta_1 = app.new TipoDeRespuesta("Si");
        App.TipoDeRespuesta tipoDeRespuesta_2 = app.new TipoDeRespuesta("No");

        App.Pregunta pregunta_1 = app.new Pregunta("a", Arrays.asList(tipoDeRespuesta_1));
        App.Pregunta pregunta_2 = app.new Pregunta("b", Arrays.asList(tipoDeRespuesta_1));
        App.Pregunta pregunta_3 = app.new Pregunta("c", Arrays.asList(tipoDeRespuesta_1));

        pregunta_1.getTipoDeRespuestaList().get(0).setRegla(regla_1);
        // pregunta_2.getTipoDeRespuestaList().get(0).setRegla(regla_2);
        // pregunta_3.getTipoDeRespuestaList().get(0).setRegla(null);

        pregunta_3.procesaRespuesta("si");
    }
}

