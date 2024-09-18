import sys

def calculate_sum(x, y, z):
    try:
        x = float(x)
        y = float(y)
        z = float(z)
        return x + y + z
    except ValueError:
        return 'You should input numbers!'
