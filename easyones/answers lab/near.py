
def near(a,b):
    list = [char for char in a]
    for i in range(len(a)):
        newlist = [char for char in list]
        newlist[i] = ''
        if ''.join(newlist) == b:
            return True,print("True")
    return False,print("False")
        
near ("dragoon","dragon")








