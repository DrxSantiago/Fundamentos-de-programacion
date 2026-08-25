Algoritmo CalculoUva
	Definir precioInicial, kilos, precioFinal, gananciaTotal Como Real
    Definir tipo Como Cadena
    Definir tamano Como Entero
    
    Escribir "Ingrese el precio inicial por kilo:"
    Leer precioInicial
    
    Escribir "Ingrese la cantidad de kilos:"
    Leer kilos
    
    Escribir "Ingrese el tipo de uva (A o B):"
    Leer tipo
    tipo <- Mayusculas(tipo)
    
    Escribir "Ingrese el tamaño de la uva (1 o 2):"
    Leer tamano
    
    precioFinal <- precioInicial
    
    Si tipo = "A" Entonces
        Si tamano = 1 Entonces
            precioFinal <- precioFinal + 0.20
        Sino
            Si tamano = 2 Entonces
                precioFinal <- precioFinal + 0.30
            FinSi
        FinSi
    Sino
        Si tipo = "B" Entonces
            Si tamano = 1 Entonces
                precioFinal <- precioFinal - 0.30
            Sino
                Si tamano = 2 Entonces
                    precioFinal <- precioFinal - 0.50
                FinSi
            FinSi
        FinSi
    FinSi
    
    gananciaTotal <- precioFinal * kilos
    
    Escribir "El precio final por kilo es: $", precioFinal
    Escribir "La ganancia total obtenida es: $", gananciaTotal
FinAlgoritmo
