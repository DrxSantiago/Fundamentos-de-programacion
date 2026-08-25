Algoritmo Estacionamiento
    Definir horas, costoTotal Como Real
    
    Escribir "Ingrese el total de horas que permaneció el vehículo:"
    Leer horas
    
    Si horas <= 2 Entonces
        costoTotal <- horas * 30
    Sino
        Si horas <= 5 Entonces
            costoTotal <- (2 * 30) + ((horas - 2) * 25)
        Sino
            Si horas <= 10 Entonces
                costoTotal <- (2 * 30) + (3 * 25) + ((horas - 5) * 20)
            Sino
                costoTotal <- 380
            FinSi
        FinSi
    FinSi
    
    Escribir "El total a cobrar por el estacionamiento es: $", costoTotal
FinAlgoritmo