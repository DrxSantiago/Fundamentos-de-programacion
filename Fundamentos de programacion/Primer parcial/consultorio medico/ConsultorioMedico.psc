Algoritmo ConsultorioMedico
    Definir numCita Como Entero
    Definir costoCita, montoTratamiento Como Real
    
    Escribir "Ingrese el número de la cita del paciente:"
    Leer numCita
    
    Si numCita <= 3 Entonces
        costoCita <- 900
        montoTratamiento <- numCita * 900
    Sino
        Si numCita <= 5 Entonces
            costoCita <- 800
            montoTratamiento <- (3 * 900) + ((numCita - 3) * 800)
        Sino
            Si numCita <= 8 Entonces
                costoCita <- 600
                montoTratamiento <- (3 * 900) + (2 * 800) + ((numCita - 5) * 600)
            Sino
                costoCita <- 500
                montoTratamiento <- (3 * 900) + (2 * 800) + (3 * 600) + ((numCita - 8) * 500)
            FinSi
        FinSi
    FinSi
    
    Escribir "Costo de la cita actual (#", numCita, "): $", costoCita
    Escribir "Monto acumulado pagado por el tratamiento: $", montoTratamiento
FinAlgoritmo