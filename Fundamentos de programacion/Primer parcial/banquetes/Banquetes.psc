Algoritmo Banquetes
	Definir NumPer Como Entero
	Escribir 'Ingrese el numero de personas'
	Leer NumPer
	Si NumPer<200 Entonces
		Total <- NumPer*95
	FinSi
	Si NumPer>=200 Y NumPer<=300 Entonces
		Total <- NumPer*85
	FinSi
	Si NumPer>300 Entonces
		Total <- NumPer*75
	FinSi
	Escribir 'El total a pagar es: ', Total
FinAlgoritmo
