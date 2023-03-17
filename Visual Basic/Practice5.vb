Imports System

Module Practice5
    Sub Main(args As String())

        Dim n As Integer
        Dim m As Integer
        Dim sums() As Double
        Dim i As Integer, j As Integer


        Console.Write("Введите кол-во строк в матрице: ")
        n = Console.ReadLine
        Console.Write("Введите кол-во столбцов в матрице: ")
        m = Console.ReadLine
        Dim matrix(0 To n, 0 To m) As Double


        For i = 0 To n - 1
            For j = 0 To m - 1
                Console.Write("Введите элемент в строке " & i + 1 & " столбце " & j + 1 & ": ")
                matrix(i, j) = Console.ReadLine
            Next j
        Next i


        ReDim sums(0 To m \ 2)
        For j = 0 To m - 1 Step 2
            Dim sum As Double
            Dim count As Integer
            sum = 0
            count = 0
            For i = 0 To n - 1
                If matrix(i, j) < 0 Then
                    sum = sum + matrix(i, j)
                    count = count + 1
                End If
            Next i
            If count > 0 Then
                sums(j \ 2) = sum / 2
            End If
        Next j

        Console.WriteLine("Половины сумм отрицательных элементов в четных столбцах: ")
        For i = 0 To m \ 2 - 1
            Console.WriteLine(sums(i))
        Next i

    End Sub

End Module
