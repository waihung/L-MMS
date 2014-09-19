package com.android.mms.ui.textview;

import com.android.mms.R;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class LMMSCustomTextView extends TextView {

	public LMMSCustomTextView(Context context, AttributeSet attrs,
			int defStyle) {
		super(context, attrs, defStyle);
		init(attrs);
	}

	public LMMSCustomTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(attrs);

	}

	public LMMSCustomTextView(Context context) {
		super(context);
		init(null);
	}

	private void init(AttributeSet attrs) {
		if (attrs != null) {
			TypedArray a = getContext().obtainStyledAttributes(attrs,
					R.styleable.LMMSCustomTextView);
			String fontName = a
					.getString(R.styleable.LMMSCustomTextView_fontName);
			if (fontName != null) {
				Typeface myTypeface = Typeface.createFromAsset(getContext()
						.getAssets(), "fonts/" + fontName);
				setTypeface(myTypeface);
			}
			a.recycle();
		}
	}

}
