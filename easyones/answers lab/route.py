def longest_increasing_subsequence(a, n):

    lis = []

    parent = []

    # initialize lis with 1 as each element
    # has a subsequence length equal to 1
    for i in range(n):
        lis.append(1)
    # initialize parent with -1
    for i in range(n):
        parent.append(-1)

    for i in range(n):
        for j in range(i):

            if a[j] < a[i]:
                if lis[i] < lis[j] + 1:
                    lis[i] = lis[j] + 1
                    parent[i] = j

    length = 0
    pos = 0

    # length of subsequence is the maximum value
    # in lis array
    for i in range(n):
        if length < lis[i]:
            length = lis[i]
            pos = i

    print("Length of the longest increasing subsequence ", length)

    # restoring the sequence
    # for storing longest increasing subsequence
    sequence = []

    while pos != -1:
        sequence.append(a[pos])
        pos = parent[pos]

    sequence.reverse()

    for i in range(length):
        print(sequence[i])

# Driver code
a = [0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15,32
]

n = len(a)

# function calling
longest_increasing_subsequence(a, n)