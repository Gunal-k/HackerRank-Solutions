def dayOfProgrammer(year):
    a = "12.09."
    b = "13.09."
    if year == 1918:
        return "26.09."+str(year)
    elif 1700 <= year <= 1917:
        if year % 4 == 0:
            return a+str(year)
        else:
            return b+str(year)       
    elif((year % 4 == 0 and year % 100 != 0 ) or year % 400 == 0):
        return a+str(year)
    else:
        return b+str(year)