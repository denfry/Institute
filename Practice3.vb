Imports System

Module Practice3
    Dim N As Double, M As Double, i As Integer, j As Integer, prod As Double, sum As Double, y As Double
    Sub Main(args As String())
        Console.Write("¬ведите значение N: ")
        N = Console.ReadLine()
        Console.Write("¬ведите значение M: ")
        M = Console.ReadLine()
        sum = 0

        i = 1
        Do While i <= N
            prod = 1.0#
            j = 0
            Do While j <= M
                prod = prod * ((2 * j + M) / i)
                j = j + 1
            Loop
            sum = sum + (i + 3) / (i + 4) + prod
            i = i + 1
        Loop
        y = sum
        Console.Write("y = ")
        Console.WriteLine(y)

    End Sub
End Module
