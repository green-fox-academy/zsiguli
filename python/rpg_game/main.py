from tkinter import *

dimension = 72
width_in_squares = 5
height_in_squares = 5

class Game_object(object):
    def __init__(self, position_x, position_y, costume_image):
        self.position_x = position_x
        self.position_y = position_y
        self.costume_image = costume_image

    def draw(self, canvas):
        self.photo = PhotoImage(file="img/" + self.costume_image + ".png")
        canvas.create_image(self.position_x*dimension, self.position_y*dimension, anchor = NW, image = self.photo)

    def is_character(self):
        return isinstance(self, Character)

class Character(Game_object):
    def __init__(self, position_x, position_y, costume_image):
        super().__init__(position_x, position_y, costume_image)

    def move_up(self):
        pass

    def move_down(self):
        pass

    def move_left(self):
        pass

    def move_right(self):
        pass

    def is_floor(self, x, y):
        return game_map.map_[y][x] == 0

class Hero(Character):
    def __init__(self, position_x, position_y, cotume_image):
        super().__init__(position_x, position_y, cotume_image)

    def move_up(self):
        self.costume_image = "hero-up"
        if self.position_y > 0:
            if self.is_floor(self.position_x, self.position_y-1):
                self.position_y -= 1

    def move_down(self):
        self.costume_image = "hero-down"
        if self.position_y < len(game_map.map_)-1:
            if self.is_floor(self.position_x, self.position_y+1):
                self.position_y += 1

    def move_left(self):
        self.costume_image = "hero-left"
        if self.position_x > 0:
            if self.is_floor(self.position_x-1, self.position_y):
                self.position_x -= 1

    def move_right(self):
        self.costume_image = "hero-right"
        if self.position_x < len(game_map.map_[0])-1:
            if self.is_floor(self.position_x+1, self.position_y):
                self.position_x += 1 

class Map():
    def __init__(self, map_=[]):
        self.map_ = map_

    def init_map(self):
        self.map_ = [[0,1,1,0,1],[0,1,0,0,0],[0,1,1,1,0],[0,0,0,0,0],[1,1,0,1,1]]

    def render_tiles(self):
        for x in range(len(self.map_)):
           for y in range(len(self.map_[x])):
              if self.map_[y][x] == 0:
                  game_objects.append(Game_object(x, y, "floor"))
              else:
                  game_objects.append(Game_object(x, y, "wall"))


root = Tk()
root.wm_title("RPG Game")
canvas = Canvas(root, width=dimension*width_in_squares, height=dimension*height_in_squares)

game_objects = []
game_map = Map()
game_map.init_map()
game_map.render_tiles()
game_objects.append(Hero(0, 0, "hero-down"))

def on_key_press(e):
    if e.keycode == 9:
        sys.exit() 
    elif e.keycode == 111:
        for game_object in game_objects:
            if game_object.is_character():
                game_object.move_up()
    elif e.keycode == 116:
        for game_object in game_objects:
            if game_object.is_character():
                game_object.move_down()
    elif e.keycode == 113:
        for game_object in game_objects:
            if game_object.is_character():
                game_object.move_left()
    elif e.keycode == 114:
        for game_object in game_objects:
            if game_object.is_character():
                game_object.move_right() 

    for game_object in game_objects:
        game_object.draw(canvas)

canvas.bind("<KeyPress>", on_key_press)
canvas.pack()
canvas.focus_set()
for game_object in game_objects:
    game_object.draw(canvas)
root.mainloop()
