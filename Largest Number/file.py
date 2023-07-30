import math
a = int(input("Enter The value: "))
b = int(input("Enter The value: "))
c = int(input("Enter The value: "))
d = (b * b) - (4 * a * c)
if (d == 0):
    x = -b / (2 * a)
    print("The route, X=", x)
elif (d > 0):
    x1 = ((-b) + math.sqrt(d)) / (2 * a)
    x2 = ((-b) - math.sqrt(d)) / (2 * a)
    print("The Rutes are, X1 = ", x1, " & X2 = ", x2)
else:
    print("Rutes are imagenary")
