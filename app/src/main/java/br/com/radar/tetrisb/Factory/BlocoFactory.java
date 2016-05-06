package br.com.radar.tetrisb.Factory;

import android.graphics.Paint;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.radar.tetrisb.elements.Bloco;
import br.com.radar.tetrisb.graphics.Cores;

public class BlocoFactory {

    public BlocoFactory() {
    }

    public List<Bloco> getMatriz(){

        List<Bloco> blocos = new ArrayList<Bloco>();
        Bloco bloco;

        int origemEsquerda = 100;
        int origemDireita;

        int larguraBloco = (620-100)/6+1;
        int alturatBloco = (1150-350)/9+1;
        int cor =0;

        for(int coluna=0;coluna<6;coluna++){
            origemDireita = 350;
            for(int linha=0; linha<9 ;linha++){
                bloco = new Bloco();

                bloco.setLinha(linha);
                bloco.setColuna(coluna);

                bloco.setEsquerda(origemEsquerda + (larguraBloco * coluna));
                bloco.setTopo(origemDireita);
                bloco.setDireita(origemEsquerda + (larguraBloco * (coluna + 1)));
                bloco.setBase(origemDireita += alturatBloco);

                Random random = new Random();

                bloco.setPaint(Cores.getRed());
                bloco.getPaint().setStyle(Paint.Style.STROKE);

                blocos.add(bloco);
            }
        }

        return blocos;
    }

    public List<Bloco> getLinha(List<Bloco> mapa){

        List<Bloco> blocos = new ArrayList<Bloco>();
        Bloco bloco;

        int origemEsquerda = 100;
        int origemDireita;

        int larguraBloco = (620-100)/6+1;
        int alturatBloco = (1150-350)/9+1;

        for(int coluna=0;coluna<6;coluna++){
            origemDireita = 350;
            for (Bloco m: mapa){
                if(m.getLinha()==8 && m.getColuna()==coluna && !m.isRender()){

                    bloco = new Bloco();
                    bloco.setLinha(8);
                    bloco.setColuna(coluna);
                    bloco.setEsquerda(origemEsquerda + (larguraBloco * coluna));
                    bloco.setTopo(origemDireita);
                    bloco.setDireita(origemEsquerda + (larguraBloco * (coluna + 1)));
                    bloco.setBase(origemDireita += alturatBloco);
                    bloco.setPaint(Cores.getColor(new Random().nextInt(5)));

                    m.setIsRender(true);
                    blocos.add(bloco);
                }
            }
        }

        return blocos;
    }


}
