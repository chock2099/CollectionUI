package com.icruz.basicselements.express

import android.content.Context
import android.util.AttributeSet
import androidx.core.content.ContextCompat
import com.google.android.material.button.MaterialButton
import com.icruz.basicselements.R

class StateButton @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = R.style.State_Button
) : MaterialButton(context, attrs, defStyleAttr), StateView {

    init {
        active()
    }

    override fun active() {
        this.setBackgroundColor(ContextCompat.getColor(context, R.color.colorOvalActive))
    }

    override fun inactive() {
        this.setBackgroundColor(ContextCompat.getColor(context, R.color.colorOvalInActvie))
    }
}