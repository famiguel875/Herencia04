open class Empleado(nombre: String, edad: Int, var salarioBase: Double, private var porcentajeImpuestos: Double = 10.0) : Persona(nombre, edad) {

    init {
        require(salarioBase >= 0) { "El salario base no puede ser negativo" }
        require(porcentajeImpuestos >= 0 && porcentajeImpuestos <= 100) { "El porcentaje de impuestos debe estar entre 0 y 100" }
    }

    open fun calcularSalario(): Double {
        val impuestos = salarioBase * (porcentajeImpuestos / 100)
        return salarioBase - impuestos
    }

    override fun toString(): String {
        val salario = String.format("%.2f", calcularSalario())
        return "${super.toString()}, Salario total: $salario €"
    }

    fun trabajar(): String {
        return "$nombre está trabajando en la empresa."
    }
}