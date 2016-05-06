package br.com.radar.tetrisb.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.google.inject.Inject;


public class BitmapUtil {

    private Context contexto;

    private TelaUtil tela;

    public BitmapUtil(Context contexto) {
        this.contexto = contexto;
        tela = new TelaUtil(contexto);
    }

    public Bitmap getBitmapFullScren(int codigo){
        return Bitmap.createScaledBitmap(BitmapFactory.decodeResource(contexto.getResources(), codigo), tela.getLargura(),tela.getAltura(),false);
    }
}
