package br.com.radar.tetrisb.engine;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnTouchListener;

import com.google.inject.Inject;

import br.com.radar.tetrisb.elements.AreaUtil;
import br.com.radar.tetrisb.elements.Bloco;
import br.com.radar.tetrisb.util.TelaUtil;
import roboguice.RoboGuice;


public class Game extends SurfaceView implements Runnable, OnTouchListener {

    private boolean isRunning;
    private SurfaceHolder holder = getHolder();
    private Canvas canvas;
    private Context context;
    private AreaUtil areaUtil;
    private Relogio relogio;

    private TelaUtil tela;

    public Game(Context context) {
        super(context);
        this.context = context;
        setOnTouchListener(this);

        iniciar();
    }

    public void iniciar(){
        areaUtil = new AreaUtil();
        tela = new TelaUtil(context);
        relogio = new Relogio();
    };


    @Override
    public void run() {
        while (isRunning) {
            if(!holder.getSurface().isValid()) {
                continue;
            }

            canvas = holder.lockCanvas();

            desenha();

            holder.unlockCanvasAndPost(canvas);
        }
    }

    public void desenha(){

        if(relogio.isEvento()){
            relogio.descreceEvento();
            areaUtil.sobe();
            areaUtil.adiciona();
        }

        for (Bloco bloco: areaUtil.getBlocos()) {
            bloco.desenhaNo(canvas);
        }

        for (Bloco bloco: areaUtil.getMapa()) {
            bloco.desenhaNo(canvas);
        }


        tela.desenhaBackgroundNo(canvas);
        tela.desenhaAreaUtilNo(canvas);

    }

    public void inicia(){
        isRunning = true;
    }

    public void pausa(){
        isRunning = false;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }



}
