# we can use intersection() and & to use  find out the common in set 
A = {'a','b','c','d','e','f','g','g','h','i'}
B={'j','b','c','m','n','o','p','q'}
c = A&B
d= A.intersection(B)
print("c:",c)
print("D:",d)
# calculating the difference of the two sets
e =A.difference(B)
f = A-B
print("Difference e:",e)
print("Difference:",f)
# example of set_symmetric
# It includes all the elements except intersection 
g = A^B
print(g)
h =A.symmetric_difference(B)
print(h)

