package com.valneyfaria.helperapp.ui.custom_views

import android.content.Context
import android.content.res.Resources
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.valneyfaria.helperapp.databinding.ViewFlightsStopDotBinding
import com.valneyfaria.helperapp.databinding.WidgetFlightStopsBinding

class FlightStops @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding = WidgetFlightStopsBinding.inflate(LayoutInflater.from(context), this)

    var stopsNumber = 0
        set(value) {
            drawStopDots(value)
            field = value
        }

    var numberOfStopsTitle: String? = null
        set(value) {
            value?.let {
                binding.tvNumberOfStopsTitle.text = value
                field = value
            }
        }

    var tripDurationTitle: String? = null
        set(value) {
            value?.let {
                binding.tvTripDurationTitle.text = value
                field = value
            }
        }


    private fun drawStopDots(value: Int) {
        repeat(value) {
            addSpacer()
            addDotCircle()
        }
        addSpacer()
    }

    private fun addDotCircle() =
        ViewFlightsStopDotBinding.inflate(LayoutInflater.from(context)).root.addToContainer()

    private fun addSpacer() = View(context).addToContainer(1F)

    private fun View.addToContainer(weight: Float = 1F) {
        layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT,
            weight
        ).apply {
            height = DOT_SIZE_IN_DP.dpToPx()
            width = DOT_SIZE_IN_DP.dpToPx()
        }

        binding.llSlider.addView(this)
    }


    private fun Int.dpToPx(): Int {
        return (this * Resources.getSystem().displayMetrics.density).toInt()
    }

    private companion object {
        const val DOT_SIZE_IN_DP = 4
    }
}
