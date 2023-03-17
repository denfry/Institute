Imports System

Module Practice2
    Dim a As Double, b As Double, c As Double, x As Double, y As Double
    Sub Main(args As String())
        Console.Write("Введите значение a: ")
        a = Console.ReadLine()
        Console.Write("Введите значение b: ")
        b = Console.ReadLine()
        Console.Write("Введите значение c: ")
        c = Console.ReadLine()
        Console.Write("Введите значение x: ")
        x = Console.ReadLine()
        If x = a And x = b And x = c Then
            y = Math.Sin(x)
        ElseIf x <= a And b <= x And x <= c Then
            y = Math.Cos(x)
        Else
            y = Math.Abs(x)
        End If
        Console.Write("y = ")
        Console.Write(y)
    End Sub
End Module
