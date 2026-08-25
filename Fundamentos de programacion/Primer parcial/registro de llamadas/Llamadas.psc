Algoritmo Llamadas
	Definir minutos, horario, dia Como Entero
	Definir costo Como Real
	Escribir 'Introduce la cantidad de minutos que estuvo en llamada'
	Leer minutos
	Si minutos>5 Entonces
		costo <- minutos*1
	FinSi
	Si minutos>5 Y minutos<7 Entonces
		costo <- (5)+(minutos-5)*.8
	FinSi
	Si minutos>7 Y minutos<10 Entonces
		costo <- (5)+(1.6)+(minutos-7)*.7
	FinSi
	Si minutos>10 Entonces
		costo <- (5)+(1.6)+(2.1)+(minutos-10)*.5
	FinSi
	Escribir 'Introduzca el dia de la semana (numero)'
	Leer dia
	Si dia=7 Entonces
		costo <- costo+1.3
	FinSi
	Si dia>=1 Y dia<=5 Entonces
		Escribir 'Indique el horario de la llamada (1) Matutino (2) Vespertino'
		Leer horario
		Si horario=1 Entonces
			costo <- costo*1.15
		FinSi
		Si horario=2 Entonces
			costo <- costo*1.10
		FinSi
	FinSi
	Escribir 'El costo total de la llamada es de: $', costo
FinAlgoritmo
