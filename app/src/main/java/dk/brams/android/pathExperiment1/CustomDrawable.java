package dk.brams.android.pathExperiment1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.view.View;

public class CustomDrawable extends View {

    Point[] myPoint = {new Point(100, 100),
            new Point(200, 200),
            new Point(200, 500),
            new Point(400, 500),
            new Point(400, 200)
    };

    Paint myPaint = new Paint();
    Path myPath = new Path();


    public CustomDrawable(Context context) {
        super(context);

        myPaint.setColor(Color.RED);
        myPaint.setStrokeWidth(8);
        myPaint.setStyle(Paint.Style.STROKE);

        myPath.moveTo(myPoint[0].x, myPoint[0].y);
        for (int i = 1; i < myPoint.length; i++) {
            myPath.lineTo(myPoint[i].x, myPoint[i].y);
        }
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawPath(myPath, myPaint);
    }
}
