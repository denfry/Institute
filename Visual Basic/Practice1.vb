Imports System

Module Practice1
    Dim a As Double, b As Double, c As Double, d As Double
    Sub Main(args As String())
        Console.Write("¬ведите значение a: ")
        a = Console.ReadLine()
        Console.Write("¬ведите значение b: ")
        b = Console.ReadLine()
        Console.Write("¬ведите значение c: ")
        c = Console.ReadLine()
        d = Math.Sin((b + c) / a) + (((b + c) ^ (1 / 3) / a)) + b ^ 2
        Console.Write("d = ")
        Console.Write(d)
    End Sub
End Module
