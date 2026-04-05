matrix={{1,2,3},
        {4,5,6},
        {7,8,9},
}
for i in range(3):
    for j in range(3):
        if matrix[i][j] % 2 == 0:
            print(matrix[i][j], end=" ")
    print()
