open class Bird(val type: String, val canFly: Boolean) {
    open fun describe() {
        val flightAbility = if (canFly) "может летать" else "не может летать"
        println("Это птица типа $type и она $flightAbility.")
    }
}