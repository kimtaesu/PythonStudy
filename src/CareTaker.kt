import java.util.ArrayList

/**
 * Created by taesu on 2017-08-20.
 */

class CareTaker {
    private val mementoList = ArrayList<Memento>()

    fun add(state: Memento) {
        mementoList.add(state)
    }

    operator fun get(index: Int): Memento {
        return mementoList[index]
    }
}