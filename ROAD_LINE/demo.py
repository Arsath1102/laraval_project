class student:
    def __init__(self,name,number):
        self.first_name=name
        self.phone_number=number
    def printname(self):
        print(self.first_name,self.phone_number)
class student1(student):
    pass
p2=student1("mohamed arsath v",26)
p2.printname()       