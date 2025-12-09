# TrackmaniaBot
A neural net bot i will train to be good at Trackmania (because i suck at it)

Code Structure:

Node stores two values, weight, and activation.
Currently activation doesnt do anything,
but it will represent the outpur of the Node.
Weight is the weighting of that node on the next
node in the network.

it has a getter for weight, a modifier for weight
called modWeight(), a tostring method, and a
helper method called generateWeight().

The getter is a simple getter, and returns the
value of weight.
The modifier changes teh value of weight by a given
amount d.
The toString method returns a string constructed
like so:
("Node " + nodeNum + " has weight of " + weight)
The helper method uses the Math clas to generate
a random double, then generates an int using the
Math.pow method to multiply with the random number.
It then returns the initially generated value, but
only to the 5th decimal place.

NodeInit creates n instances of Node, using the
zero-arg constructor to generate random start
weights.