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
            self.photo = PhotoImage(file=self.costume_image)
            canvas.create_image(self.position_x, self.position_y, anchor = NW, image = self.photo)

root = Tk()
root.wm_title("RPG Game")
canvas = Canvas(root, width=dimension*width_in_squares, height=dimension*height_in_squares)

game_objects = [Game_object(0, 0, "hero-down"), Game_object(50, 50, "hero-up")]

def on_key_press(e):
    hero = game_objects[0]
    if e.keycode == 9:
        sys.exit() 
    elif e.keycode == 111:
        hero.costum_image = "hero-down"
        hero.position_y -= dimension
    elif e.keycode == 116:
        game_objects[0].costum_image = "hero-up"
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
