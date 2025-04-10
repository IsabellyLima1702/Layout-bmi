package br.senai.sp.jandira.bmi.ui.theme.utils

import java.util.Locale

fun convertNumberToLocale(value: Double): {
    return String.format(Locale.getDefault(), "%.2f", value)
}