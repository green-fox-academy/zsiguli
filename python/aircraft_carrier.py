class Aircraft():
    
    def __init__(self, max_ammo = 5, base_damage = 10):
        self.max_ammo = max_ammo
        self.base_damage = base_damage
        self.current_ammo = 0

class F16(Aircraft):
    
    def __init__(self, max_ammo = 8, base_damage = 30):
        self.max_ammo = max_ammo
        self.base_damage = base_damage
        self.current_ammo = 0

class F35(Aircraft):
    
    def __init__(self, max_ammo = 12, base_damage = 50):
        self.max_ammo = max_ammo
        self.base_damage = base_damage
        self.current_ammo = 0

aircraft = Aircraft()
f16 = F16()
f35 = F35()

print(aircraft.current_ammo)
print(f16)
print(f35.current_ammo)
        
