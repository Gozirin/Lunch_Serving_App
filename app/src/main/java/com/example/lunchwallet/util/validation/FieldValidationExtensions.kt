package com.example.lunchwallet.util.validation

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.widget.doAfterTextChanged
import androidx.lifecycle.LifecycleOwner
import com.example.lunchwallet.R
import com.example.lunchwallet.util.validation.FieldValidationTracker.FieldType
import com.example.lunchwallet.util.validation.FieldValidationTracker.fieldTypeMap
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputLayout

inline fun TextInputLayout.validateField(
    errorMessage: String,
    fieldType: FieldType,
    crossinline action: (String) -> Boolean
) {
    this.editText?.doAfterTextChanged {
        if (!action.invoke(it.toString().trim())) {
            this.error = errorMessage
            fieldTypeMap[fieldType] = false
            FieldValidationTracker.isFieldsValidated.value = fieldTypeMap
        } else {
            this.error = null
            fieldTypeMap[fieldType] = true
            FieldValidationTracker.isFieldsValidated.value = fieldTypeMap
        }
    }
}

fun TextInputLayout.validateConfirmPassword(
    passwordInputLayout: TextInputLayout,
    fieldType: FieldType,
    errorMessage: String,
) {
    this.editText?.doAfterTextChanged {
        if (!FieldValidations.validateConfirmPassword(
                it.toString().trim(),
                passwordInputLayout.editText?.text.toString().trim()
            )
        ) {
            this.error = errorMessage
            fieldTypeMap[fieldType] = false
            FieldValidationTracker.isFieldsValidated.value = fieldTypeMap
        } else {
            this.error = null
            fieldTypeMap[fieldType] = true
            FieldValidationTracker.isFieldsValidated.value = fieldTypeMap
        }
    }
}

fun MaterialButton.observeFieldsValidationToEnableButton(
    context: Context,
    lifecycleOwner: LifecycleOwner,
    fieldValidationTracker: FieldValidationTracker = FieldValidationTracker
) {

    fieldValidationTracker.isFieldsValidated.observe(lifecycleOwner) {
        this.apply {
            this.isEnabled = !it.values.contains(false)
            backgroundTintList = if (!it.values.contains(false))
                ContextCompat.getColorStateList(context, R.color.theme_color) else
                ContextCompat.getColorStateList(context, R.color.grey)
        }
    }
}


fun TextView.observeClicks(
    arr: ArrayList<View?>
) {
    val color2 = ContextCompat.getColor(context, R.color.text_color)
   val color1 = ContextCompat.getColor(context, R.color.theme_color)

    this.setOnClickListener {
        val current = it
        arr.forEach {
            it?.apply {
                if (this == current) {
                    background = ContextCompat.getDrawable(context, R.drawable.border).also {   setTextColor(color1) }
                } else {
                    background = ContextCompat.getDrawable(context, R.drawable.border2)
                }
            }
        }
    }
}
