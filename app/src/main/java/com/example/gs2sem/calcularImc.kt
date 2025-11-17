package com.example.gs2sem

import kotlin.math.pow

fun calcularImc(altura: Double, peso: Double): Double {
    return peso / (altura / 100).pow(2)
}

fun determinarClassificacaoIMC(imc: Double): String {
    return when {
        imc < 18.5 -> "Abaixo do peso"
        imc < 25.0 -> "Peso Ideal"
        imc < 30.0 -> "Levemente acima do peso"
        imc < 35.0 -> "Obesidade Grau I"
        imc < 40.0 -> "Obesidade Grau II"
        else -> "Obesidade Grau III"
    }
}
