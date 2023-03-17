Imports System

Module Program
    Sub Main(args As String())
        Dim n As Integer
        Dim i As Integer, j As Integer
        Dim sum As Double

        Console.Write("������� ������ ���������� �������: ")
        n = Console.ReadLine()

        Dim X(0 To n, 0 To n) As Double

        For i = 0 To n - 1
            For j = 0 To n - 1
                Console.Write("������� ������� � ������ " & i + 1 & " ������� " & j + 1 & ": ")
                X(i, j) = Console.ReadLine
            Next j
        Next i

        Console.WriteLine("����������� �������:")
        For i = 0 To n - 1
            For j = 0 To n - 1
                Console.Write(Format(X(i, j), "#0.00") + " ")
            Next j
            Console.WriteLine()
        Next i

        sum = 0
        For i = 0 To n - 1
            For j = 0 To n - 1
                If i Mod 2 = 1 And X(i, j) Mod 1 <> 0 Then
                    sum = sum + X(i, j)
                End If
            Next j
        Next i

        For i = 0 To n
            X(i, n - i - 1) = sum
        Next i

        Console.WriteLine("������� ����� ������:")
        For i = 0 To n - 1
            For j = 0 To n - 1
                Console.Write(Format(X(i, j), "#0.00") + " ")
            Next j
            Console.WriteLine()
        Next i

    End Sub
End Module
