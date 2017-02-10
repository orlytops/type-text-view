package com.daidaiiro.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by orlytops on 2/10/2017.
 */

public class TypeText extends TextView {

  private TypedArray _typedArray;

  public TypeText(Context context) {
    super(context);
    init();
  }

  public TypeText(Context context, AttributeSet attrs) {
    super(context, attrs);
    _typedArray = getContext().obtainStyledAttributes(attrs,
        R.styleable.TypeText, 0, 0);
    init();
  }

  public TypeText(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    init();
  }

  @Override
  protected void onFinishInflate() {
    super.onFinishInflate();
    init();
  }

  private void init() {
    String titleText = _typedArray.getString(R.styleable.TypeText_textFont);
    Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
        "fonts/" + titleText);
    setTypeface(tf);
  }

}
