Algoritmo ventas
	Definir venta Como Cadena
	Definir mont1, mont2, mont3, monto, total Como Entero
	Escribir 'se va a realizar una venta?'
	Escribir 's/n'
	Leer venta
	Repetir
		Escribir 'Ingrese el monto de la venta'
		Leer monto
		total <- total+monto
		Si monto>1000 Entonces
			mont1 <- mont1+1
		FinSi
		Si monto>500 Y monto<=1000 Entonces
			mont2 <- mont2+1
		FinSi
		Si monto<500 Entonces
			mont3 <- mont3+1
		FinSi
		Escribir 'se va a realizar una venta?'
		Escribir 's/n'
		Leer venta
	Hasta Que venta='n'
	Escribir 'La cantidad de ventas mayores a 1000 fue: ', mont1
	Escribir 'La cantidad de ventas entre 1000 y 500 fue: ', mont2
	Escribir 'La cantidad de ventas menores de 500 fue: ', mont3
	Escribir 'la venta total del dia fue de : ', total
FinAlgoritmo
