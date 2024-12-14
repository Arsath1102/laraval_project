class student:
    def __init__(self,name,age):
        self.name=name
        self.age=age
    def __str__(self):
        return f"the name {self.name} and {self.age}"
    
class nimo(student):
    pass    
stu=nimo("mohamed arsath v",25)
print(stu)        