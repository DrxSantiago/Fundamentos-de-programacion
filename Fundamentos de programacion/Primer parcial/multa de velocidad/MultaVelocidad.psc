Algoritmo MultaVelocidad
	Definir v, limite1, limite2, resultado Como Entero
    Definir esCumpleanos Como Logico
    Definir resp Como Cadena
    
    Escribir "Ingrese la velocidad registrada (km/h):"
    Leer v
    
    Escribir "¿Es tu cumpleaños? (si / no):"
    Leer respComoTexto
    
    Si Mayusculas(respComoTexto) = "SI" O Mayusculas(respComoTexto) = "S" Entonces
        esCumpleanos <- Verdadero
    Sino
        esCumpleanos <- Falso
    FinSi
    
    Si esCumpleanos Entonces
        limite1 <- 65
        limite2 <- 85
    Sino
        limite1 <- 60
        limite2 <- 80
    FinSi
    
    Si v <= limite1 Entonces
        resultado <- 0
    Sino
        Si v <= limite2 Entonces
            resultado <- 1
        Sino
            resultado <- 2
        FinSi
    FinSi
    
    Escribir "El resultado del reporte de multa es: ", resultado
    Escribir "(0 = Sin multa, 1 = Multa pequeña, 2 = Multa grande)"
	
FinAlgoritmo
