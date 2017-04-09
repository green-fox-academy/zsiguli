class Aircraft():
    
    def __init__(self, max_ammo = 5, base_damage = 10):
        self.max_ammo = max_ammo
        self.base_damage = base_damage
        self.current_ammo = 0

    def fight(self):
        damage = self.current_ammo * self.base_damage
        self.current_ammo = 0
        return damage

    def refill(self, given_ammos):
        needed_amount_ammo = self.max_ammo - self.current_ammo
        self.current_ammo += needed_amount_ammo
        return given_ammos - needed_amount_ammo
 
    def get_type(self):
        return self.__class__.__name__

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

f16 = F16()
f35 = F35()

print(f16.refill(50))
print(f16.current_ammo)
print(f16.get_type())
print(f35.get_type())
