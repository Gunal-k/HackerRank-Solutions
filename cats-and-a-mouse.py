def catAndMouse(x, y, z):
    a = abs(z-x)
    b = abs(z-y)
    if a < b:
        return "Cat A"
    elif a > b:
        return "Cat B"
    else:
        return "Mouse C"