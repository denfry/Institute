Imports System

Module Practice4
    Sub Main(args As String())
        Dim n As Integer
        Dim X() As Double
        Dim A As Double
        Dim i As Integer
        Dim j As Integer
        Dim index As Integer
        Dim sum As Double
        Dim count As Integer
        Dim mean As Double
        Dim modifiedX() As Double
        Console.Write("Введите длину массива:")
        n = Console.ReadLine
        ReDim X(0 To n)

        For i = 0 To n - 1
            Console.Write("x(" & i & ") = ")
            X(i) = Console.ReadLine
        Next i

        Console.Write("Введите A:")
        A = Console.ReadLine

        index = -1
        For i = 0 To n
            If X(i) > A Then
                index = i
                Exit For
            End If
        Next i

        If index <> -1 Then
            Console.WriteLine("Первый элемент массива, значение которого больше, A x(" & index & "): " & X(index))
        Else
            Console.WriteLine("В массиве нет элементов, значение которого больше A")
        End If
        ReDim Preserve modifiedX(0 To n)
        For i = 4 To n - 1 Step 4
            For j = i To n - 2
                X(j) = X(j + 1)
            Next j
            Array.Copy(X, modifiedX, n)
        Next i

        sum = 0
        count = 0
        For i = 0 To n - (n / 4)
            If i Mod 2 = 0 Then
                sum = sum + modifiedX(i)
                count = count + 1
            End If
        Next i
        If count > 0 Then
            mean = sum / count
            For i = n - 1 To n - 4 Step -1
                modifiedX(i) = mean
            Next i
        End If

        Console.WriteLine("Изменённый массив: ")
        For i = 0 To n - (n / 4)
            Console.WriteLine("x(" & i & ") = " & modifiedX(i))
        Next i
    End Sub

End Module
