# UnregularButton

unregular radiobutton

the key code is 

    int x = (int)event.getX();
    int y = (int)event.getY();
    int pixel = bitmap.getPixel( x, y);
    if(Color.TRANSPARENT == pixel) {
        return false;
    }
    return super.onTouchEvent( event);

![image](record.gif)
