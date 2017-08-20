/**
 * Created by taesu on 2017-08-20.
 */
fun main(args: Array<String>) {
    val originator = Originator()
    val careTaker = CareTaker()

    originator.state = "State #1"
    originator.state = "State #2"
    careTaker.add(originator.saveStateToMemento())

    originator.state = "State #3"
    careTaker.add(originator.saveStateToMemento())

    originator.state = "State #4"
    println("Current State: " + originator.state!!)

    originator.getStateFromMemento(careTaker[0])
    println("First saved State: " + originator.state!!)
    originator.getStateFromMemento(careTaker[1])
    println("Second saved State: " + originator.state!!)
}