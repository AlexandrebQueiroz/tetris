package br.com.radar.tetrisb.elements;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

import br.com.radar.tetrisb.graphics.Cores;

public class Bloco {

    private int linha;
    private int coluna;

    private int esquerda;
    private int direita;
    private int topo;
    private int base;

    private boolean isRender = false;
    private Paint paint;

    public Bloco() {
    }

    public void desenhaNo(Canvas canvas){
        Rect rect = new Rect();
        rect.set(esquerda,topo,direita,base);
        canvas.drawRect(rect, paint);

        Paint paint= Cores.getWhite();
        paint.setTextSize(50);
        canvas.drawText(linha + "," + coluna, esquerda+5, base-15, paint);

    }
    private void sobe(){}

    public float getCentroX(){
        return ((direita - esquerda)/2+esquerda);
    }

    public float getCentroY(){
        return ((base-topo)/2)+topo;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(int esquerda) {
        this.esquerda = esquerda;
    }

    public int getDireita() {
        return direita;
    }

    public void setDireita(int direita) {
        this.direita = direita;
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public boolean isRender() {
        return isRender;
    }

    public void setIsRender(boolean isRender) {
        this.isRender = isRender;
    }


    @Override
    public String toString() {
        return "Linha :" +linha +" ,coluna :"+ coluna +",isRender :" +isRender();
    }
}
