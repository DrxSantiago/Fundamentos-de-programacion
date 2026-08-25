Algoritmo Ahorro_anual
	Definir monto Como Entero
	Definir total Como Entero
	Definir mes Como Entero
	mes <- 1
	Repetir
		Escribir 'La cantidad total de ahorro es de: ', total
		Escribir 'Estamos en el mes ', mes
		Escribir 'Ingrese la cantidad a depositar este mes'
		Leer monto
		total <- total+monto
		mes <- mes+1
	Hasta Que mes=13
	Escribir 'La cantidad ahorrada este año es de: ', total
FinAlgoritmo
