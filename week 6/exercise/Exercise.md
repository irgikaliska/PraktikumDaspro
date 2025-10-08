### Exercise

Question 1:
Start

Input bringId
Input registeredOnline

if studentID == “bringId” OR registeredOnline == “bring” Then
	Display “allowed to enter”
Else
	Display “denied entry”
End if

End


Question 2:
Start

Input userType

if userType == "lecturer" Then
    Display "WiFi access granted (lecturer)"

else if userType == "student" Then
    Input credits
    if credits >= 12 Then
        Display "WiFi access granted (active student)"
    else
        Display "Access denied, credits less than 12"
    End If
else
    Display "Access denied"
End  if

End