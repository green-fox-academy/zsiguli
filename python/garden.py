class Garden():
    
    def __init__(self):
        self.plants_in_the_garden = []

    def plant_plant(self, plant):
        self.plants_in_the_garden.append(plant)        

    def watering(self, water):
        print("Watering with " + str(water))
        thirsty_plants = []
        for plant in self.plants_in_the_garden:
            if plant.is_thirsty():
                thirsty_plants.append(plant)
        water_per_plant = water/(len(thirsty_plants))
        for plant in thirsty_plants:
            plant.get_water(water_per_plant)

    def water_state(self):
        water_state = ""
        for plant in self.plants_in_the_garden:
            water_state += str(plant.color)
            if plant.is_thirsty():
                water_state += " needs water \n"
            else:
                water_state += " does not needs water \n"   
        print(water_state)

class Plants():
    def __init__(self, color = "red", water_level = 0):
        self.color = color
        self.water_level = water_level

    def get_water(self, water):
        self.water_level += water

    def is_thirsty(self):
        if self.water_level < 1:
            return True
        else:
            return False

class Flower(Plants):

    def get_water(self, water):
        self.water_level += water * .75
    
    def is_thirsty(self):
        if self.water_level < 5:
            return True
        else: 
            return False
   
class Tree(Plants):
    def get_water(self, water):
        self.water_level += water * .4

    def is_thirsty(self):
        if self.water_level < 10:
            return True
        else:
            return False

garden = Garden()

garden.plant_plant(Flower("yellow Flower"))
garden.plant_plant(Flower("blue FLower"))
garden.plant_plant(Tree("purple Tree"))
garden.plant_plant(Tree("orange Tree"))

garden.water_state()
garden.watering(40)
garden.water_state()
garden.watering(70)
garden.water_state()



