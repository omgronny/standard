Sub Макрос1()

Dim Word As String
For i = 1 To ActiveDocument.Words.Count
    If ActiveDocument.Words(i).Characters.Count > 4 Then
        For j = 2 To ActiveDocument.Words(i).Characters.Count / 2 + 1
                Word = ActiveDocument.Words(i).Characters(j)
                ActiveDocument.Words(i).Characters(j) = ActiveDocument.Words(i).Characters(ActiveDocument.Words(i).Characters.Count - j + 1)
                ActiveDocument.Words(i).Characters(ActiveDocument.Words(i).Characters.Count - j + 1) = Word
        Next j
    End If
    
Next i
End Sub
