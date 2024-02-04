fun main() {
    val persona = Persona("Julia", 24)
    println(persona)
    println(persona.celebrarCumple())

    val empleado = Empleado("Pablo", 30, 30000.0)
    println(empleado)
    println(empleado.trabajar())

    val gerente1 = Gerente("Ana", 40, 50000.0, 10000.0, true)
    println(gerente1)
    println(gerente1.administrar())

    val gerente2 = Gerente("Ana", 40, 50000.0, 10000.0, false)
    println(gerente2)
    println(gerente2.administrar())
}