import numpy as np

# Arrays

a1x5 = np.array([1, 2, 3, 4, 5])
b1x5 = np.array([5, 4, 3, 2, 1])

# Vectorization
c = a1x5 + b1x5
print(c)

# Broadcasting
celsius_temperatures = np.array(range(-40, 101, 10))
fahrenheit_temperatures = (celsius_temperatures * (9 / 5)) + 32

print("Temperatures in Celsius: ", celsius_temperatures)
print("Temperatures in Fahrenheit: ", fahrenheit_temperatures)

# Indexing and slicing

a3x3 = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
print(a3x3[1][2])       # 6
print(a3x3[0:2, 1])     # [2, 5]
print(a3x3[:2, :2])     # [[1, 2], [4, 5]]

# Map each value for an
print(a1x5 != 2)
print(a1x5[a1x5 != 2])

print(np.array([10, 20, 30, 40, 50])[np.array([4, 3, 2, 1, 0])])

# Slicing
# Caution: Slice is a view into the original array!
e = np.array([1, 2, 3, 4, 5])
e_slice = e[2:4]
e_slice[:] = [99, 99]

print(e)

# Linear algebra ops

# The following two are equivalent
print(np.dot(a1x5, b1x5))
print(a1x5 @ b1x5)

# Matrices
a2x2 = np.array([[1, 2], [3, 4]])
b2x2 = np.array([[5, 6], [7, 8]])

# Matrix multiplication
print(np.dot(a2x2, b2x2))
# Which is the same as
print(a2x2 @ b2x2)


# Inversion
print(np.linalg.inv(a2x2))

# Eigen values/vectors
matrix = np.array([[1, 2], [2, 3]])
eigenvalues, eigenvectors = np.linalg.eig(matrix)

print("Eigenvalues: ", eigenvalues)
print("Eigenvectors: ", eigenvectors)

# Solving for linear equations
A = np.array([[3, 1], [1, 2]])
b = np.array([9, 8])

x = np.linalg.solve(A, b)
print(x)

# Matrix determinant
matrix = np.array([[1, 2], [3, 4]])
det = np.linalg.det(matrix)

print(det)
