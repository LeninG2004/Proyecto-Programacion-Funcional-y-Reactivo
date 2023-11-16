//Proyecto Programacion Funcional y Reactiva
//Nombre: Lenin Gonzalez

// Pregunta 1
def integracion(f: Double => Double, a: Int, b: Int) = (b - a) * (f(a) + 4 * f((a + b) / 2) + f(b)) / 6

//Pregunta 2
val e1 = (x: Double) => -x * x + 8*x - 12
val respuesta1 = integracion(e1,3,5)

val e2 = (x: Double) => 3*(x*x)
val respuesta2 = integracion(e2,0,2)

val e3 = (x: Double) => x + 2 * math.pow(x,2) - math.pow(x,3) + 5 * math.pow(x,4)
val respuesta3 = integracion(e3,-1,1)

val e4 = (x: Double) => (2*x + 1)/(math.pow(x,2)+ x)
val respuesta4 = integracion(e4,1,2)

val e = math.E
val e5 = (x: Double) => math.pow(e,x)
val respuesta5 = integracion(e5,0,1)

val e6 = (x: Double) => 1 / (math.pow((x-1),1/2))
val respuesta6 = integracion(e6,2,3)

val e7 = (x:Double) => 1/ (1+math.pow(x,2))
val respuesta7 = integracion(e7,0,1)


//Pregunta 3
def calcularValAbsoluto (x: Double, y:Double) = scala.math.abs(x-y)


val error1 = calcularValAbsoluto(7.33,respuesta1)
val error2 = calcularValAbsoluto(8,respuesta2)
val error3 = calcularValAbsoluto(3.333,respuesta3)
val error4 = calcularValAbsoluto(1.09861,respuesta4)
val error5 = calcularValAbsoluto(1.71828,respuesta5)
val error6 = calcularValAbsoluto(0.828427,respuesta6)
val error7 = calcularValAbsoluto(0.785398,respuesta7)


//lagi
