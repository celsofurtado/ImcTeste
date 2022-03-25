package br.com.fiap.imclibtest

import kotlin.math.pow

class ImcClassTest {

    fun calcularImc(peso: Double, altura: Double): Double {
        return peso * altura.pow(2.0)
    }

}