class car:
    def __init__(self,brand,yera):
        self.brand=brand
        self.year=yera
    def move(self):
        print("drive")
class bike:
    def __init__(self,brand,year):
        self.brand=brand
        self.year=year
    def move(self):
        print("speed on the road")
class boat:
    def __init__(self,brand,year):
        self.brand=brand
        self.year=year
    def move(self):
        print("boat go for water")
cars=car("toyoto",2020)
bikes=bike("yamaha",2023)
boats=boat("taitanic",1890)

for i in (cars,bikes,boats):
    i.move()

                  
