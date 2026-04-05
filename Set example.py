# we x can create set using the {} or set() inbuilt function
student = {112,223,445,667,889,67,67}
print(type(student))
print(student)
# creatting a set of mixed type 
mixed = {"Hello world",-112.334,"Bye"}
print(mixed)
# create an empty set in python is a little bit tricky 
#but its fine we can get it vy using set()
empty_set = set()
empty_dict ={}
#check the type of the empty set
print("Data type of empty_set: ",type(empty_set))
#check data type of dictionary set
print("Data type of empty_dictionary:", type(empty_dict))

# we can add the items to a set inn python  using add()
numbers = {1,2,3,4,5,6,7}
numbers.add(8)
print(numbers)

names = {"pawan","poudel","aayusha","Subedi","Arjun Sharma Prasad"}
fruits=["Banana","Apple","Mango","Orange"]
names.update(fruits)
print(names)
# remove an element from set  using discard()
removed =names.discard("pawan")
print(names)
print(" ")
print(" ")

# we can iterate throuh  loops
for name in names:
    print(name)


print()
print()
# finding the length of the set elements 
#we  can use len() to find the  number of present in set 
even = {2,3,4,5,6,7,8}
print("Set :",even)
print(len(even))

