from tkinter import *

dimension = 72
width_in_squares = 5
height_in_squares = 5

class Game_object(object):
    def __init__(self, position_x, position_y, costume_image):
        self.position_x = position_x
        self.position_y = position_y
        self.costume_image = "img/" + str(costume_image) + ".png"

    def draw(self, canvas):
        print(self.costume_image)
        self.photo = PhotoImage(file=self.costume_image)
        canvas.create_image(self.position_x, self.position_y, anchor = NW, image = self.photo)

class Map():
    def __init__(self, map_=[]):
        self.map_ = map_

    def init_map(self):
        self.map_ = [[0,1,1,0,1],[0,1,0,1,0],[0,1,0,0,1],[0,0,1,0,1],[1,1,0,1,0]]

    def render_tiles(self):
        for x in range(len(self.map_)):
           for y in range(len(self.map_[x])):
              if self.map_[y][x] == 0:
                  game_objects.append(Game_object(x*dimension, y*dimension, "floor"))
              else:
                  game_objects.append(Game_object(x*dimension, y*dimension, "wall"))


root = Tk()
root.wm_title("RPG Game")
canvas = Canvas(root, width=dimension*width_in_squares, height=dimension*height_in_squares)

game_objects = []
game_map = Map()
game_map.init_map()
game_map.render_tiles()
game_objects.append(Game_object(0, 0, "hero-down"))

def on_key_press(e):
    if e.keycode == 9:
        sys.exit() 
    elif e.keycode == 111:
        hero.costum_image = "hero-down"
        hero.position_y -= dimension
    elif e.keycode == 116:
        hero.costum_image = "hero-up"
        hero.position_y += dimension
    elif e.keycode == 113:
        hero.position_x -= dimension
    elif e.keycode == 114:
        hero.position_x += dimension

    for game_object in game_objects:
        game_object.draw(canvas)

canvas.bind("<KeyPress>", on_key_press)
canvas.pack()
canvas.focus_set()
for game_object in game_objects:
    game_object.draw(canvas)
root.mainloop()
