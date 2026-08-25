Algoritmo NumeroPar
    Definir numero Como Entero
    
    Escribir "Ingrese un número entero:"
    Leer numero
    
    Si numero = 0 Entonces
        Escribir "El número es Neutro (0)."
    Sino
        Si numero MOD 2 = 0 Entonces
            Escribir "El número es PAR."
        Sino
            Escribir "El número es IMPAR."
        FinSi
    FinSi
FinAlgoritmo