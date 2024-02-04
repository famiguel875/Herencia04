open class Persona(val nombre: String, private var edad: Int) {

    override fun toString(): String {
        return "Nombre: ${this.nombre}, Edad: ${this.edad}"
    }

    open fun celebrarCumple(): String {
        this.edad++
        return "¡Feliz cumpleaños ${this.nombre}! Ahora tienes ${this.edad} años."
    }
}