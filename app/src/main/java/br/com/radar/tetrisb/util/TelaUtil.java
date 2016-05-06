package br.com.radar.tetrisb.util;

import android.content.Context;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

import com.google.inject.Inject;

import br.com.radar.tetrisb.R;
import br.com.radar.tetrisb.graphics.Cores;

public class TelaUtil{

    private BitmapUtil bitmapUtil;
    private DisplayMetrics metrics;


    public TelaUtil(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        metrics = new DisplayMetrics();
        display.getMetrics(metrics);

    }


    public void desenhaBackgroundNo(Canvas canvas){
        //canvas.drawBitmap(bitmapUtil.getBitmapFullScren(R.drawable.backgroud_medidas), 0, 0, null);
        //canvas.drawBitmap(bitmapUtil.getBitmapFullScren(R.drawable.backgroud_medidas), 0, 0, null);
    }


    public DisplayMetrics getMetrics(){
        return  metrics;
    }

    public int getAltura(){
        return metrics.heightPixels;
    }

    public int getLargura(){
        return metrics.widthPixels;
    }

    public void desenhaAreaUtilNo(Canvas canvas){
        canvas.drawLine(100,350,100,1150, Cores.getRed());
        canvas.drawLine(620,350,620,1150, Cores.getRed());
        canvas.drawLine(100, 350, 620, 350, Cores.getRed());
        canvas.drawLine(100, 1150, 620, 1150, Cores.getRed());
    }
}
