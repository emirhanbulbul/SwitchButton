package com.emirhanbb.switchbutton

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout

/**
 * Created by Emirhan Bülbül on 21.09.2023
 */
class SwitchButton @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout(context, attrs) {

    init {
        LayoutInflater.from(context).inflate(R.layout.layout_switch_button,this,true)
        orientation = VERTICAL
        attrs.let {
            val typedArray = context.obtainStyledAttributes(it, R.styleable.SwitchButton)
            try {

            } finally {
                typedArray?.recycle()
            }
        }
    }
}