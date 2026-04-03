def gradingStudents(grades):
    fingrade = []
    for i in range(len(grades)):
        if(grades[i]>=38 and grades[i]%5>=3):
            val = (grades[i]+5)-(grades[i]%5)
        else:
            val = grades[i]
        fingrade.append(val)
    return fingrade