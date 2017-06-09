package dk.brams.android.pathExperiment1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.view.View;

public class CustomDrawable extends View {

    Point[] myPath = {new Point(100, 100),
            new Point(200, 200),
            new Point(200, 500),
            new Point(400, 500),
            new Point(400, 200)
    };


    public CustomDrawable(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(8);
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();

        path.moveTo(myPath[0].x, myPath[0].y);
        for (int i = 1; i < myPath.length; i++) {
            path.lineTo(myPath[i].x, myPath[i].y);
        }

        canvas.drawPath(path, paint);
    }
}
