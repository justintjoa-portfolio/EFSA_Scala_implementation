package Circuit.Components.Primitive.ESFMachine

import Circuit.Components.Primitive.CircuitComponent.CircuitComponent

case class ESFMachineState(
                            esfMachineStack: Array[CircuitComponent],
                            highestHandle: Int,
                          )
