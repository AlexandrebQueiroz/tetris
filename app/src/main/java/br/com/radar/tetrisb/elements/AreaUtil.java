package br.com.radar.tetrisb.elements;

import java.util.ArrayList;
import java.util.List;

import br.com.radar.tetrisb.Factory.BlocoFactory;

public class AreaUtil {

    private List<Bloco> blocos;
    private List<Bloco> mapa;

    private BlocoFactory blocoFactory;

    public AreaUtil() {
        blocoFactory = new BlocoFactory();
        blocos = new ArrayList<Bloco>();
        mapa = blocoFactory.getMatriz();
    }

    public List<Bloco> getBlocos() {
        return blocos;
    }

    public void setBlocos(List<Bloco> blocos) {
        this.blocos = blocos;
    }

    public List<Bloco> getMapa() {
        return mapa;
    }

    public void setMapa(List<Bloco> mapa) {
        this.mapa = mapa;
    }

    public void sobe(){

        List<Bloco> novosBlocos = new ArrayList<Bloco>();

        for (Bloco b1: blocos) {
            Bloco acima = null;
            for (Bloco b: mapa) {
                if(b.getLinha()== b1.getLinha()-1 && b.getColuna() == b1.getColuna()){

                    acima = new Bloco();
                    acima.setLinha(b.getLinha());
                    acima.setColuna(b.getColuna());
                    acima.setIsRender(b.isRender());
                    acima.setEsquerda(b.getEsquerda());
                    acima.setDireita(b.getDireita());
                    acima.setTopo(b.getTopo());
                    acima.setBase(b.getBase());
                    acima.setPaint(b1.getPaint());
                    b.setIsRender(false);

                }
            }
            if(acima != null){
                novosBlocos.add(acima);
            }
        }

        if(novosBlocos.size()>0){
            blocos.clear();
            blocos.addAll(novosBlocos);
            novosBlocos.clear();
        }
    }

    public void adiciona() {
        blocos.addAll(blocoFactory.getLinha(mapa));
    }
}
