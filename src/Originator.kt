/**
 * Created by taesu on 2017-08-20.
 */
class Originator {
    var state: String? = null

    fun saveStateToMemento(): Memento {
        return Memento(state!!)
    }

    fun getStateFromMemento(memento: Memento) {
        state = memento.state
    }
}