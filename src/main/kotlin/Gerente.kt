class Gerente(nombre: String, edad: Int, salarioBase: Double, private val bonus: Double, private var exentoImpuestos: Boolean = false) : Empleado(nombre, edad, salarioBase, 33.99) {

    init {
        require(bonus >= 0) { "El bonus no puede ser negativo" }
    }

    override fun calcularSalario(): Double {
        val salarioBaseConImpuestos = if (exentoImpuestos) salarioBase else super.calcularSalario()
        return salarioBaseConImpuestos + bonus
    }

    override fun toString(): String {
        return "${super.toString()} Bonus: $bonus €, Exento de Impuestos: $exentoImpuestos"
    }

    fun administrar(): String {
        return "$nombre está administrando la empresa."
    }
}