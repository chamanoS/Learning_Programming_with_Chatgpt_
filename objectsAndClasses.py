class Animal:
    animalCount = 0

    def__init__(self,animalName, length,weight,color,presenceOfFur):
        self.animalName = animalName
        self.length = length
        self.weight = weight
        self.color = color
        self.presenceOfFur = presenceOfFur
    
    def displayAnimalInfo(self):
        print "Name: " self.animalName
        print "Length:" self.length
        print "Weight:" self.weight
        print "Color:" self.color
        print "Fur:" self.presenceOfFur

kitty = Animal("Shawn", 34, 34, red,"true")
print Animal.animalCount

kitty.displayAnimalInfo()