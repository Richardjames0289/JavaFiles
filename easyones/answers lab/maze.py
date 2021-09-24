direction = {
    "^": (">", "v", "<"),
    ">": ("v", "<", "^"),
    "v": ("<", "^", ">"),
    "<": ("^", ">", "v")
}

def position(maze):
    for y, row in enumerate(maze):
        for x, cell in enumerate(row):
            if cell in "<>^v":
                return (cell, x, y)

def surrounding(maze, cell, x, y):
    north = maze[y-1][x]
    south = maze[y+1][x]
    west = maze[y][x-1]
    east = maze[y][x+1]

    return {
        "^": (north, east, south, west, 0, -1),
        ">": (east, south, west, north, 1, 0),
        "v": (south, west, north, east, 0, 1),
        "<": (west, north, east, south, -1, 0)
    }[cell]

def run(maze):
    cell, x , y = position(maze)
    temp = cell, x, y
    maze[y][x] = " "
    remaining = 6

    while remaining > 0:
        front, right, back, left, dx, dy = surrounding(maze, cell, x, y)
        if front == "E":
            return True, temp
        elif front == "#":
            if right == "#":
                if left == "#":
                    cell = direction[cell][1]
                else:
                    cell = direction[cell][2]
            else:
                cell = direction[cell][0]
        else:
            x += dx
            y += dy
            remaining -= 1

    maze[y][x] = direction[cell][1]

    return maze, temp

def solve(maze):
    moves = []
    r, move = run([list(row) for row in maze.split("\n")])
    moves.append(move)

    while r != True:
        r, move = run(r)
        if move in moves:
            return False
        else:
            moves.append(move)

    return r

print(solve("""#########
#E ######
##      #
##### # #
#>    ###
##### ###
##### ###
##### ###
##### ###
##### ###
##### ###
#########"""))

print(solve("""#########
#E ######
##      #
## ## # #
##### # #
#>    ###
##### ###
##### ###
##### ###
##### ###
##### ###
##### ###
#########"""))