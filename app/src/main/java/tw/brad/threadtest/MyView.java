package tw.brad.threadtest;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {
    private Resources res;

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);

        res = context.getResources();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Bitmap bmp = BitmapFactory.decodeResource(
                res, R.drawable.ball);

        canvas.drawBitmap(bmp, 0, 0, null);

    }
}
