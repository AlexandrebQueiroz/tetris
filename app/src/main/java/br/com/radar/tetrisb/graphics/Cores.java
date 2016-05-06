package br.com.radar.tetrisb.graphics;

import android.graphics.Paint;

public class Cores {

    public static Paint getColor(int cor){
        Paint paint = new Paint();

        switch(cor){
            case 0:
              paint.setColor(0xff0000ff);
            break;

            case 1:
                paint.setColor(0xff00ffff);
            break;

            case 2:
                paint.setColor(0xff444444);
            break;

            case 3:
                paint.setColor(0xff888888);
            break;

            case 4:
                paint.setColor(0xff00ff00);
            break;

            case 5:
                paint.setColor(0xffcccccc);
            break;
            default:
                paint.setColor(0xff000000);
            }

        return  paint;
    }


    public static Paint getRed(){
        Paint paint = new Paint();
        paint.setColor(0xffff0000);
        return  paint;
    }

    public static Paint Black(){
        Paint paint = new Paint();
        paint.setColor(0xff000000);
        return  paint;
    }

    public static Paint getGreen(){
        Paint paint = new Paint();
        paint.setColor(0xff00ff00);
        return  paint;
    }


    public static Paint getWhite(){
        Paint paint = new Paint();
        paint.setColor(0xffffffff);
        return  paint;
    }

    public static Paint getBlue(){
        Paint paint = new Paint();
        paint.setColor(0xFFFF0000);
        return  paint;
    }

    public static Paint getCyan(){
        Paint paint = new Paint();
        paint.setColor(0xff00ffff);
        return  paint;
    }

    public static Paint getDkGray(){
        Paint paint = new Paint();
        paint.setColor(0xFFFF0000);
        return  paint;
    }



    public static Paint getLtGray(){
        Paint paint = new Paint();
        paint.setColor(0xFFFF0000);
        return  paint;
    }

    public static Paint getMagenta(){
        Paint paint = new Paint();
        paint.setColor(0xFFFF0000);
        return  paint;
    }





}
