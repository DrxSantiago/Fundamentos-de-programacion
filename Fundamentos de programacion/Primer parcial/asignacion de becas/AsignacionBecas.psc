Algoritmo BecasUniversitarias
    Definir edad Como Entero
    Definir promedio Como Real
    
    Escribir "Ingrese la edad del alumno:"
    Leer edad
    
    Escribir "Ingrese el promedio obtenido:"
    Leer promedio
    
    Si edad > 18 Entonces
        Si promedio >= 9.0 Entonces
            Escribir "Le corresponde una beca mensual de: $10,000.00"
        Sino
            Si promedio >= 7.5 Entonces
                Escribir "Le corresponde una beca mensual de: $8,000.00"
            Sino
                Si promedio >= 6.0 Entonces
                    Escribir "Le corresponde una beca mensual de: $5,000.00"
                Sino
                    Escribir "Se enviará una carta de invitación para estudiar más en el próximo ciclo."
                FinSi
            FinSi
        FinSi
    Sino
        Si promedio >= 9.0 Entonces
            Escribir "Le corresponde una beca mensual de: $8,000.00"
        Sino
            Si promedio >= 8.0 Entonces
                Escribir "Le corresponde una beca mensual de: $6,000.00"
            Sino
                Si promedio >= 6.0 Entonces
                    Escribir "Le corresponde una beca mensual de: $4,000.00"
                Sino
                    Escribir "Se enviará una carta de invitación para estudiar más en el próximo ciclo."
                FinSi
            FinSi
        FinSi
    FinSi
FinAlgoritmo