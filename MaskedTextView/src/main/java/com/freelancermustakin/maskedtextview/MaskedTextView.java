package com.freelancermustakin.maskedtextview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

@SuppressLint("AppCompatCustomView")
public class MaskedTextView extends TextView {

    public MaskedTextView(Context context) {
        super(context);
    }

    public MaskedTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MaskedTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    // মেথড যা কোডের মাঝের অংশ লুকাবে
    public void setHiddenText(String text) {
        String hiddenText = hideMiddlePart(text);
        this.setText(hiddenText);
    }

    // টেক্সটের মাঝের অংশ লুকানোর মেথড
    private String hideMiddlePart(String text) {
        // টেক্সটের দৈর্ঘ্য বের করা
        int length = text.length();

        // যদি টেক্সট খুব ছোট হয়
        if (length <= 4) {
            return text; // ছোট টেক্সটে স্পয়লার প্রয়োজন নেই
        }

        // শুরু এবং শেষের অক্ষর সংখ্যা (প্রথম ৩ এবং শেষ ৩ অক্ষর রাখুন)
        int startChars = 3;
        int endChars = 3;

        // মাঝের অংশের দৈর্ঘ্য
        int middleLength = length - (startChars + endChars);

        // মাঝের অংশে "*" সেট করা
        String hiddenPart = new String(new char[middleLength]).replace("\0", "*");

        // ফলাফল তৈরি করা
        return text.substring(0, startChars) + hiddenPart + text.substring(length - endChars);
    }
}