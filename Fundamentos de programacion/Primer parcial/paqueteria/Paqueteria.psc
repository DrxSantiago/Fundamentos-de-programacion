Algoritmo Paqueteria
    Definir pesoKg, pesoGramos, costoGramo, cobroTotal Como Real
    Definir zona Como Entero
    
    Escribir "Ingrese el peso del paquete en Kilogramos (kg):"
    Leer pesoKg
    
    Si pesoKg > 5.0 Entonces
        Escribir "El paquete fue RECHAZADO por exceder los 5 kg permitidos."
    Sino
        Escribir "Seleccione la zona de destino:"
        Escribir "1. América del Norte"
        Escribir "2. América Central"
        Escribir "3. América del Sur"
        Escribir "4. Europa"
        Escribir "5. Asia"
        Leer zona
        
        pesoGramos <- pesoKg * 1000
        costoGramo <- 0
        
        Segun zona Hacer
            1: costoGramo <- 11
            2: costoGramo <- 10
            3: costoGramo <- 12
            4: costoGramo <- 25
            5: costoGramo <- 30
            De Otro Modo:
                Escribir "Zona no válida."
        FinSegun
        
        Si costoGramo > 0 Entonces
            cobroTotal <- pesoGramos * costoGramo
            Escribir "El cobro total por el envío es: $", cobroTotal
        FinSi
    FinSi
FinAlgoritmo